package Aula01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("Deseja imprimir do primeiro até o qual número primo? ");
        int n = read.nextInt();
        int aux = Integer.MAX_VALUE;
        int aux2 = 0;
        int aux3 = 0;

        for (int i = 2; i <= aux; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    aux2++;
                }
            }
            if (aux2 == 2) {
                System.out.println(i + " é primo!");
                aux3++;
            }
            aux2 = 0;

            if (aux3 == n) {
                break;
            }
        }
    }
}
