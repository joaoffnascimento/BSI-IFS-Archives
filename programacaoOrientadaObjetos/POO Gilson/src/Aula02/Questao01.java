/**
 * Created by aluno on 25/08/2017.
 */
package Aula02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        float nota1, nota2, nota3;

        System.out.println("Entre com a primeira nota: ");
        nota1 = read.nextFloat();
        System.out.println("Entre com a segunda nota: ");
        nota2 = read.nextFloat();
        System.out.println("Entre com a terceira nota: ");
        nota3 = read.nextFloat();

        float media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5));
        System.out.printf("Sua média : %.2f\n", media);
        if (media >= 8 && media <= 10) {
            System.out.println("Conceito A");
        } else if (media >= 7 && media < 8) {
            System.out.println("Conceito B");
        } else if (media >= 6 && media < 7) {
            System.out.println("Conceito C");
        } else if (media >= 5 && media < 6) {
            System.out.println("Conceito D");
        } else if (media >= 0 && media < 5) {
            System.out.println("Conceito E");
        }
    }
}
