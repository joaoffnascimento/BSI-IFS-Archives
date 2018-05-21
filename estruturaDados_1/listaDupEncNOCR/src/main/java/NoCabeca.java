public class NoCabeca extends Node {
    //Pelo nó cabeça e possivel saber o tamanho da lista
    //O campo dado e responsável por isso
    public int getSize() {
        return (Integer)getDado();
    }

    //construtor no cabeca
    public NoCabeca(){
        setSize(0);
    }
    //Setar o tamanho
    private void setSize(int size) {
        this.setDado(size);
    }

    public void incremente(){
        int qtd = getSize();
        setSize(qtd+1);
    }
}
