package aula03;

import java.util.*;

public class ClasseExecucao {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		ContaCorrente contaFonseca = new ContaCorrente();

		System.out.println("Digite o nome do titular da conta: ");
		contaFonseca.setTitular(read.nextLine());
		System.out.println("Digite o número da sua conta: ");
		contaFonseca.setNumero(read.nextInt());
		System.out.println("Digite o seu saldo: ");
		contaFonseca.setSaldo(read.nextDouble());

		System.out.println("Nome do titular: " + contaFonseca.getTitular());
		System.out.println("Número da conta: " + contaFonseca.getNumero());
		System.out.println("Saldo da conta: R$" + contaFonseca.getSaldo());
		System.out.println();
		int flag = 1;
		int op = 0;
		double valorSaque;
		double valorDeposito;
		while (flag == 1) {
			System.out.println("Digite a operação desejada: 10 = Sacar / 11 = Depositar");
			op = read.nextInt();
			switch (op) {
			case 10:
				System.out.println("Digite o valor do saque: ");
				contaFonseca.Sacar(valorSaque = read.nextFloat());
				if (contaFonseca.Sacar(valorSaque)) {
					System.out.println("Saque efetuado com sucesso!");
				} else {
					System.out.println("Saldo Insuficiente! ");
				}
				break;
			case 11:
				System.out.println("Digite o valor do deposito: ");
				contaFonseca.Depositar(valorDeposito = read.nextFloat());
				break;
			default:
				System.out.println("Operação inválida.");
				break;
			}
			System.out.println("Deseja continuar? 0 para NAO / 1 para SIM");
			flag = read.nextInt();
		}
		// Criado um objeto com um construtor que tem parametros

		ContaCorrente contaFelipe = new ContaCorrente(123, "felipe", 10000);
	}
}
