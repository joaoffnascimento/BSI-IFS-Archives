package arrayInteirosAleatorios;

import java.util.*;

public class criarVetor {
	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite a quantidade de elementos: ");
		int qtd = read.nextInt();
		int numeros[] = new int[qtd];
		String paridade[] = new String[qtd];
		vetor.methodVetor(numeros, paridade);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " é " + paridade[i]);
		}
	}
}
