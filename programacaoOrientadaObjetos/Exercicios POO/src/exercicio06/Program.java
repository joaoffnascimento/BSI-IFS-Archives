package exercicio06;
import java.util.*;
public class Program {
	public static void main (String [] args){
		Scanner read = new Scanner (System.in);
		System.out.println("Digite um número para calcular o seu fatorial: ");
		int num = read.nextInt();
		System.out.println("Resultado: "+(FatorialRecursivo.fatorial(num)));
	}
}
