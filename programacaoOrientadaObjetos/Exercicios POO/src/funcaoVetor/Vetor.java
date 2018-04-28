package funcaoVetor;
import java.util.*;
public class Vetor {
	public static boolean funcaoVetor(int v[], int n, int x, boolean ver){
		Scanner read = new Scanner(System.in);
		Random random = new Random();
		v = new int[n];
		System.out.println("Digite um resultado para X");
		x = read.nextInt();
		int soma = 0;
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite algum valor para preencher o vetor: ");
			v[i]= read.nextInt();
			soma += v[i];
		}
		
		if (soma == x){
			ver = true;
		} else if (soma != x){
			ver = false;
		}
		
		if (ver) {
			System.out.println("A soma dos valores do vetor é igual ao número X");
		} else if (!ver){
			System.out.println("A soma dos valores do vetor não é igual ao número X");
		}
		return ver;		
	}
}
