public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Teste das funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Shape of You");

        // Teste das funcionalidades do telefone
        meuIphone.ligar("123-4567");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste das funcionalidades do navegador
        meuIphone.exibirPagina("www.openai.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

