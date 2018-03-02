public interface IPilha {
    void inicializar(int qtdElementos);
    void empilhar(Object dado);
    Object desempilhar();
    Boolean estahVazia();
    Boolean estahCheia();

    /*Interface Comparable
    Método / restrição (não utilizar object)
    public class pessoa implements IComparable{
    http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
    operação crud
             Create, Read, Update e Delete
    }
     */
}