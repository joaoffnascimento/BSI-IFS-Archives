import java.util.Arrays;

public class Pilha implements IPilha {
    //Exceções pilhaCheia e pilhaVazia

    public Object[] pilha;
    public int indicePilha;

    public int getIndicePilha() {
        return indicePilha + 1;
    }

    @Override
    public void inicializar(int qtdElementos) {
        indicePilha = -1;
        //Indica que a pilha está vazia, pois a posição 0 seria a inicial = null;
        pilha = new Object[qtdElementos];
    }

    @Override
    public void empilhar(Object dado) throws PilhaCheiaException {
        if (this.estahCheia()) {
            throw new PilhaCheiaException("Pilha cheia.");
        }
        indicePilha++;
        pilha[indicePilha] = dado;

    }

    @Override
    public Object desempilhar() throws PilhaVaziaException {
        if (this.estahVazia()) {
            throw new PilhaVaziaException("Pilha vazia.");
        }
        return pilha[indicePilha--];
    }

    @Override
    public Boolean estahVazia() {
        if (indicePilha == -1) {
            return true;
            // Verifica que o o atributo posicaoPilha é igual a -1,
            //se for, a pilha é nula, ou seja, ainda esta vazia,
            //retornando verdadeiro.
        }
        return false;
    }

    @Override
    public Boolean estahCheia() {
        if (indicePilha == pilha.length - 1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "pilha=" + Arrays.toString(pilha) +
                '}';
    }

    public int tamanhoPilha(){
        return pilha.length;
    }
}
