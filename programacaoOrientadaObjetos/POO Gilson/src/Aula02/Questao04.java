/**
 * Created by aluno on 25/08/2017.
 */
package Aula02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número N: ");
        int n = read.nextInt();
        System.out.println("Digite um número M: ");
        int m = read.nextInt();

        System.out.println("\nOrdem crescente: ");

        for (int i = n; i <= m; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nOrdem decrescente: ");

        for (int i = m; i >= n; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nOs números pares: ");

        for (int i = n; i <= m; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        int aux = 0;
        for (int i = n; i <= m; i++) {
            aux += i;
        }
        System.out.println("\nSoma dos números entre eles: " + aux);
    }
}
