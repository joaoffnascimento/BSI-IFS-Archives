public interface IListaDupEnc {
    void inserir(int dado);

    Integer count();

    void remover(Object chave);

    boolean contem(Object dado);

    Object obter(Object chave);

    void mesclar(IListaDupEnc L);

    Object[] subconj(int inicio, int fim);

    IListaDupEnc inverter();
}
