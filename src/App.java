public class App {
    public static void main(String[] args) {
        // Declarando e instanciando os objetos
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.sizeScreen = 6.1f;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.sizeScreen = 6.9f;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.sizeScreen = 6.81f;
        celularC.armazenamento = 128;
        celularC.sistemaOperacional = "Android";

        // Impressão com quebra de linha (\n)
        System.out.format("Celular: %s | Tela: %.2f\" | Armazenamento: %dGB | SO: %s\n",
                celularA.nome, celularA.sizeScreen, celularA.armazenamento, celularA.sistemaOperacional);
        System.out.format("Celular: %s | Tela: %.2f\" | Armazenamento: %dGB | SO: %s\n",
                celularB.nome, celularB.sizeScreen, celularB.armazenamento, celularB.sistemaOperacional);
        System.out.format("Celular: %s | Tela: %.2f\" | Armazenamento: %dGB | SO: %s\n",
                celularC.nome, celularC.sizeScreen, celularC.armazenamento, celularC.sistemaOperacional);
    }
}
