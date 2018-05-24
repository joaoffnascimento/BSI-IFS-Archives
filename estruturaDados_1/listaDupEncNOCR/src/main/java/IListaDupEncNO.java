public interface IListaDupEncNO {

    //boolean incializarLista();

    int tamanhoLista(); //ok

    String exibirLista() throws ListaException; //ok

    void inserir(Object dado); //ok

    void remover(Object chave) throws ListaException;

    boolean contem(Object dado);

    Object obter(Object chave);

    void mesclar(ListaDupEncNO lista, ListaDupEncNO listaDois);

    Object[] subconj(int inicio, int fim);

    ListaDupEncNO inverter();
}