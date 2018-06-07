public class Lista implements ILista {

    No inicio;
    No fim;

    private int qtd;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Lista() {
        this.inicio = null;
        this.fim = null;
        this.qtd = 0;
    }

    public No getPrimeiro() {
        return inicio;
    }

    public void setPrimeiro(No primeiro) {
        this.inicio = primeiro;
    }

    public No getUltimo() {
        return fim;
    }

    public void setUltimo(No ultimo) {
        this.fim = ultimo;
    }

    public boolean estahVazia() {
        if (getQtd() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(Object o, int pos) throws ListaException {
        No novo = new No();
        novo.setInfo(o);
        No aux = this.inicio;

        if (pos == 0) {
            addInicio(o);
        } else if (pos == (qtd - 1)) {
            this.addFim(o);
        } else if (pos < getQtd()) {
            this.addInicio(o);
            System.out.println("Posição não existente, foi adicionado no inicio");
        } else {
            for (int i = 0; i < pos; i++) {
                aux.setProx(aux);
            }
            novo.setProx(aux.getProx());
            aux.setProx(novo);
            setQtd(getQtd() + 1);
        }
    }

    public void remover(int pos) throws ListaException {
        No aux = getPrimeiro();
        No anterior = null;

        if (pos == 0) {
            this.removeInicio();
        } else if (pos == getQtd()) {
            this.removeFim();
        } else {
            for (int i = 1; i <= pos; i++) {
                anterior = aux;
                aux = aux.getProx();
            }
            anterior.setProx(aux.getProx());
            setQtd(getQtd() - 1);
        }
    }

    public void removeInicio() throws ListaException {
        if (estahVazia()) {
            throw new ListaException("Lista esta vazia !");
        } else {
            setPrimeiro(getPrimeiro().getProx());
            setQtd(getQtd() - 1);
        }

    }

    public void removeFim() throws ListaException {
        if (estahVazia()) {
            throw new ListaException("Lista esta vazia !");
        }
        if (getUltimo() == getPrimeiro()) {
            setPrimeiro(null);
            setUltimo(null);
            setQtd(getQtd() - 1);
        } else {
            No aux, aux2;
            aux = getPrimeiro();
            aux2 = aux;
            while (aux.getProx() != null) {
                aux2 = aux;
                aux = aux.getProx();
            }
            aux2.setProx(null);
            setUltimo(aux2);
            setQtd(getQtd() - 1);
        }
    }

    public No obter(int pos) throws ListaException {
        if (estahVazia()) {
            throw new ListaException("Lista esta vazia !");
        }

        if (pos > getQtd()) {
            throw new ListaException("Posicao nao existe!");
        }

        No aux = this.inicio;
        for (int i = 1; i <= pos; i++) {
            aux = aux.getProx();
        }
        return aux;
    }

    public int quantidade() throws ListaException {
        return getQtd();
    }

    public boolean addInicio(Object o) {
        if (inicio == null) {
            No novo = new No();
            novo.setInfo(o);
            novo.setProx(null);
            inicio = novo;
            fim = inicio;
        } else {
            No novo = new No();
            novo.setInfo(o);
            novo.setProx(inicio);
            inicio = novo;
        }
        setQtd(getQtd() + 1);

        return true;
    }


    public boolean addFim(Object o) {
        if (inicio == null) {
            No novo = new No();
            novo.setInfo(o);
            novo.setProx(null);
            inicio = novo;
            fim = inicio;
        } else {
            No novo = new No();
            novo.setInfo(o);
            novo.setProx(null);
            fim.setProx(novo);
            fim = novo;
        }
        setQtd(getQtd() + 1);

        return true;
    }

    public void imprimir() {
        No imprimir;
        imprimir = inicio;

        while (imprimir != null) {
            System.out.println(imprimir.getInfo());
            imprimir.getProx();
        }
    }

    public String exibirLista() throws ListaException {
        //metodo top
        String saida = "Conteudo da Lista = [";
        No aux = inicio;

        if (estahVazia()) {
            throw new ListaException("Lista esta vazia !");
        }
        //Concatenando String para exibir.
        for (int j = 0; j < getQtd(); j++) {
            saida = saida + aux.getInfo() + " ";
            aux = aux.getProx();
        }
        saida += "]";
        return saida;

    }

}
