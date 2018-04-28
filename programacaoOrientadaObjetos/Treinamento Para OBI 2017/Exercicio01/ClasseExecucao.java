import java.util.*;

public class ClasseExecucao {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float altura, peso;
		boolean pesoIdeal = false;
		System.out.println("Digite o seu sexo: ");
		char sexo = read.next().charAt(0);
		switch (sexo) {
		case 'm':
			pesoIdeal = (Metodo.calculoMulher(read.nextFloat(), read.nextFloat()));
			if (pesoIdeal) {
				System.out.println("Você está com o peso ideal!");
			} else {
				System.out.println("Você não está com o peso ideal!");
			}
			break;
		case 'h':
			pesoIdeal = (Metodo.calculoHomem(read.nextFloat(), read.nextFloat()));
			if (pesoIdeal) {
				System.out.println("Você está com o peso ideal!");
			} else {
				System.out.println("Você não está com o peso ideal!");
			}
			break;
		}
	}
}
