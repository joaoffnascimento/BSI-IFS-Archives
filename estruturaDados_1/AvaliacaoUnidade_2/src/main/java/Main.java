public class Main {
    public static void main(String[] args) throws ListaException {
        Lista lista = new Lista();

        lista.adicionar(1, 0);
        lista.adicionar(2, 1);
        System.out.println("quantidade " + lista.getQtd());

        System.out.println(lista.exibirLista());
        System.out.println(lista.obter(1));
        lista.remover(0);
        System.out.println(lista.exibirLista());
    }
}
