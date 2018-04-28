package exercicio09;
import java.util.Scanner;

public class FuncaoFibonacci {
	public static int fibonacci(int seq) {
		Scanner read = new Scanner (System.in);
		int resultado = 1;
		int numSoma = 0;
		int aux;
		int quantidadeSomas = 0;
		seq = read.nextInt();
		for (int i = 0; i < seq; i++) {
			System.out.print(resultado+ " ");
			aux = resultado;
			resultado += numSoma;
			numSoma = aux;
			quantidadeSomas++;
		}
		System.out.println("Quantidade de somas: ");
		return quantidadeSomas;
	}
}
