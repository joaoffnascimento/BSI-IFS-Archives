public class Main {

    public static IListaDupEncNO criarListaSEQNO() {
        return new ListaDupEncNO();
    }

    public static void main(String[] args) throws ListaException {
        /*
        //Adaptar para um programa de testes
        //Fazer os mÃ©todos correspondentes a cada uma das funcionalidades
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


         IListaDupEncNO listaSEQNO = criarListaSEQNO();

         Pessoa p1 = new Pessoa("Lucas", 10);
         Pessoa p2 = new Pessoa("Jose", 11);
         Pessoa p3 = new Pessoa("Carlos", 12);

         listaSEQNO.inserir(p1);
         listaSEQNO.inserir(p2);
         listaSEQNO.inserir(p3);

         System.out.println(" ");
         //TESTE DO METODO CONTEM, para verificar se existe algum objeto ou chave na lista de acordo com a entrada.
         System.out.println("Teste do mÃ©todo contÃ©m /");

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
         System.out.println("Teste do mÃ©todo obter /");

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
         System.out.println("Teste do mÃ©todo obter da posiÃ§Ã£o /");

         /*
         System.out.println("Retorno da posiÃ§Ã£o 1: " + listaSEQNO.obterDaPosicao(1));
         System.out.println("Retorno da posiÃ§Ã£o 3: " + listaSEQNO.obterDaPosicao(3));
         try {
         System.out.println("Retorno da posiÃ§Ã£o 10: " + listaSEQNO.obterDaPosicao(10));
         } catch (ListaException e) {
         System.out.println(e.getMessage());
         }

         listaSEQNO.estahCheia();


         ListaDupEncNO lista = new ListaDupEncNO();

         lista.inserir(10);
         lista.inserir(11);
         exibeLista(lista);
         */

        ListaDupEncNO lista = new ListaDupEncNO();
        System.out.println(lista.estahVazia());
        lista.inserir("a");
        System.out.println(lista.tamanhoLista());
        System.out.println(lista.estahVazia());



    }

    public static void exibeLista(IListaDupEncNO lista) {
        // while (lista.)
    }
}
