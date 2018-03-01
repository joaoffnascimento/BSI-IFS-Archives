public interface IPilha {
    void inicializar(int qtdElementos);
    void empilhar(long dado);
    long desempilhar();
    Boolean estahVazia();
    Boolean estahCheia();
}