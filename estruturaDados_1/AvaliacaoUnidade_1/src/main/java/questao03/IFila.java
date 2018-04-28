package questao03;

public interface IFila {
    void queue(int valorInteiro);
    int deQueue();
    boolean isVazia();
    boolean isCheia();
    int tamanho();
    void inicializarFila(int tamanho);
}
