/**
 * Created by aluno on 25/08/2017.
 */
package Aula02;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número N para calcular o seu fatorial: ");
        int n = read.nextInt();

        int fatorial = 1;
        for (int i = 1; i < n; i++) {

            fatorial += fatorial * i;
        }

        System.out.println("Fatorial " + fatorial);

    }
}
