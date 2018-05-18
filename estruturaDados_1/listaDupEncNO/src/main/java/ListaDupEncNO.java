public class ListaDupEncNO implements IListaDupEncNO {

    //Atributos da ListaDupEncNO
    //Quantidade Elementos
    //Classe n

    //Sentinelas ou nodos Falsos (nao armazenam nenhum elemento).
    private NoCabeca noCabeca;
    private Node noCauda;

    public int getSize() {
        return noCabeca.getSize();
    }


    public Node getNoCabeca() {
        return noCabeca;
    }

    /*
    public void setNoCabeca(Node noCabeca) {
        this.noCabeca = noCabeca;
    }
    */

    public Node getNoCauda() {
        return noCauda;
    }

    /*
    public void setNoCauda(Node noCauda) {
        this.noCauda = noCauda;
    }
    */
    public ListaDupEncNO() {

        noCabeca = new NoCabeca();
        noCauda = new Node(null, null, noCabeca); //Anterior noCabeca
        noCabeca.setProx(noCauda); //Proximo noCauda
    }


    public boolean estahVazia() {
        if (noCabeca.getSize() == 0) {
            return true;
        }
        return false;
    }

    //Exibir Lista
    public void exibirLista() {

    }

    //tamanho da lista
    public int tamanhoLista() {
        return noCabeca.getSize();
    }

    //Inserir no inicio
    public void inserir(Object dado) /*throws ListaException*/ {

        Node newNode = new Node();
        Node auxNode;

        if (estahVazia()) {
            noCabeca.setProx(newNode);
            newNode.setProx(noCauda);
            newNode.setAnt(noCabeca);
            noCauda.setAnt(newNode);
        } else {
            noCauda.getAnt().setProx(newNode);
            newNode.setAnt(noCauda.getAnt());
            newNode.setProx(noCauda);
            noCauda.setAnt(newNode);

            /*
            auxNode = noCabeca.getProx();
            auxNode = noCauda.getAnt();
            newNode.setProx(auxNode.getProx());
            newNode.setAnt(auxNode.getAnt());
            newNode.setDado(dado);
            noCabeca.incremente();
            */
        }
        newNode.setDado(dado);
        noCabeca.incremente();
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