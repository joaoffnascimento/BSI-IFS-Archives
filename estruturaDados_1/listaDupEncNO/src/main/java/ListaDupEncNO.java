public class ListaDupEncNO implements IListaDupEncNO {

    //Atributos da ListaDupEncNO
    //Quantidade Elementos
    private int size;
    //Sentinelas ou nodos Falsos (nao armazenam nenhum elemento).
    private Node noCabeca, noCauda;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getNoCabeca() {
        return noCabeca;
    }

    public void setNoCabeca(Node noCabeca) {
        this.noCabeca = noCabeca;
    }

    public Node getNoCauda() {
        return noCauda;
    }

    public void setNoCauda(Node noCauda) {
        this.noCauda = noCauda;
    }

    public ListaDupEncNO() {
        size = 0;
        noCabeca = new Node(null, null, null);
        noCauda = new Node(null, null, noCabeca); //Anterior noCabeca
        noCabeca.setProx(noCauda); //Proximo noCauda
    }

    //Node de uma lista duplamente encadeada de objetos
    public class Node {
        private Object dado; //Objeto armazenado pelo nodo
        private Node prox, ant; //Ponteiros para o nodo seguinte e anterior

        /**
         * Construtor que cria um nodo com os campos fornecidos
         */
        public Node(Object e, Node prox, Node ant) {
            dado = e;
            this.prox = prox;
            this.ant = ant;
        }

        //Construtor padrao
        public Node() {
        }

        //Retorna o elemento deste nodo
        public Object getDado() {
            return dado;
        }

        //Atribui o elemento deste nodo
        public void setDado(Object dado) {
            this.dado = dado;
        }

        //Retorna o nodo seguinte a este
        public Node getProx() {
            return prox;
        }

        //Atribui o nodo seguinte a este nodo
        public void setProx(Node prox) {
            this.prox = prox;
        }

        //Retorna o nodo anterior a este
        public Node getAnt() {
            return ant;
        }

        //Atribui o nodo anterior a este nodo
        public void setAnt(Node ant) {
            this.ant = ant;
        }
    }

    public boolean estahVazia() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    //Exibir Lista
    public void exibirLista() {

    }

    //tamanho da lista
    public int tamanhoLista() {
        return size;
    }

    //Inserir no inicio
    public void inserir(Object dado) /*throws ListaException*/ {

        Node newNode = new Node();
        Node auxNode;

        if (size == 0) {
            noCabeca.setProx(newNode);
            noCabeca.setAnt(newNode);

            newNode.setDado(dado);
            newNode.setProx(noCauda);
            newNode.setAnt(noCabeca);
        } else {
            auxNode = noCabeca.getProx();
            auxNode = noCauda.getAnt();
            newNode.setProx(auxNode.getProx());
            newNode.setAnt(auxNode.getAnt());
            newNode.setDado(dado);
            size++;
        }

        /*
        if (size == 0) {
            newNode.setDado(dado);
            newNode.setProx(noCauda);
            newNode.setAnt(noCabeca);

        } else {
            auxNode = this.noCabeca;

            while (auxNode.getProx() != null) {
                auxNode = auxNode.getProx();
            }

            newNode.setDado(dado);
            auxNode.setProx(noCauda);
            newNode.setAnt(auxNode);

            auxNode.setProx(newNode);

            this.size++;
        }*/
    }

    public Integer count() {
        return null;
    }

    public void remover(Object chave) {

    }

    public boolean contem(Object dado) {
        return false;
    }

    public Object obter(Object chave) {
        return null;
    }

    public void mesclar(IListaDupEncNO L) {

    }

    public Object[] subconj(int inicio, int fim) {
        return new Object[0];
    }

    public IListaDupEncNO inverter() {
        return null;
    }

    @Override
    public String toString() {
        String s = "[";
        Node node = noCabeca.getProx();
        while (node != noCauda) {
            s += node.getDado();
            if (node != noCauda)
                s += ",";

        }
        s += "]";
        return s;
    }
}