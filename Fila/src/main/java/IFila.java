public interface IFila {
    void queue(Object carro);
    Object deQueue();
    boolean vazia();
    int tamanho();
    void inicializarFila(int tamanho);
}
