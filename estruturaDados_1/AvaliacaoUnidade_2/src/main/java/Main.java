public class Main {
    public static void main(String[] args) throws ListaException {
        //teste da lista top top top
        Lista lista = new Lista();

        lista.adicionar(1, 0);
        lista.adicionar(2, 1);
        System.out.println("quantidade " + lista.getQtd());
        System.out.println(lista.exibirLista());
        System.out.println(lista.obter(1));
        lista.remover(0);
        System.out.println(lista.exibirLista());

        //teste da pilha top top top
        Pilha pilha = new Pilha();
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
    }
}
