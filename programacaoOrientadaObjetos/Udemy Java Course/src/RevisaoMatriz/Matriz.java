package RevisaoMatriz;

import java.util.*;
public class Matriz {

    public static void main(String[] args) {
        float notasAlunos[][] = new float [4][4];

        notasAlunos[0][0] = 9;
        notasAlunos[0][1] = 4;
        notasAlunos[0][2] = 3;
        notasAlunos[0][3] = 9;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 1;
        notasAlunos[1][2] = 5;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 9;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 9;
        notasAlunos[2][3] = 8;

        notasAlunos[3][0] = 1;
        notasAlunos[3][1] = 10;
        notasAlunos[3][2] = 9;
        notasAlunos[3][3] = 6;

        showMatriz(notasAlunos);

        notasAlunos[3][0] = 1;
        notasAlunos[3][1] = 2;
        notasAlunos[3][2] = 3;
        notasAlunos[3][3] = 4;

        showMatriz(notasAlunos);


    }
    public static void showMatriz (float notasAlunos[][]){

        for (int linha = 0; linha < notasAlunos.length; linha++) {
            for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
                System.out.print(notasAlunos[linha][coluna] + " ");
            }
            System.out.println("");
        }
    }
}
