public class No implements INo{

    private Object info;
    private No prox;


    public Object getInfo() {
        return info;
    }

    public void setInfo(Object dado) {
        this.info = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
