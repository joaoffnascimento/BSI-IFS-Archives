package exercicio08;
import java.util.*;
public class Program {
	public static void main (String  [] args){
		Scanner read = new Scanner (System.in);
		System.out.println("Digite um n�mero para ser calculado o seu somat�rio: ");
		int numero = read.nextInt();
		System.out.println(FuncaoRecursiva.somatorio(numero));
	}
}
