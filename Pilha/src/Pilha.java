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
    public void empilhar(long dado) {

    }

    @Override
    public long desempilhar() {
        return 0;
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
}
