# ☕ Introdução à Programação Orientada a Objetos em Java

Repositório criado para armazenar os primeiros exercícios e exemplos práticos de **Programação Orientada a Objetos (POO)** em **Java**, desenvolvidos durante o Bootcamp Java.  
O objetivo é compreender e aplicar os principais conceitos da POO de forma prática.

---

## 📚 Conceitos abordados

- **Classes e Objetos**
- **Atributos e Métodos**
- **Encapsulamento**
- **Construtores**
- **Imutabilidade (keyword `final`)**
- **Uso da keyword `record`**
- **Criação de objetos e manipulação de propriedades**
- **Simulação de sistemas orientados a objetos**

---

## 🧩 Estrutura do projeto

```
📦 INTRODUCAO_POO_JAVA
 ┣ 📜 App.java
 ┣ 📜 Celular.java
 ┣ 📜 ContaBancaria.java
 ┣ 📜 Person.java
 ┗ 📜 README.md
```

---

## 💻 Exercícios principais

### 📱 1. Classe Celular
Exemplo de criação de uma classe simples, com atributos e objetos:

```java
public class Celular {
    String nome;
    String sistemaOperacional;
    int armazenamento;
    float sizeScreen;
}
```

Instanciando objetos:
```java
Celular celularA = new Celular();
celularA.nome = "iPhone 12";
celularA.sizeScreen = 6.1f;
celularA.armazenamento = 256;
celularA.sistemaOperacional = "iOS";
```

Saída:
```
Celular: iPhone 12 | Tela: 6.10" | Armazenamento: 256GB | SO: iOS
```

---

### 🏦 2. Classe ContaBancaria
Simula o funcionamento de uma conta com **saque, depósito e cheque especial**:

```java
public class ContaBancaria {
    String titular;
    double saldo;
    double limiteChequeEspecial;
    boolean usandoChequeEspecial;

    public ContaBancaria(String titular, double depositoInicial) {
        this.titular = titular;
        this.saldo = depositoInicial;
        this.limiteChequeEspecial = depositoInicial <= 500 ? 50 : depositoInicial * 0.5;
    }

    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
```

Uso:
```java
ContaBancaria conta = new ContaBancaria("Lucas Gomes", 400);
conta.sacar(420);
```

---

## 🧠 Conceitos teóricos reforçados

| Conceito | Descrição |
|-----------|------------|
| **Classe** | Modelo ou estrutura que define atributos e comportamentos de um objeto. |
| **Objeto** | Instância concreta de uma classe. |
| **Encapsulamento** | Protege os atributos e controla o acesso via métodos `get` e `set`. |
| **final** | Palavra-chave que torna variáveis, métodos ou classes imutáveis. |
| **record** | Tipo especial de classe imutável introduzido no Java 16. |

---

## 🧰 Tecnologias utilizadas

- Java 17+
- VS Code / IntelliJ IDEA
- Git & GitHub
- Linha de comando (Git Bash / PowerShell)

---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/lucasggasp/INTRODUCAO_POO_JAVA.git
   ```
2. Abra a pasta no VS Code ou IntelliJ IDEA:
   ```bash
   cd INTRODUCAO_POO_JAVA
   ```
3. Compile e execute:
   ```bash
   javac App.java
   java App
   ```

---

## 👨‍💻 Autor

**Lucas Gomes**  
🎓 Estudante de Engenharia de Controle e Automação  
💼 Estagiário em Engenharia de Produtos na Metalfrio Solutions  
📊 Entusiasta de Power BI, Automação e Desenvolvimento Backend  

🔗 [GitHub](https://github.com/lucasggasp) • [LinkedIn](https://www.linkedin.com/in/lucasggasp)

---
🧠 *“Orientação a Objetos é pensar em software como o mundo real — cheio de objetos, interações e responsabilidades.”*
