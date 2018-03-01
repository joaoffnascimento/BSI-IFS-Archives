public interface IPilha {
    void inicializar(int qtdElementos);
    void empilhar(Object dado);
    Object desempilhar();
    Boolean estahVazia();
    Boolean estahCheia();
}