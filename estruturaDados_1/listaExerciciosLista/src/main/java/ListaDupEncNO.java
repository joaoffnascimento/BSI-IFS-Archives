public class ListaDupEncNO implements IListaDupEnc {
    private No inicio;
    private No fim;

    // Inicializa para a lista ficar vazia
    public void iniciar() {
        inicio = null;
        fim = null;
    }

    public void inserir(int dado) {
        //aqui fazemos uma lista para inserir somente no comeco
        //declaramos e instanciamos a variavel caixa
        //do tipo nó. seu proximo vai ser o incio
        //pois estamos inserindo antes do inicio
        No caixa = new No(null, inicio, dado);
        if (inicio == null)//se lista estiver vazia
            inicio = fim = caixa;
        else {
            //seta ant do No do inicio para receber caixa
            inicio.setAnterior(caixa);
            inicio = caixa;
        }
    }

    public void exibeLista() {
        No aux;
        aux = inicio;
        while (aux != null) {
            System.out.println(aux.getElemento());
            aux = aux.getProximo();
        }
    }

    public Integer count() {
        return null;
    }

    public void remover(Object chave) {

    }

    public boolean contem(Object dado) {
        return false;
    }

    public Object obter(Object chave) {
        return null;
    }

    public void mesclar(IListaDupEnc L) {

    }

    public Object[] subconj(int inicio, int fim) {
        return new Object[0];
    }

    public IListaDupEnc inverter() {
        return null;
    }
}
