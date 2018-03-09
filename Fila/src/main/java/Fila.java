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

    public void queue(Object carro) {
        fim++;
        fila[fim] = carro;
        System.out.println("ok");

    }

    public boolean vazia() {
        if (getFim() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Object deQueue() {
        Object saida = fila[inicio];
        for (int i = inicio; i <= fim; i++) {
            fila[i] = fila[i+1];
        }
        fim--;
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
