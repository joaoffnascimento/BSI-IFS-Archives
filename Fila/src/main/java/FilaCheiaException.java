public class FilaCheiaException extends RuntimeException {
// constrói um objeto FilaCheiaException com a mensagem passada por parâmetro

    public FilaCheiaException(String msg) {
        super(msg);
    }

    // contrói um objeto FilaVaziaException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public FilaCheiaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
