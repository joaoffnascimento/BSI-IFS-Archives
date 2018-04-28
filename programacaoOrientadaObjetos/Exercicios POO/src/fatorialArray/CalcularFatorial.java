package fatorialArray;

import java.util.*;

public class CalcularFatorial {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite a quatidade de valores que deseja obter: ");
		int qtd = read.nextInt();
		int valores[] = new int[qtd];
		int resultado[] = new int[qtd];
		Fatorial.methodFatorial(valores, resultado);
	}
}
