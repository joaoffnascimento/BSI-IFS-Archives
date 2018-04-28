package codigoEstruturado;
import java.util.*;

/**
 * @author João Felipe Fonseca Nascimento
 *		   20161LBSI120055
 *         Programação Orientada a Objetos
 *	       Emails:
 *		  	 joao.nascimento98@academico.ifs.edu.br
 *		  	 thecurrentuser@live.com
 */

//Ler a idade de 50 homens e 50 mulheres e armazenar em 2 vetores;
//Calcular a média das idades dos homens e das mulheres;
//Verificar quantos homens tem a idade maior que a média da idade das mulheres;
//Verificar quantas mulheres tem a idade maior que a média da idade dos homens;

public class AtividadeImperativa {
	public static void main (String [] args){
		Scanner read = new Scanner (System.in);
		int idadesHomens [] = new int [5];
		int idadesMulheres [] = new int [5];
		int somatorioHomens = 0, somatorioMulheres = 0;
		int mediaHomens, mediaMulheres;
		
		for (int i = 0; i < idadesMulheres.length; i++) {
			System.out.println("Digite a sua idade (Homen): ");
			idadesHomens[i] = read.nextInt();
			somatorioHomens += idadesHomens[i];
			System.out.println("Digite a sua idade (Mulher): ");
			idadesMulheres[i] = read.nextInt();
			somatorioMulheres += idadesMulheres[i];
			
		}
		
		mediaHomens = somatorioHomens / idadesHomens.length;
		mediaMulheres = somatorioMulheres / idadesMulheres.length;
		
		int quantidadeHomens = 0;
		int quantidadeMulheres = 0;
				
		for (int i = 0; i < idadesMulheres.length; i++) {
			if (idadesHomens[i] > mediaMulheres) {
				quantidadeHomens++;
			}
			if (idadesMulheres[i] > mediaHomens) {
				quantidadeMulheres++;
			}
		}
		System.out.println("Quantidade de homens que tem a idade maior que a media das idadades das mulheres : "+quantidadeHomens);
		System.out.println("Quantidade de mulheres que tem a idade maior que a media das idadades dos Homens : "+quantidadeMulheres);
	}
}