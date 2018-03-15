import java.util.Arrays;

public class Pilha implements IPilha {
    Object[] pilha;
    int topoPilha;

    @Override
    public int size() {
        return topoPilha + 1;
    }

    @Override
    public void push(Object object) throws FullPilhaException{
        if(isFull()){
            throw new FullPilhaException("Pilha Cheia !!!");
        }
        pilha[++topoPilha] = object;
    }

    @Override
    public Object pop() throws EmptyPilhaException {
        if (isEmpty()) {
            throw new EmptyPilhaException("Pilha Vazia !!! ");
        }

        Object topo = pilha[topoPilha];
        pilha[topoPilha--] = null; //Desreferência pilha[topoPilha] para o sistema de coleta de lixo.
        return topo;
    }

    @Override
    public boolean isEmpty() {
        if (topoPilha < 0) {
            return true;
        } else return false;
    }

    @Override
    public boolean isFull() {
        if (topoPilha == pilha.length) {
            return true;
        } else return false;
    }

    @Override
    public Object top() throws EmptyPilhaException {
        if (isEmpty()) {
            throw new EmptyPilhaException("Pilha vazia !!! ");
        }
        return pilha[topoPilha];
    }

    public void inicializarPilha(int tamanho) {
        pilha = new Object[tamanho];
        topoPilha = -1;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "pilha=" + Arrays.toString(pilha) +
                ", topoPilha=" + topoPilha +
                '}';
    }
}
