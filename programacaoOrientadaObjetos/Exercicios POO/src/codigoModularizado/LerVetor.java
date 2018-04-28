package codigoModularizado;

import java.util.*;

/**
 * @author João Felipe Fonseca Nascimento 20161LBSI120055 Programação Orientada
 *         a Objetos Emails: joao.nascimento98@academico.ifs.edu.br
 *         thecurrentuser@live.com
 */

public class LerVetor {
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void lerVetor(int vetor[]) {

		Scanner read = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a sua idade: ");
			vetor[i] = read.nextInt();
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int calcularMedia(int media, int vetor[]) {
		int count = 0;
		for (int i = 0; i < vetor.length; i++) {
			count += vetor[i];
		}
		media = count / vetor.length;
		return media;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int verIdade(int vetor[], int contador, int media){
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media){
				contador++;
			}
		}
		return contador;
	}
}