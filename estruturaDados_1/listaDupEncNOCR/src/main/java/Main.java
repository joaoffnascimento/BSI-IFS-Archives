public class Main {

    public static IListaDupEncNO criarListaSEQNO() {
        return new ListaDupEncNO();
    }

    public static void main(String[] args) throws ListaException {
        ListaDupEncNO lista = new ListaDupEncNO();
        System.out.println(lista.estahVazia());
        lista.inserir(1);
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);


        System.out.println(lista.tamanhoLista());
        System.out.println(lista.estahVazia());
        System.out.println(lista.exibirLista());
        lista.remover(1);
        System.out.println(lista.exibirLista());

        ListaDupEncNO listaDois = new ListaDupEncNO();
        listaDois.inserir(4);
        listaDois.inserir(5);
        listaDois.inserir(6);
        lista.mesclar(lista, listaDois);
        System.out.println(lista.exibirLista());

        ListaDupEncNO listaInverter = new ListaDupEncNO();
        listaInverter.inserir(1);
        listaInverter.inserir(2);
        listaInverter.inserir(3);
        System.out.println(listaInverter.exibirLista());
        listaInverter.inverter().exibirLista();
        System.out.println(listaInverter.exibirLista());


    }
}
