import java.util.Arrays;

public class Fila implements IFila {
    private Pilha[] fila;
    private int inicio;
    private int fim;
    private int max;

    public static Fila createFilaFactory(int size) {
        Fila f = new Fila();
        f.inicializarFila(size);
        return f;
    }

    public void inicializarFila(int tamanho) {
        fila = new Pilha[tamanho];
        setInicio(0);
        setFim(-1);
        setMax(tamanho - 1);
    }

    public void queue(Pilha o) throws FilaCheiaException {
        if (this.isCheia()) {
            throw new FilaCheiaException("Fila cheia !");
        }
        fim++;
        fila[fim] = o;
    }

    public boolean isVazia() {
        if (getInicio() == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCheia() {
        if (fim == fila.length - 1) {
            return true;
        } else {
            return false;
        }
    }


    public Pilha deQueue() throws FilaVaziaException {
        if (isVazia()) {
            throw new FilaVaziaException("Você não tem caixas no galpao.");
        }
        Pilha saida = fila[inicio];
        for (int i = inicio; i <= fim; i++) {
            fila[i] = fila[i + 1];
        }
        fim--; //mover fim
        return saida;
    }

    public Pilha firstPos() throws FilaVaziaException {
        if (isVazia()) {
            throw new FilaVaziaException("Você não tem caixas no galpao.");
        }
        return fila[inicio];
    }

    public int tamanho() {
        return fila.length;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    class FilaVaziaException extends RuntimeException {

        public FilaVaziaException(String msg) {
            super(msg);
        }

        public FilaVaziaException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    class FilaCheiaException extends RuntimeException {
        // constrói um objeto FilaCheiaException com a mensagem passada por parâmetro
        public FilaCheiaException(String msg) {
            super(msg);
        }
        // constrói um objeto FilaVaziaException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
        public FilaCheiaException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    @Override
    public String toString() {
        return "Fila{" +
                "fila=" + Arrays.toString(fila) +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", max=" + max +
                '}';
    }
}
