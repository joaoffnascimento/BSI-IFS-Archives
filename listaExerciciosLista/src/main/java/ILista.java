import java.util.List;

public interface ILista {
    void inicializar(int quantidadeMaxima);
    void adicionar(Comparable o) throws ListaException;
    void remover(Object chave) throws ListaException;
    boolean contem(Object chave);
}
