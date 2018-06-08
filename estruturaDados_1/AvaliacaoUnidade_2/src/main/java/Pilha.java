public class Pilha implements IPilha {

    private Lista pilha = new Lista();

    public void empilhar(Object o) {
        pilha.addInicio(o);
    }

    public Object desempilhar() {
        try {
            return pilha.removeInicio(); //Sempre obter do inicio ja que e uma pilha !
        } catch (ListaException e) {
            System.out.println("Pilha Vazia !");
        }
        return null;
    }

    public boolean estahVazia() {
        if (pilha.estahVazia()) {
            return true;
        }
        return false;
    }

}
