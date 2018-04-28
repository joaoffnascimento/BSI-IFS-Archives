/**
 * Created by aluno on 25/08/2017.
 */
package Aula02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário mínimo: ");
        float salarioMinimo = read.nextFloat();
        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = read.nextInt();
        System.out.println("Digite o número de dependentes do funcionário: ");
        int numeroDependentes = read.nextInt();
        System.out.println("Digite o número de horas extras trabalhadas: ");
        int horasExtras = read.nextInt();

        float valorHoraTrabalhadas = (salarioMinimo / 5);

        float salarioMensal = horasTrabalhadas * valorHoraTrabalhadas;

        float salarioBruto = salarioMensal;

        salarioBruto += ((valorHoraTrabalhadas * 50) / 100) * horasExtras;

        salarioBruto += numeroDependentes * 32.0f;

        float valorImposto = 0;

        if (salarioBruto < 200) {
            System.out.println("Você foi isento de impostos ");
        } else if (salarioBruto >= 200 && salarioBruto < 500) {
            valorImposto = (salarioBruto * 10) / 100;
        } else if (salarioBruto >= 500) {
            valorImposto = ((salarioBruto * 20) / 100);
        }

        float salarioLiquido = salarioBruto - valorImposto;
        float gratificacao = 0;
        if (salarioLiquido <= 350) {
            gratificacao = 100;
        } else if (gratificacao > 350) {
            gratificacao = 50;
        }

        System.out.println("Você irá receber R$" + salarioLiquido + gratificacao);
    }
}
