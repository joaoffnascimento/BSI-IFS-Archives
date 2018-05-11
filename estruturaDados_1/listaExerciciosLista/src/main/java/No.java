public class No {
    private int elemento; //nunm porque é uma lista de inteiros
    private No proximo; //apontador para o próximo
    private No anterior; //apontador para o anterior

    public No(No anterior, No proximo, int elemento) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}

