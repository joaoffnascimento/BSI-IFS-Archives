package Aula02;

import java.util.*;

public class Questao08 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        short idade = 1;
        char sexo, experiencia;
        int countSexoFeminino = 0;
        int countSexoMasculino = 0;
        float mediaHomensExperiencia = 0.0f;
        int countHomensExperiencia = 0;
        float porcentagemHomens = 0.0f;
        float mulheresExperiencia = 0.0f;
        int menorIdadeMulheres = Integer.MAX_VALUE;

        do {
            System.out.println("Digite a sua idade: ");
            idade = read.nextShort();
            System.out.println("Qual o seu sexo: M / F");
            sexo = read.next().charAt(0);
            System.out.println("Você tem alguma experiencia no serviço? S / N");
            experiencia = read.next().charAt(0);
            switch (sexo) {
                case 'm':
                    countSexoMasculino++;
                    if (idade > 45) {
                        porcentagemHomens++;
                    }
                    switch (experiencia) {
                        case 's':
                            mediaHomensExperiencia += idade;
                            countHomensExperiencia++;
                            break;
                    }
                    break;
                case 'f':
                    countSexoFeminino++;
                    switch (experiencia) {
                        case 's':
                            if (idade < 35) {
                                mulheresExperiencia++;
                            }

                            if (idade < menorIdadeMulheres) {
                                menorIdadeMulheres = idade;
                            }

                            break;
                    }
                    break;
            }

        } while (idade != 0);

        System.out.println("Quantidade de candidatos do sexo Feminino = " + countSexoFeminino);
        System.out.println("Quantidade de candidatos do sexo Masculino = " + countSexoMasculino);
        System.out.println("Media da idade dos homens que ja tem experiencia no serviço =  " +
                (mediaHomensExperiencia / countHomensExperiencia));
        System.out.println("A porcentagem de homens com mais de 45 anos entre o total dos homens = " +
                (countSexoMasculino) / porcentagemHomens + " %");
        System.out.println("O número de mulheres com idade inferior a 35 anos e com experiencia no serviço = " +
                mulheresExperiencia);
        System.out.println("A menor idade entre as muheres que já tem experiencia no serviço = " +
                menorIdadeMulheres);

    }
}
