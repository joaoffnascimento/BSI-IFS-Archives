package codigoModularizado;

import java.util.*;
/**
 * João Felipe Fonseca Nascimento
 * 20161LBSI120055
 * Programação Orientada a Objetos
 * Emails: joao.nascimento98@academico.ifs.edu.br;
 * thecurrentuser@live.com
 */


public class AtividadeComMetodo {
	public static void main(String[] args) {
		// Objeto criado e instanciado.
		LerVetor vetor = new LerVetor();
		// Objeto realiza a ação.
		int[] idadesMulheres = new int[50];
		int[] idadesHomens = new int[50];
		System.out.println("Idades dos Homens: ");
		vetor.lerVetor(idadesHomens);
		System.out.println("Idades das Mulheres: ");
		vetor.lerVetor(idadesMulheres);
		//Objeto criado e instanciado.
		LerVetor calcularMedia = new LerVetor();
		// Objeto realiza a ação.
		int mediaMasculina = 0;
		int mediaFeminina = 0;
		mediaMasculina = calcularMedia.calcularMedia(mediaMasculina, idadesHomens);
		mediaFeminina = calcularMedia.calcularMedia(mediaFeminina, idadesMulheres);
		System.out.println("Media das idades dos homens ");
		System.out.println(mediaMasculina);
		System.out.println("Media das idades das mulheres ");
		System.out.println(mediaFeminina);
		LerVetor verIdade = new LerVetor();
		int quantidadeHomens = 0, quantidadeMulheres = 0;
		int contador = 0;
		quantidadeHomens = verIdade.verIdade(idadesHomens, contador, mediaFeminina);
		System.out.println("Quantidade de homens que tem a idade maior que a media das idadades das mulheres : "+quantidadeHomens);
		quantidadeMulheres = verIdade.verIdade(idadesMulheres, contador, mediaMasculina);
		System.out.println("Quantidade de mulheres que tem a idade maior que a media das idadades dos Homens : "+quantidadeMulheres);
		
	}
}