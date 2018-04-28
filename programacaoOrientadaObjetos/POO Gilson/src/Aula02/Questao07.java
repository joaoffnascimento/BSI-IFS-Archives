/**
 * Created by aluno on 25/08/2017.
 */
package Aula02;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int a, b;
        int mediaAritimetica = 0;
        int countAprovados = 0;
        int countExame = 0;
        int countReprovados = 0;
        int mediaClasse = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Aluno " + (i + 1) + ": ");
            System.out.println("Digite a primeira nota: ");
            a = read.nextInt();
            System.out.println("Digite a segunda nota: ");
            b = read.nextInt();

            mediaAritimetica = ((a + b) / 2);
            mediaClasse += mediaAritimetica;

            if (mediaAritimetica < 3) {
                System.out.println("Sua nota 1: " + a + " sua nota 2: " + b);
                System.out.println("Situação : Reprovado");
                countReprovados++;
            } else if (mediaAritimetica >= 3 && mediaAritimetica < 7) {
                System.out.println("Sua nota 1: " + a + " sua nota 2: " + b);
                System.out.println("Situação : Exame");
                countExame++;
            } else if (mediaAritimetica >= 7) {
                System.out.println("Sua nota 1: " + a + " sua nota 2: " + b);
                System.out.println("Situação : Aprovado");
                countAprovados++;
            }


        }

        System.out.println("Media da classe: " + mediaClasse / 6);
        System.out.println("Número de alunos aprovados: " + countAprovados);
        System.out.println("Número de alunos reprovados: " + countReprovados);
        System.out.println("Número de alunos para exame: " + countExame);

    }
}
