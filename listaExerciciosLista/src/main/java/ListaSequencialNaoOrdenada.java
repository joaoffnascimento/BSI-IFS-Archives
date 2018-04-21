import java.util.Arrays;

public class ListaSequencialNaoOrdenada implements ILista {

    public Object[] lista;
    public int tamanhoLista;
    public int qtdElementosArmazenados;
    boolean listaInicializada;

    //Vetor extensível.
    public void inicializar(int quantidadeMaxima) {
        lista = new Object[quantidadeMaxima];
        tamanhoLista = quantidadeMaxima;
        qtdElementosArmazenados = 0;
        listaInicializada = true;
    }

    public void adicionar(Comparable o) throws ListaException {
        /**
         * Adicionar em uma posição desejada:
         * for (int i = posElemArmazenado-1; i>=posDesejada; i--){
         *  lista[i+1]=lista[i]
         * lista[r] = e;
         * posElemArmazenado++;
         * }
         */

        if (qtdElementosArmazenados < tamanhoLista) {
            lista[qtdElementosArmazenados] = o;
            qtdElementosArmazenados++;
        } else if (!listaInicializada) {
            throw new ListaException("Lista não inicializada !");
        } else if (qtdElementosArmazenados >= tamanhoLista) {
            throw new ListaException("Lista cheia !");
        }


    }

    public void remover(Object chave) throws ListaException {

    }

    public boolean contem(Object chave) {
        return false;
    }

    public void expandirLista(float percentual) throws IndexOutOfBoundsException {
        //Criar um novo vetor com o novo tamanho, e passar os elementos do anterior para esse.
        //Casos de adidionar um elemento em um indice especificado.

        /*if (qtdElementosArmazenados == tamanhoLista) {*/
        tamanhoLista = ((tamanhoLista * (int) percentual) / 100) + tamanhoLista;
        Object[] listaAuxiliar = new Object[tamanhoLista];
        for (int i = 0; i < qtdElementosArmazenados; i++) {
            listaAuxiliar[i] = lista[i];
        }
        lista = listaAuxiliar;
        /*}*/
    }

    @Override
    public String toString() {
        return "ListaSequencialNaoOrdenada{" +
                "lista=" + Arrays.toString(lista) +
                ", tamanhoLista=" + tamanhoLista +
                ", qtdElementosArmazenados=" + qtdElementosArmazenados +
                ", listaInicializada=" + listaInicializada +
                '}';
    }
}
