import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArvoreBinariaAVL<Double> arvore = new ArvoreBinariaAVL<Double>();
        System.out.println(arvore.testeVazia());
        arvore.inserir(5D);
        arvore.inserir(4D);
        arvore.inserir(4.5);
        arvore.inserir(4.6);
    }
}