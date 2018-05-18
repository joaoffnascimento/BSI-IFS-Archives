public class NoCabeca extends Node {

    public int getSize() {
        return (Integer)getDado();
    }

    public NoCabeca(){
        setSize(0);
    }
    private void setSize(int size) {
        this.setDado(size);
    }
    public void incremente(){
        int qtd = getSize();
        setSize(qtd+1);
    }
}
