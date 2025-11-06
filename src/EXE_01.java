public class EXE_01 {
    public static void main(String[] args) {
        account conta1 = new account("Lucas Gomes", 400);
        account conta2 = new account("Maria Oliveira", 1000);

        System.out.println("=== Conta 1 ===");
        conta1.consultarSaldo();
        conta1.consultarChequeEspecial();
        conta1.sacar(420);
        conta1.verificarChequeEspecial();
        conta1.consultarSaldo();

        System.out.println("\n=== Conta 2 ===");
        conta2.consultarSaldo();
        conta2.consultarChequeEspecial();
        conta2.pagarBoleto(1200);
        conta2.verificarChequeEspecial();
        conta2.consultarSaldo();
    }
}
