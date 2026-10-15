import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TesteIPhone {

    private static void verificar(String nome, Runnable acao, String esperado) {
        PrintStream saidaOriginal = System.out;
        ByteArrayOutputStream captura = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(captura, true, StandardCharsets.UTF_8));
            acao.run();
        } finally {
            System.setOut(saidaOriginal);
        }

        String resultado = captura.toString(StandardCharsets.UTF_8).trim();

        if (resultado.equals(esperado)) {
            System.out.println("PASSOU: " + nome);
        } else {
            System.out.println("FALHOU: " + nome);
            System.out.println("Esperado: " + esperado);
            System.out.println("Recebido: " + resultado);
            throw new AssertionError("Teste falhou: " + nome);
        }
    }

    public static void main(String[] args) {
        iPhone aparelho = new iPhone();

        verificar("Tocar música", aparelho::tocar,
                "Reproduzindo música...");

        verificar("Pausar música", aparelho::pausar,
                "Música pausada.");

        verificar("Selecionar música",
                () -> aparelho.selecionarMusica("Shape of You"),
                "Música selecionada: Shape of You");

        verificar("Ligar", () -> aparelho.ligar("123-4567"),
                "Ligando para: 123-4567");

        verificar("Atender chamada", aparelho::atender,
                "Atendendo a chamada.");

        verificar("Iniciar correio de voz", aparelho::iniciarCorreioVoz,
                "Iniciando correio de voz.");

        verificar("Exibir página",
                () -> aparelho.exibirPagina("www.openai.com"),
                "Exibindo página: www.openai.com");

        verificar("Adicionar nova aba", aparelho::adicionarNovaAba,
                "Nova aba adicionada.");

        verificar("Atualizar página", aparelho::atualizarPagina,
                "Página atualizada.");

        System.out.println("\nTodos os 9 testes passaram.");
    }
}
