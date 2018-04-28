package Aula02;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = read.nextInt();
        float notasAlunos[][] = new float[quantidadeAlunos][4];
        String alunos[][] = new String[quantidadeAlunos][2];

        for (int linha = 0; linha < notasAlunos.length; linha++) {
            read.nextLine();
            System.out.println("Digite o seu nome: ");
            alunos[linha][0] = read.nextLine();
            System.out.println("Digite as três notas respectivamente: ");
            for (int coluna = 0; coluna < 3; coluna++) {
                notasAlunos[linha][coluna] = read.nextFloat();
            }
        }

        float somatorio;
        for (int linha = 0; linha < notasAlunos.length; linha++) {
            somatorio = 0;
            for (int coluna = 0; coluna < 3; coluna++) {
                somatorio += notasAlunos[linha][coluna];
            }
            notasAlunos[linha][3] = somatorio / 3;
            if (notasAlunos[linha][3] < 3) {
                alunos[linha][1] = "Reprovado";
            } else if (notasAlunos[linha][3] >= 3 && notasAlunos[linha][3] < 7) {
                alunos[linha][1] = "Exame";
            } else if (notasAlunos[linha][3] >= 7) {
                alunos[linha][1] = "Aprovado";
            }
        }

        for (int linha = 0; linha < notasAlunos.length; linha++) {
            System.out.println("Condição do aluno: " + alunos[linha][0] + " = " + alunos[linha][1]);
            System.out.print("Notas: ");
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(notasAlunos[linha][coluna] + " ");
            }
            System.out.println("\nMédia : " + notasAlunos[linha][3]);
            System.out.println(" ");

        }
    }
}
