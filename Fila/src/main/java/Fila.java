import java.util.Arrays;

public class Fila implements IFila {
    private Object[] fila;
    private int inicio;
    private int fim;
    private int max;

    public void inicializarFila(int tamanho) {
        fila = new Object[tamanho];
        setInicio(0);
        setFim(-1);
        setMax(tamanho - 1);
    }

    public void queue(Object carro) throws FilaCheiaException {
        if (this.isCheia()){
            throw new FilaCheiaException("Fila cheia !");
        }
        fim++;
        fila[fim] = carro;
        System.out.println("ok");

    }

    public boolean isVazia() {
        if (getFim() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCheia() {
        if(fim == fila.length-1){
            return true;
        } else {
            return false;
        }
    }


    public Object deQueue() throws FilaVaziaException{
        if (isVazia()){
            throw new FilaVaziaException("Fila vazia !");
        }
        Object saida = fila[inicio];
        for (int i = inicio; i <= fim; i++) {
            fila[i] = fila[i+1];
        }
        fim--; //mover fim
        return saida + "    ---- - -- - Saiu da fila";
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
