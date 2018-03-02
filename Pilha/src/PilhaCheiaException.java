public class PilhaCheiaException extends RuntimeException {
    // constrói um objeto PilhaCheiaException com a mensagem passada por parâmetro

    public PilhaCheiaException(String msg) {
        super(msg);
    }

    // contrói um objeto PilhaCheiaException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public PilhaCheiaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

