package Questao01;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o seu sexo: h para homens e m para mulheres");
		char sexo = read.next().charAt(0);
		switch (sexo) {
		case 'm':
			System.out.println("Digite a sua altura:");
			float altura = read.nextFloat();
			float resultado = ((72.7f * altura) - 58);
			System.out.println("Digite o seu peso: ");
			float peso = read.nextFloat();
			if(peso == resultado){
				System.out.println("Peso ideal.");
			} else {
				System.out.println("Peso nao ideal");
			}
			break;
		case 'h':
			System.out.println("Digite a sua altura:");
			float altura2 = read.nextFloat();
			float resultado2 = ((72.7f * altura2) - 58);
			System.out.println("Digite o seu peso: ");
			float peso1 = read.nextFloat();
			if(peso1 == resultado2){
				System.out.println("Peso ideal.");
			} else {
				System.out.println("Peso nao ideal");
			}
			break;
		default:
			System.out.println("Opcaoo invalida!");
			break;
		}
	}
}
