import java.util.Arrays;

public class Pilha implements IPilha {
    Object[] pilha;
    int topoPilha;

    public static Pilha createPilhaFactory(int size) {
        Pilha p = new Pilha();
        p.inicializarPilha(size);
        return p;
    }


    public int size() {
        return topoPilha + 1;
    }

    public void push(Object object) throws FullPilhaException {
        if (isFull()) {
            throw new FullPilhaException("Pilha Cheia !!!");
        }
        pilha[++topoPilha] = object;
    }

    public Object pop() throws EmptyPilhaException {
        if (isEmpty()) {
            throw new EmptyPilhaException("Pilha Vazia !!! ");
        }

        Object topo = pilha[topoPilha];
        pilha[topoPilha--] = null; //Desreferência pilha[topoPilha] para o sistema de coleta de lixo.
        return topo;
    }

    public boolean isEmpty() {
        if (topoPilha < 0) {
            return true;
        } else return false;
    }

    public boolean isFull() {
        if (topoPilha == pilha.length - 1) {
            return true;
        } else return false;
    }

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

    class EmptyPilhaException extends RuntimeException {

        public EmptyPilhaException(String mensagem) {
            super(mensagem);
        }
    }

    class FullPilhaException extends RuntimeException {

        public FullPilhaException(String mensagem) {
            super(mensagem);
        }
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "pilha=" + Arrays.toString(pilha) +
                ", topoPilha=" + topoPilha +
                '}';
    }
}