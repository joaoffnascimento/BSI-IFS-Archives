public class Main {

    public static IListaDupEncNO criarListaSEQNO() {
        return new ListaDupEncNO();
    }

    public static void main(String[] args) throws ListaException {
        ListaDupEncNO lista = new ListaDupEncNO();
        System.out.println(lista.estahVazia());
        lista.inserir(1);
        lista.inserir(1);


        System.out.println(lista.tamanhoLista());
        System.out.println(lista.estahVazia());
        System.out.println(lista.exibirLista());
        lista.remover(1);
        System.out.println(lista.exibirLista());


    }
}
