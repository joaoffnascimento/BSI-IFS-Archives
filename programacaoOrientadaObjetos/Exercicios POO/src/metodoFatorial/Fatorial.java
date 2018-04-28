package metodoFatorial;

import java.util.*;

public class Fatorial {
	public static int fatorial(int resultado) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Digite algum número inteiro para ser calculado o seu fatorial: ");
		int numero = read.nextInt();
		resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		
		return resultado;
	}
}
