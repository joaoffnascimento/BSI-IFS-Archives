import java.util.Arrays;

public class Pilha implements IPilha{
    public Object [] pilha;
    public int indicePilha;


    @Override
    public void inicializar(int qtdElementos) {
        indicePilha = -1;
        //Indica que a pilha está vazia, pois a posição 0 seria a inicial = null;
        pilha = new Object[qtdElementos];
    }

    @Override
    public void empilhar(Object dado) {
        indicePilha++;
        pilha[indicePilha] = dado;
    }

    @Override
    public Object desempilhar() {
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
        if(indicePilha == pilha.length-1){
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

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.inicializar(10);
        System.out.println(pilha.estahCheia());
        System.out.println(pilha.estahVazia());
        pilha.empilhar("teste");
        pilha.empilhar(1);
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha);
    }
}
