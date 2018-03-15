public class FilaVaziaException extends RuntimeException {
    // constrói um objeto FilaVaziaException com a mensagem passada por parâmetro

    public FilaVaziaException(String msg) {
        super(msg);
    }

    // contrói um objeto FilaVaziaException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public FilaVaziaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
