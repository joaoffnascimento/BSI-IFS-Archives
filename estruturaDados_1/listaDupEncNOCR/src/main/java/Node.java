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

    /*
    @Override
    public boolean equals(Object o) {
        if (o instanceof Pessoa) {
            return ((Pessoa) o).cpf == this.cpf || ((Pessoa) o).nome == getNome();
        } else if (o != null) {
            //Parse no valor inteiro para Integer
            return new Integer(this.cpf).equals(o) || new String(this.nome).equals(o);
        } else {
            return false;
        }
    }
    */
}
