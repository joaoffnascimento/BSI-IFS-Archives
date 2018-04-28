package funcaoVetor;
import java.util.*;
public class FuncaoVetor {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = 0,x = 0;
		System.out.println("Digite a quantidade de valores que o vetor possui: ");
		n = read.nextInt();
		int v[] = new int[n];
		boolean ver = false;
		Vetor.funcaoVetor(v, n, x, ver);
	}
}
