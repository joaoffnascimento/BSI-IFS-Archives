/*
package SiplesmenteEnc;

public class SimplesmenteEnc {

    No inicio;
    No fim;

    public SimplesmenteEnc(){
        inicio = fim = null;
    }

    public void inserirNoInicio(int valor){
        if (inicio == null){
            No novo = new No();
            novo.setValor(valor);
            novo.setProx(null);

            inicio = fim;
            fim = inicio;
        } else {
            No novo = new No();
            novo.setValor(valor);
            novo.setProx(inicio);

            inicio = novo;
        }
    }

    public void inserirNoFim(int valor){
        if (inicio == null){
            No novo = new No();
            novo.setValor(valor);
            novo.setProx(null);

            inicio = novo;
            fim = inicio;

        } else {
            No novo = new No();
            novo.setValor(valor);
            novo.setProx(null);

            fim.setProx(novo);
            fim = novo;
        }
    }

    public void imprimir(){
        No imprimir = new No();
        imprimir = inicio;

        while(imprimir != null){
            System.out.println(imprimir.getValor());
            imprimir.getProx();
        }
    }
}
*/
