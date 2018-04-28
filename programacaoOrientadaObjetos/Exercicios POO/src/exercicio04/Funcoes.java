package exercicio04;
import java.util.*;

public class Funcoes {

	public static void moduloValor(float numReal) {
		Scanner read = new Scanner(System.in);
		numReal = read.nextFloat();
		if (numReal >= 0) {
			System.out.println("Seu módulo é: " + numReal);
		} else {
			System.out.println("Seu módulo é " + (numReal * (-1)));
		}
	}

	public static void maiorNumero(float numUm, float numDois) {
		Scanner read = new Scanner(System.in);
		numUm = read.nextFloat();
		numDois = read.nextFloat();
		if (numUm > numDois){
			System.out.println("O maior número real digitado é :"+ numUm);
		} else {
			System.out.println("O maior número real digitado é: "+ numDois);
		}
	}
	
	public static int arredondar(float numArredondar){
		int numArredondado = 0; 
		Scanner read = new Scanner(System.in);
		numArredondar = read.nextFloat();
		int aux = (int) numArredondar;
		float aux1 = numArredondar - aux;
		if (aux1 <= 0.5){
			numArredondado = aux;
		} else if (aux1 > 0.5){
			numArredondado = aux + 1;
		}
		return numArredondado;
	}
}
