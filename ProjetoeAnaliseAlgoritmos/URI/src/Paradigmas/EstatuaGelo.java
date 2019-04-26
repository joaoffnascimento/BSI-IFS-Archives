package Paradigmas;

import java.util.Scanner;

public class EstatuaGelo {
    public static void main(String[] args) {
        //Bottom up
        Scanner read = new Scanner(System.in);

        //Numero de instancias
        int t = read.nextInt();
        //Numero de tamanhos possiveis
        int n = read.nextInt();
        //Tamanho desejado pelo artista
        int m = read.nextInt();

        //O problema solicita que mesmo que nao declarado, o primeiro tamanho possivel deve ser 1;
        //Posicao 0 reservada para o zero, posicao 1 reservada para o 1
        int[] tamanhosPossiveis = new int[n+1];
        //Posicao 0 reservada para o zero
        int[] tamanhoSolicitado = new int[m];
        int [][] bancoDados = new int[n][m];

        //Validar instancias

        do{
            //Ler valores
            for (int i = 1; i < tamanhosPossiveis.length; i++) {
                tamanhosPossiveis[i] = read.nextInt();
            }
            //Preencher tamanho solicitado pelo artista
            for (int i = 1; i <= tamanhoSolicitado.length; i++) {
                tamanhoSolicitado[i-1] = i;
            }

            alimentarBanco(tamanhosPossiveis, tamanhoSolicitado, n, m);



            t--;
        }while (t != 0);

        exibirMatriz(bancoDados, n, m);
    }

    private static void exibirMatriz(int[][] matriz, int n, int m){

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                System.out.printf(matriz[j][k] + " ");
            }
            System.out.printf("\n");
        }
    }

    //Mostra o local onde deve iniciar a percorrer o vetor
    private static int validarTamanhos(int[] tamanhosPossiveis){
        int count = 0;
        for (int i = 1; i < tamanhosPossiveis.length; i++) {
            if(tamanhosPossiveis[i] == 1){
                count++;
            }
        }

        if(count == 0){
            tamanhosPossiveis[1] = 1;
            return 0;
        }
        return 1;
    }

    private static int alimentarBanco (int[] tamanhosPossiveis, int [] tamanhoSolicitado, int n, int m){
        int [][] bancoDados = new int[n][m];

        int inicio = validarTamanhos(tamanhosPossiveis);

        //Primeiro caso
        for (int i = 0; i < tamanhoSolicitado.length; i++) {
            bancoDados[0][i] = tamanhoSolicitado[i];
        }
        //Contar solucoes incluindo o bloco do tamanho disponivel e nao incluindo
        for (int i = inicio; i < tamanhosPossiveis.length; i++) {
            for (int j = 0; j < tamanhoSolicitado.length; j++) {

                int comBloco = 0;
                if(tamanhosPossiveis[i] - tamanhoSolicitado[j] >= 0){
                    comBloco = bancoDados[tamanhosPossiveis[i] - tamanhoSolicitado[j]][j];
                }

                int semBloco = 0;
                if(tamanhosPossiveis[i] >= 1){
                    semBloco = bancoDados[tamanhosPossiveis[i]][tamanhosPossiveis[i]-1];
                }

                bancoDados[i][j] = comBloco + semBloco;
            }
        }
        return bancoDados[n][m];
    }
    //0 1 2 3 4 5 6 7
}
