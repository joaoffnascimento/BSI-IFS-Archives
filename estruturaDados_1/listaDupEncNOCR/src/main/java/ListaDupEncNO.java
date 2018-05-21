public class ListaDupEncNO implements IListaDupEncNO {

    //Atributos da ListaDupEncNO
    //Quantidade Elementos
    //Classe n

    //Sentinelas ou nodos Falsos (nao armazenam nenhum elemento).
    private NoCabeca noCabeca;
    private Node noCauda;

    //Getters e Setters
    protected NoCabeca getNoCabeca() {
        return noCabeca;
    }

    protected void setNoCabeca(NoCabeca noCabeca) {
        this.noCabeca = noCabeca;
    }

    protected Node getNoCauda() {
        return noCauda;
    }

    protected void setNoCauda(Node noCauda) {
        this.noCauda = noCauda;
    }

    //Construtor
    protected ListaDupEncNO() {
        noCabeca = new NoCabeca();
        noCauda = new Node(null, null, noCabeca); //Anterior noCabeca
        noCabeca.setProx(noCauda); //Proximo noCauda
    }

    //Metodo Utilitario
    public boolean estahVazia() {
        if (noCabeca.getSize() == 0) {
            return true;
        }
        return false;
    }

    //Exibir Lista ok
    public String exibirLista() throws ListaException {
        String saida = "Conteudo da Lista = [";
        Node aux = this.noCabeca;

        if (estahVazia()) {
            throw new ListaException("Lista está vazia !");
        }
        //Concatenando String para exibir.
        while (aux != noCauda) { //O(N)
            if (aux != noCabeca)
                saida = saida + aux.getDado() + " ";
            aux = aux.getProx();
        }
        saida += "]";
        return saida;
    }

    //tamanho da lista ok
    public int tamanhoLista() {
        return noCabeca.getSize();
    }

    //Inserir no inicio
    public void inserir(Object dado) {
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
        }
        //ok Complexidade O(1)
        newNode.setDado(dado);
        noCabeca.incremente();
    }

    public void remover(Object chave) throws ListaException {
        if (estahVazia()) {
            throw new ListaException("Lista Vazia !");
        }

        Node aux = noCabeca;
        while (aux != null) {
            if (aux.getDado() == chave) {
                (aux.getAnt()).setProx(aux.getProx());
                (aux.getProx()).setAnt(aux.getAnt());
                aux.setProx(null);
                aux.setAnt(null);

                aux = noCabeca; // AQUI
            }
            aux = aux.getProx();
        }
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
}