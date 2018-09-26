/**
 * @author João F.F. Nascimento em 11/09/2018
 * @project binaryTree
 */

import java.io.Serializable;

public class No<T extends Comparable> implements Serializable {
    private No<T> menor, maior;
    //transient No<T> noPai;
    private T dado;

    public No(T dado) {
        this.menor = menor;
        this.maior = maior;
        this.dado = dado;
        //this.noPai = noPai;
    }

    public No() {
        this.menor = menor;
        this.maior = maior;
        //this.noPai = noPai;
    }

    public No(T dado, No<T> anterior) {
        this.dado = dado;
        //this.noPai = anterior;
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

    public void setDado(T dado) {
        this.dado = dado;
    }

    /*public No<T> getNoPai() {
        return noPai;
    }

    public void setNoPai(No<T> noPai) {
        this.noPai = noPai;
    }*/
}
