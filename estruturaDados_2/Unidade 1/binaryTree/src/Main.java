/**
 * @author João F.F. Nascimento em 11/09/2018
 * @project binaryTree
 */

import com.google.gson.Gson;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Cria uma arvore binaria com o construtor padrao
        ArvoreBinaria<Double> arvore = new ArvoreBinaria<Double>();
        //Teste do metodo vazio
        System.out.println(arvore.testeVazia());

        arvore.inserir(5D);//Insere o dado 5
        System.out.println(arvore.testeVazia());// testa se realmente foi inserido o dado.

        System.out.println();
        //Listando arvore de forma crescente
        arvore.listarArvore();
        System.out.println();

        //Arvore teste com 10 elementos
        arvore.inserir(3D);
        arvore.inserir(6D);
        //arvore.inserir(1D);
        arvore.inserir(4D);
        arvore.inserir(8D);
        arvore.inserir(4.2D);
        arvore.inserir(5.5d);
        arvore.inserir(1.2d);
        arvore.inserir(1.5d);
        arvore.inserir(2d);
        arvore.inserir(7.9d);
        arvore.inserir(7.8d);
        arvore.inserir(7.7d);
        System.out.println("before");
        arvore.listarArvore();
        arvore.remover(6d);
        System.out.println("after");
        arvore.listarArvore();
        /*arvore.inserir(8.7D);
        arvore.inserir(1D);
        arvore.inserir(6.9D);
        arvore.inserir(7.9D);
        arvore.inserir(6.8D);

*/
/*        System.out.println();
        arvore.listarArvore();
        System.out.println();

        if(arvore.buscar(8.6d))
            System.out.println("valor econtrado !!");
        else System.out.println("Valor nao encontrado !!");

        if(arvore.buscar(8.7d))
            System.out.println("valor econtrado !!");
        else System.out.println("Valor nao encontrado !!");
        System.out.println("////////////////////////////////////////////");
        arvore.remover(8.7d);
        arvore.remover(7.9d);
        arvore.remover(8d);
        arvore.remover(3d);
        arvore.remover(2.3d);
        arvore.remover(1d);
        arvore.remover(2d);*/
        //arvore.remover(5d);    ///// PROBLEMA
        //arvore.remover(5.2d); ////
        //arvore.listarArvore();
    }
}