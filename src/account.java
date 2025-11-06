public class account {
    // Atributos
    String titular;
    double saldo;
    double limiteChequeEspecial;
    boolean usandoChequeEspecial;

    // Construtor
    public account(String titular, double depositoInicial) {
        this.titular = titular;
        this.saldo = depositoInicial;

        // Regra do limite do cheque especial
        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        this.usandoChequeEspecial = false;
    }

    // Consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Consultar cheque especial
    public void consultarChequeEspecial() {
        System.out.println("Limite do cheque especial: R$ " + limiteChequeEspecial);
    }

    // Depositar dinheiro
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    // Sacar dinheiro
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;

            if (saldo < 0) {
                usandoChequeEspecial = true;
                double valorUsado = Math.abs(saldo);
                double taxa = valorUsado * 0.2; // 20% de taxa
                saldo -= taxa;
                System.out.println("Usando cheque especial! Taxa de R$" + taxa + " aplicada.");
            } else {
                usandoChequeEspecial = false;
            }

            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    // Pagar boleto
    public void pagarBoleto(double valor) {
        System.out.println("Pagamento de boleto no valor de R$" + valor);
        sacar(valor);
    }

    // Verificar se está usando cheque especial
    public void verificarChequeEspecial() {
        if (usandoChequeEspecial) {
            System.out.println("A conta está usando o cheque especial!");
        } else {
            System.out.println("A conta não está usando o cheque especial.");
        }
    }
}
