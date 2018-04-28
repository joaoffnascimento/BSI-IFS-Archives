package Aula02;

import java.util.Scanner;

/**
 * Created by aluno on 25/08/2017.
 */

public class Questao06 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int codigoCidade, numeroVeiculosPasseio, numeroAcidentes;

        int maiorIndice = Integer.MIN_VALUE;
        int menorIndice = Integer.MAX_VALUE;
        int mediaVeiculos = 0;
        int mediaAcidentes = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o código da cidade: ");
            codigoCidade = read.nextInt();
            System.out.println("Digite o número de veículos de passeio em 1999: ");
            numeroVeiculosPasseio = read.nextInt();
            System.out.println("Digite o número de acidentes em 1999: ");
            numeroAcidentes = read.nextInt();

            if (numeroAcidentes > maiorIndice) {
                maiorIndice = numeroAcidentes;
            }
            if (numeroAcidentes < menorIndice) {
                menorIndice = numeroAcidentes;
            }

            mediaVeiculos += numeroVeiculosPasseio;

            if (numeroVeiculosPasseio < 2000) {
                mediaAcidentes = numeroVeiculosPasseio / numeroAcidentes;
                System.out.println("Media de acidentes na cidade com menos de 2000 veículos: " + mediaAcidentes);
            }


        }
        System.out.println("Maior índice de acidentes de transito: " + maiorIndice);
        System.out.println("Menor índice de acidentes de transito: " + menorIndice);
        System.out.println("Media de veículos nas 5 cidades: " + mediaVeiculos / 5);
    }
}
