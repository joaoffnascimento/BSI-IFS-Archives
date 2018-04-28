package exercicio06;

public class FatorialRecursivo {
	public static int fatorial(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * fatorial(numero - 1);
		}
	}
}
