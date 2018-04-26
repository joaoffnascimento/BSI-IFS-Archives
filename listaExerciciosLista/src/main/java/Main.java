public class Main {
    public static void main(String[] args) throws ListaException {
        Pessoa p1 = new Pessoa("lucas",13);
        Pessoa p2 = new Pessoa("jose", 14);

        //System.out.println(p1.compareTo(p2));
        //System.out.println(p2.compareTo(p1));

        ListaSequencialNaoOrdenada lista = new ListaSequencialNaoOrdenada();
        lista.inicializar(10);
        //System.out.println(lista);
        lista.adicionar(p1);
        lista.adicionar(p2);
        System.out.println("===============================");
        System.out.println(lista.contem(null));
        lista.expandirLista(10);
        //System.out.println(lista);
        lista.expandirLista(10);
        //System.out.println(lista);

        //System.out.println(lista.contem(p1));
        lista.remover(p1);
       // System.out.println(lista);

    }
}
