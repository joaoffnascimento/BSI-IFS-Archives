package Aula01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int qtdAlunos;
        float nota;
        float media;
        float notaTotal = 0;
        short flag = 0;

        do {
            System.out.println("Entre com o número de alunos na turma: ");
            qtdAlunos = read.nextInt();
            for (int i = 0; i < qtdAlunos; i++) {
                System.out.println("Digite a nota do aluno: ");
                nota = read.nextFloat();
                notaTotal += nota;
            }

            media = notaTotal / qtdAlunos;

            System.out.println("Media dos " + qtdAlunos + " aluno/os = " + media);
            System.out.println("Deseja continuar? ===  -1 para não ===");
            flag = read.nextShort();

        } while (flag != -1);

    }

}
