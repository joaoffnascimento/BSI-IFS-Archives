public interface IFila {
    void queue(Pilha carro);
    Pilha deQueue();
    boolean isVazia();
    boolean isCheia();
    int tamanho();
    void inicializarFila(int tamanho);
}
