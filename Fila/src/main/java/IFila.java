public interface IFila {
    void queue(Object carro);
    Object deQueue();
    boolean isVazia();
    boolean isCheia();
    int tamanho();
    void inicializarFila(int tamanho);
}
