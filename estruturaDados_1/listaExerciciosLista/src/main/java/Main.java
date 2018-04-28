public class Main {

    public static ILista criarListaSEQNO() {
        return new ListaSequencialNaoOrdenada();
    }

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
        /**
         * inst of comparable
         * ((comparable)o).compareTo(this.info); ou o inverso
         */

        ILista listaSEQNO = criarListaSEQNO();
        listaSEQNO.inicializar(5);

        Pessoa p1 = new Pessoa("Lucas", 10);
        Pessoa p2 = new Pessoa("Jose", 11);
        Pessoa p3 = new Pessoa("Carlos", 12);

        listaSEQNO.adicionar(p1);
        listaSEQNO.adicionar(p2);
        listaSEQNO.adicionar(p3);

        System.out.println(" ");
        //TESTE DO METODO CONTEM, para verificar se existe algum objeto ou chave na lista de acordo com a entrada.
        System.out.println("Teste do método contém /");

        //Tem que ser True
        System.out.println("Existe alguem com idade 10? " + listaSEQNO.contem(10));

        //Tem que ser false
        System.out.println("Existe alguem com idade 9? " + listaSEQNO.contem(9));

        //Tem que ser True
        System.out.println("Existe algum Lucas ? " + listaSEQNO.contem("Lucas"));

        //Tem que ser false
        System.out.println("Existe algum malacoi? " + listaSEQNO.contem("malacoi"));

        System.out.println(" ");
        //Teste do METODO OBTER
        System.out.println("Teste do método obter /");

        //Tem que ser True
        System.out.println("Quem tem idade 10? " + listaSEQNO.obter(10));

        //Tem que ser false
        System.out.println("Quem tem idade 9? " + listaSEQNO.obter(9));

        //Tem que ser True
        System.out.println("Existe Jose ? " + listaSEQNO.obter("Jose"));

        //Tem que ser false
        System.out.println("Existe algum malacoi? " + listaSEQNO.obter("malacoi"));

        System.out.println(" ");
        //TESTE do METODO OBTERDAPOSICAO
        System.out.println("Teste do método obter da posição /");

        System.out.println("Retorno da posição 1: " + listaSEQNO.obterDaPosicao(1));
        System.out.println("Retorno da posição 3: " + listaSEQNO.obterDaPosicao(3));
        try {
            System.out.println("Retorno da posição 10: " + listaSEQNO.obterDaPosicao(10));
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }

        listaSEQNO.estahCheia();
    }
}
