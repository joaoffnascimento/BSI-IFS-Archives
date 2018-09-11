public class Testes {
    public static void main(String[] args) {
        //Cria uma arvore binaria com o construtor padrao
        ArvoreBinaria<Double> arvore = new ArvoreBinaria<Double>();
        //Teste do metodo vazio
        arvore.testeVazia();

        arvore.inserir(5D);//Insere o dado 5
        arvore.testeVazia();// testa se realmente foi inserido o dado.

        System.out.println();
        //Listando arvore de forma crescente
        arvore.listarArvore();
        System.out.println();

        //Arvore teste com 10 elementos
        arvore.inserir(2D);
        arvore.inserir(3D);
        arvore.inserir(6D);
        arvore.inserir(7D);
        arvore.inserir(8D);
        arvore.inserir(2.3D);
        arvore.inserir(5.2D);
        arvore.inserir(8.7D);
        arvore.inserir(1D);
        arvore.inserir(6.9D);
        arvore.inserir(19d);

        System.out.println();
        arvore.listarArvore();
        System.out.println();
        

    }
}