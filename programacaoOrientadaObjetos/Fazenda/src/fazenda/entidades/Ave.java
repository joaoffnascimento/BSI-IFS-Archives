package fazenda.entidades;

public class Ave extends Animal {
	private int producaoOvos;

	public Ave(String especie, String alimento, float peso, String cor, int producaoOvos) {
		super(especie, alimento, peso, cor);
		this.producaoOvos = producaoOvos;
	}

	public int getProducaoOvos() {
		return producaoOvos;
	}

	public void setProducaoOvos(int producaoOvos) {
		this.producaoOvos = producaoOvos;
	}

	@Override
	public String toString() {
		return "Ave da " + super.toString() + " | produção de Ovos: " + getProducaoOvos();
	}

}
