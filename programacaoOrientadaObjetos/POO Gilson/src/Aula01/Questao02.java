package Aula01;

import java.util.*;

public class Questao02 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int qtdFuncionarios;

        short flag = 0;
        do {

            float salarioBase = 1200f;

            System.out.println("Deseja cadastrar quantos funcionarios? ");
            qtdFuncionarios = read.nextInt();

            float maiorSalario = Integer.MIN_VALUE;
            String funcionarioMaiorSalario = " ";
            String nomeFuncionario[] = new String[qtdFuncionarios];
            int tempoEmpresa[] = new int[qtdFuncionarios];
            int numeroDependentes[] = new int[qtdFuncionarios];
            String cargo[] = new String[qtdFuncionarios];
            float novoSalario[] = new float[qtdFuncionarios];
            String diaria[] = new String[qtdFuncionarios];
            float totalPagamento = 0;
            Integer diariaNacional[] = new Integer[qtdFuncionarios];

            for (int i = 0; i < qtdFuncionarios; i++) {
                read.nextLine();
                System.out.println("Digite o seu nome: ");
                nomeFuncionario[i] = read.nextLine();
                read.nextLine();
                System.out.println("Digite o seu tempo na empresa: ");
                tempoEmpresa[i] = read.nextInt();
                read.nextLine();
                System.out.println("Digite o numero de pessoas que dependem de voce: ");
                numeroDependentes[i] = read.nextInt();
                read.nextLine();
                System.out.println("Digite o seu cargo na empresa: gerente ou auxliar");
                cargo[i] = read.nextLine();
                read.nextLine();

                switch (cargo[i].toLowerCase()) {
                    case "gerente":
                        System.out.println("Digite o seu tipo de diária: ");
                        diaria[i] = read.nextLine();
                        read.nextLine();
                        break;
                    default:
                        break;

                }

                switch (cargo[i].toLowerCase()) {
                    case "gerente":

                        novoSalario[i] = (salarioBase + (salarioBase * 30) / 100);
                        novoSalario[i] = novoSalario[i] + numeroDependentes[i] * 360f;
                        switch (diaria[i].toLowerCase()) {
                            case "nacional":
                                novoSalario[i] += 145f * tempoEmpresa[i];
                                diariaNacional[i] = (int) 145f * tempoEmpresa[i];
                                break;

                            case "internacional":
                                novoSalario[i] += 500f * tempoEmpresa[i];
                                break;
                        }
                        break;
                    case "auxiliar":
                        novoSalario[i] = (salarioBase + (salarioBase * 15) / 100);
                        novoSalario[i] = novoSalario[i] + numeroDependentes[i] * 360f;
                        break;
                }

                totalPagamento += novoSalario[i];

                if (novoSalario[i] > maiorSalario) {
                    maiorSalario = novoSalario[i];
                    funcionarioMaiorSalario = nomeFuncionario[i];
                }

            }


            for (int i = 0; i < qtdFuncionarios; i++) {
                System.out.println("Nome do funcionário: " + nomeFuncionario[i]);
                System.out.println("Salario do funcionario R$ " + novoSalario[i]);
                System.out.println("Numero de dependentes = " + numeroDependentes[i]);
                System.out.println("Seu cargo =  " + cargo[i]);
                System.out.println(" ");


            }

            System.out.println(" ");
            System.out.println("Valores gastos com Diárias nacionais; decrescentes: ");
            Arrays.sort(diariaNacional, Collections.reverseOrder());
            for (float x : diariaNacional) {
                System.out.println("R$ " + x);
            }
            System.out.println(" ");

            System.out.println(" ");
            System.out.println("O maior salario é do funcionário " + funcionarioMaiorSalario + " com R$ " + maiorSalario);
            System.out.println("Total a ser pago R$ " + totalPagamento);
            System.out.println(" ");
            System.out.println("Deseja continuar? ===  -1 para não ===");
            flag = read.nextShort();
        } while (flag != -1);

    }

}
