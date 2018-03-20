public interface IFila {
    void queue(Pilha Object);
    Pilha deQueue();
    boolean isVazia();
    boolean isCheia();
    int tamanho();
    void inicializarFila(int tamanho);
}
