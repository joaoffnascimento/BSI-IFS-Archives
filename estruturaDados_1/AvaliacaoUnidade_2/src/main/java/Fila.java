public class Fila implements IFila {

    private Lista fila = new Lista();

    //O(1)
    public void inserir(Object o) {
        fila.addFim(o); //em uma fila, a entrada e sempre pelo final
    }

    //O(1)
    public Object remover(int pos) throws ListaException {
        No aux;
        aux = fila.obter(pos);
        fila.remover(pos); //Sempre obter do inicio ja que e uma pilha !
        return aux;
    }
}
