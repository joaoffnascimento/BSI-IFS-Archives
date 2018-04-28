package fazenda.entidades;

public class Peixe extends Animal {

	private float profundidade;

	public Peixe(String especie, String alimento, float peso, String cor, float profundidade) {
		super(especie, alimento, peso, cor);
		this.profundidade = profundidade;
	}

	public float getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(float profundidade) {
		this.profundidade = profundidade;
	}

	public String toString() {
		return "Peixe da " + super.toString() + " | profundidade: " + getProfundidade() + " metros.";
	}

}
