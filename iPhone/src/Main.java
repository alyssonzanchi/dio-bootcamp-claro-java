public class Main {
    public static void main(String[] args) {
        // Criação de uma instância do iPhone
        iPhone meuIphone = new iPhone("iPhone 14", "Preto", 256.0);

        // Testando funcionalidades do Reprodutor Musical
        System.out.println("Testando Reprodutor Musical:");
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println();

        // Testando funcionalidades do Aparelho Telefônico
        System.out.println("Testando Aparelho Telefônico:");
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println();

        // Testando funcionalidades do Navegador na Internet
        System.out.println("Testando Navegador na Internet:");
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        System.out.println();

        // Informações do iPhone
        System.out.println("Informações do iPhone:");
        System.out.println("Modelo: " + meuIphone.getModelo());
        System.out.println("Cor: " + meuIphone.getCor());
        System.out.println("Armazenamento: " + meuIphone.getArmazenamento() + " GB");
    }
}
