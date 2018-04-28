import java.util.*;
public class Divisores {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		do {
			numero = read.nextInt();
		} while ((numero < 0) || (numero > 10000));
		int aux = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				aux++;
			}
		}
		System.out.println(aux);
	}
}