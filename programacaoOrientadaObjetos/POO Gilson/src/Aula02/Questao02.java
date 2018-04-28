/**
 * Created by aluno on 25/08/2017.
 */
package Aula02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Digite o seu cargo\n1 - Escrituário\n2 - Secretário\n3 - Caixa"
                + "\n4 - gerente\n5 - Diretor\n");
        short cargo = read.nextShort();
        System.out.println("Digite o seu salário: ");
        float salario = read.nextFloat();

        switch (cargo) {
            case 1:
                System.out.println("Seu cargo: Escrituário");
                System.out.println("Seu aumento R$: " + ((salario * 50) / 100));
                System.out.println("Seu salário com aumento R$ " + (salario + ((salario * 50) / 100)));
                break;
            case 2:
                System.out.println("Seu cargo: Secretário");
                System.out.println("Seu aumento R$: " + ((salario * 35) / 100));
                System.out.println("Seu salário com aumento R$ " + (salario + ((salario * 35) / 100)));
                break;
            case 3:
                System.out.println("Seu cargo: Caixa");
                System.out.println("Seu aumento R$: " + ((salario * 20) / 100));
                System.out.println("Seu salário com aumento R$ " + (salario + ((salario * 20) / 100)));
                break;
            case 4:
                System.out.println("Seu cargo: Gerente");
                System.out.println("Seu aumento R$: " + ((salario * 10) / 100));
                System.out.println("Seu salário com aumento R$ " + (salario + ((salario * 10) / 100)));
                break;
            case 5:
                System.out.println("Seu cargo: Diretor");
                System.out.println("Seu salário R$ " + salario);
                break;
            default:
                System.out.println("Opção inválida !");
                break;
        }
    }
}
