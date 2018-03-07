public interface IPilha {
    void inicializar(int qtdElementos);

    void empilhar(Object dado);

    Object desempilhar();

    Boolean estahVazia();

    Boolean estahCheia();

    int tamanhoPilha();

    //----------------------------------------------------------------------//
    /*Interface Comparable
    Método / restrição (não utilizar object)
    public class pessoa implements IComparable{
    http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
    operação crud
             Create, Read, Update (atualizar dados da pessoa) e Delete
    operacoes extras {
    pesquisar por nome salário
    listar as idades e a qtd de ocorrencias
    listar pessoas c/ salário maior que a media

    ------------------------------

    Implementar um programa que informa os passos para solucionar o jogo torre de hanoi que usa 3 pinos e n discos;
    discos id num, discos mais pesados quebram os mais leves.

    }
     */

    //Icomparable
        /*
        Object push();
        void pop (object o);
        -----------------
        IComparable
        push();
        void pop (Icomparable i);

         */
    //----------------------------------------------------------------------//
}