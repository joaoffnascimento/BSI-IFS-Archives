import java.util.List;

public interface ILista {
    /**
     * inicializa a lista não ordenada informando a quantidade máxima.
     * @param quantidadeMaxima
     */
    void inicializar(int quantidadeMaxima);

    /**
     * Adiciona um elemento na lista
     * @param o
     * @throws Exception Erro caso não tenha mais espaço disponível
     */
    void adicionar(Comparable o) throws ListaException;

    /**
     * Remove um item da lista
     * @param chave informar a chave de busca do item
     * @throws Exception
     */
    void remover(Object chave) throws ListaException;

    /**
     * Caso a chave seja encontrada, retorna verdadeiro
     * @param chave
     * @return
     */
    boolean contem(Object chave) throws ListaException;

    /**
     * Aumenta a quantidade de intes disponíveis na lista em X porcento.
     * @param percentual percentual a ser aumentado.
     */
    void expandirLista(float percentual);
}
