package fazenda.entidades;

public class Bovino extends Animal {
	private float producaoLeite;

	public Bovino(String especie, String alimento, float peso, String cor, float producaoLeite) {
		super(especie, alimento, peso, cor);
		this.producaoLeite = producaoLeite;
	}

	public float getProducaoLeite() {
		return producaoLeite;
	}

	public void setProducaoLeite(float producaoLeite) {
		this.producaoLeite = producaoLeite;
	}

	@Override
	public String toString() {
		return "Bovino da " + super.toString() + " | produção Leite: " + getProducaoLeite() + " litros.";
	}

}
