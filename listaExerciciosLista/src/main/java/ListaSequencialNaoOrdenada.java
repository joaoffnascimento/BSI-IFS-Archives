import java.util.Arrays;

public class ListaSequencialNaoOrdenada implements ILista {
    //no cabeça / no cauda / Circular
    /**
     * Lista sequencial (array)
     * Lista encadeada (simples e duplamente) Ordenada e não ordenada
     * Inverta uma lista simplesmente encadeada
     * converta uma fila em uma pilha e vice versa
     * Descritor
     * lista simplesmente encadeada ordenada.
     * Fila
     * Pilha
     * Qualquer coisa (Algoritmos de ordenação).
     * add inicio / remover meio
     */
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
        //??? remover um objeto chave ???
        //?remover de uma posicao?
        for (int i = 0; i < qtdElementosArmazenados; i++) {
            if (lista[i].equals(chave)) {
                int pos = i;
                for (int j = pos; j < qtdElementosArmazenados - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                qtdElementosArmazenados--;
            }
        }
    }

    //Como a chave é um objeto, devo utilizar o equals ?!
    //Duvidas nessa parte \/
    public boolean contem(Object chave) throws ListaException {
        if (listaInicializada) {
            for (int i = 0; i < qtdElementosArmazenados; i++) {
                if (lista[i].equals(chave)) {
                    return true;
                }
            }
        } else {
            throw new ListaException("Lista nao inicializada !");
        }
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

    public Comparable obter(Object chave) {
        for (int i = 0; i < qtdElementosArmazenados; i++) {
            if (lista[i].equals(chave)) {
                return (Comparable) lista[i];
            }
        }
        return null;
    }

    //Método O(n)
    /*
    public Comparable obterDaPosicao(int posicao) throws ListaException {
        if (posicao > qtdElementosArmazenados || posicao < qtdElementosArmazenados) {
            throw new ListaException("O valor informado  não é valido !");
        }
        for (int i = 0; i < qtdElementosArmazenados; i++) {
            if (i == posicao - 1) {
                return (Comparable) lista[i];
            }
        }
        return null;
    }
    */

    //Método O(1)
    public Comparable obterDaPosicao(int posicao) throws ListaException {
        posicao = posicao - 1;
        if (posicao >= 0 && posicao <= qtdElementosArmazenados && this.lista[posicao] != null) {
            return (Comparable) this.lista[posicao];
        } else {
            throw new ListaException("A posição informada não é válida ou está nula!");
        }
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
