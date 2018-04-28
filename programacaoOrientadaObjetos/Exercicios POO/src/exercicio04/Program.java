package exercicio04;
import java.util.*;

public class Program {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número para ser calculado o seu módulo: ");
		float modulo = 0.0f;
		Funcoes.moduloValor(modulo);

		System.out.println("Digite dois valores para verificar o maior entre eles: ");
		float a = 0, b = 0;
		Funcoes.maiorNumero(a, b);
		
		System.out.println("Informe um número para ser arredondado: ");
		float numeroArredondar = 0.0f;
		System.out.println(Funcoes.arredondar(numeroArredondar));
	}
}
