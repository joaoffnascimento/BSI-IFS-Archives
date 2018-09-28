package JogoAdivinhacao;

/**
 * @author João F.F. Nascimento em 27/09/2018
 * @project binaryTree
 */

import java.io.Serializable;

/** Entidade que representa um nó da arvore binária */
public class No implements Serializable {

	public int elemento;
	public No noEsquerdo;
	public No noDireito;
	public String valor;

	/** Construtor que seta os valores da arvore */
	public No(int elemento, String valor) {
		System.out.println(elemento + " - " + valor);
		this.elemento = elemento;
		this.valor = valor;
	}

	public No() {

	}

}
