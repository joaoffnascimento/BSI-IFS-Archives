package JogoAdivinhacao;

import com.google.gson.Gson;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

/**
 * @author João F.F. Nascimento em 27/09/2018
 * @project binaryTree
 */

public class Main implements Serializable {

	public static int index = 1;
	public static No raiz;

	public No getArvore() {
		return raiz;
	}

	public void setArvore(No arvore) {
		raiz = arvore;
	}

	public void inserirAnimal(No noArvore) {

		String animal = JOptionPane.showInputDialog(null, "Qual o animal que você pensou?");

		String oqueFaz = JOptionPane
				.showInputDialog("Um(a) " + animal + "______ mas um(a) " + noArvore.valor + " não.");

		String auxiliar = noArvore.valor;
		noArvore.valor = oqueFaz;
		noArvore.noDireito = new No(++index, animal);
		noArvore.noEsquerdo = new No(++index, auxiliar);
	}

	public void perguntar(No noArvore) {
		// Faz a pergunta pra ver se o animal está correto
		int pergunta = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + noArvore.valor, "Confirme",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (pergunta == 0) {
			// Se a resposta estiver correta
			if (noArvore.noDireito == null)
				JOptionPane.showMessageDialog(null, "Acertei de novo!");

			// Faz a nova pergunta pra verificar sé realmente é o animal pensado
			else {
			
				perguntar(noArvore.noDireito);
			}
			// Se resposta for não insere um novo animal caso o noEsquerdo
			// esteja vazio ou vai pra proxima pergunta
		} else {
			if (noArvore.noEsquerdo == null)
				inserirAnimal(noArvore);
			else {
				perguntar(noArvore.noEsquerdo);
			}
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Main main = new Main();

		Gson gson = new Gson();

		try {
			FileReader fw =  new FileReader(("string.json"));
			raiz = gson.fromJson(fw, No.class);

		} catch (java.io.IOException e){
			System.out.println("erro");
		}

		JOptionPane.showMessageDialog(null, "Pense em um Animal");

		// Verifica se arvore está está vazia para inicializar a mesma
		if (main.getArvore() == null) {
			main.setArvore(new No(index, "vive na agua"));
			main.getArvore().noEsquerdo = new No(++index, "Macaco");
			main.getArvore().noDireito = new No(++index, "Tubarao");
		}
		int sair = 1;
		// Permanece no laço enquanto sair = 1.
		do {
			System.out.println("Deseja sair? 0 - sim / 1 - nao");
			int a = read.nextInt();
			if(a == 0){
				break;
			}

			// Pergunta inicial
			int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + main.getArvore().valor,
					"Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			// Se resposta for Sim entra no nó direito para fazer as perguntas,
			// caso contrário entra no noEsquerdo
			if (resposta == 0) {
				main.perguntar(main.getArvore().noDireito);
			} else {
				main.perguntar(main.getArvore().noEsquerdo);
			}
			// fecha o aplicativo
			if (resposta == JOptionPane.CLOSED_OPTION) {
				sair = 0;
			}

		} while (sair == 1);

		try{

			String json = gson.toJson(raiz);
			BufferedWriter fr = new BufferedWriter(new FileWriter("string.json", false));
			fr.write(json);//escreve a arvore inteira no arquivo
			fr.flush();
			fr.close();

		} catch (java.io.IOException e){
			System.out.println("erro");
		}
	}
}
