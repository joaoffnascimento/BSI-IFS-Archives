public interface IListaDupEncNO {

    //boolean incializarLista();

    int tamanhoLista();

    void exibirLista();

    void inserir(Object dado) throws ListaException;

    Integer count();

    void remover(Object chave);

    boolean contem(Object dado);

    Object obter(Object chave);

    void mesclar(IListaDupEncNO L);

    Object[] subconj(int inicio, int fim);

    IListaDupEncNO inverter();
}