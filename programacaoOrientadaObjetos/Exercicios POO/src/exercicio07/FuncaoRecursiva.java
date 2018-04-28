package exercicio07;
//
public class FuncaoRecursiva {
	public float equacaoRecursiva(int qtd) {
		float resultado = 2;
		if (qtd == 0) {
			return 0;
		} else if (qtd == 1) {
			return 1;
		} else if (qtd == 2) {
			return 2;
		} else {
			return resultado + (1 / fatorialRecursivo(qtd - 1));
		}
	}

	public int fatorialRecursivo(int fat) {
		if (fat == 0) {
			return 1;
		} else {
			return fat * fatorialRecursivo(fat - 1);
		}
	}
}
