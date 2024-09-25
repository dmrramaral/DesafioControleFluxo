public class ParametrosInvalidosException extends Exception {

    // Construtor que permite passar uma mensagem personalizada
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    // Construtor padrão (sem mensagem)
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos.");
    }

}
