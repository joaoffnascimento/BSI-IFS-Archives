package exercicioRecursividade;

import java.util.*;

public class QuestaoRecursiva {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite a quantidade de termos: ");
		float quantidadeTermos = read.nextFloat();
		System.out.println(equacao(quantidadeTermos));
	}

	public static float fatorial(float qnt) {
		if (qnt == 0) {
			return 1;
		} else {
			return qnt * fatorial(qnt - 1);
		}
	}

	public static float equacao(float qnt) {
		if (qnt == 1) {
			return 1;
		} else {
			return equacao(qnt - 1) +(1/ fatorial(qnt));
		}
	}
}
