package fatorialArray;

import java.util.*;

public class Fatorial {
	public static void methodFatorial(int valores[], int resultado[]) {
		Random random = new Random();
		int aux = 1;
		for (int i = 0; i < valores.length; i++) {
			do {
				valores[i] = random.nextInt(20);
			} while (valores[i] <= 0);
		}
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 1; j <= valores[i]; j++) {
				aux *= j;
			}
			resultado[i] = aux;
			aux = 1;
		}
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(resultado[i] + " é fatorial de = "+valores[i]);
		}
	}
}
