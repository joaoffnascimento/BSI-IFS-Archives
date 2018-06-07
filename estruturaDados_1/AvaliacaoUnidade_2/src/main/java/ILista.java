public interface ILista {

    void adicionar(Object o, int pos) throws ListaException; //OK

    void remover(int pos) throws ListaException; //OK

    No obter(int pos) throws ListaException; //OK

    int quantidade() throws ListaException; //OK

}
