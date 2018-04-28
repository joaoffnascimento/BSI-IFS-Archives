package aula02;

import java.util.*;

public class ClasseExecucao {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String texto;
		int aux;
		double aux1;
		
		Cliente fonseca = new Cliente();
		
		//indentidade única, (atributo id).
		
		fonseca.setId(1);
		
		System.out.println("Digite o seu nome: ");
		fonseca.setNome(texto = read.nextLine());
		
		System.out.println("Digite o seu endereço: ");
		fonseca.setEndereco(texto = read.nextLine());
		
		System.out.println("Digite o seu telefone: ");
		fonseca.setTelefone(texto = read.nextLine());
		
		System.out.println("Digite o seu CPF: ");
		fonseca.setCpf(texto = read.nextLine());
		
		System.out.println("Digite a sua data de nascimento: ");
		fonseca.setDataDeNascimento(texto = read.nextLine());
		
		System.out.println("Digite a sua renda familiar: ");
		fonseca.setRendaFamiliar(aux1 = read.nextFloat());
		
		System.out.println("O seu nome é: " + fonseca.getNome());
		System.out.println("O seu endereço é: " + fonseca.getEndereco());
		System.out.println("O seu telefone é: " + fonseca.getTelefone());
		System.out.println("O seu CPF é : " + fonseca.getCpf());
		System.out.println("A sua data de nascimento é: " + fonseca.getDataDeNascimento());
		System.out.println("A sua renda familiar é : " + fonseca.getRendaFamiliar());
		

	}
}
