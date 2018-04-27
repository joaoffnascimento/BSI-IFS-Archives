public class Main {
    public static void main(String[] args) throws ListaException {
        //Adaptar para um programa de testes
        //Fazer os métodos correspondentes a cada uma das funcionalidades
        //Junit
        /**
         * Public class teste
         * ILista lista
         *
         * Public ILista criarLista(){
         * return new listseq(); //polimorfismo
         * }
         * public void addInicio(){
         * lista = criarLista();
         * int valor;
         * lista.add(valor);
         * }
         *
         * public void removerMeio(){
         * Lista = criarlista();
         * lista.add(1);
         * .add(2);
         * .add(3);
         * lista.remove(2);
         * }
         */
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
        //System.out.println(lista.contem(null));
        System.out.println(lista.obter(14 ));
        lista.expandirLista(10);
        //System.out.println(lista);
        lista.expandirLista(10);
        //System.out.println(lista);

        //System.out.println(lista.contem(p1));
        lista.remover(p1);
       // System.out.println(lista);

        /**
         * inst of comparable
         * ((comparable)o).compareTo(this.info); ou o inverso
         */

    }
}
