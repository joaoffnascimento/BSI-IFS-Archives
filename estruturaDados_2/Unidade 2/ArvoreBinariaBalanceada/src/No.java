import java.io.Serializable;

public class No<T extends Comparable> implements Serializable {
    private No<T> menor, maior;
    private No<T> noPai;
    private T dado;
    private int altura;

    public No(T dado) {
        this.noPai = noPai;
        this.menor = menor;
        this.maior = maior;
        this.dado = dado;
        this.altura = 0;

        //this.noPai = noPai;
    }

    public No() {
        this.noPai = noPai;
        this.menor = menor;
        this.maior = maior;
        //this.noPai = noPai;
        this.altura = 0;
    }

    public No(T dado, No<T> anterior) {
        this.dado = dado;
        this.noPai = anterior;
    }


    public No<T> getMenor() {
        return menor;
    }

    public void setMenor(No<T> menor) {
        this.menor = menor;
    }

    public No<T> getMaior() {
        return maior;
    }

    public void setMaior(No<T> maior) {
        this.maior = maior;
    }

    public T getDado() {
        return dado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getNoPai() {
        return noPai;
    }

    public void setNoPai(No<T> noPai) {
        this.noPai = noPai;
    }
}
