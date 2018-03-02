public class PilhaVaziaException extends RuntimeException {
    // constrói um objeto PilhaVaziaException com a mensagem passada por parâmetro

    public PilhaVaziaException(String msg) {
        super(msg);
    }

    // contrói um objeto PilhaCheiaException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public PilhaVaziaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

