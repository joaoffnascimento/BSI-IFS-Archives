package fazenda.entidades;

public class Animal {
	private String especie;
	private String alimento;
	private float peso;
	private String cor;

	public Animal(String especie, String alimento, float peso, String cor) {
		this.especie = especie;
		this.alimento = alimento;
		this.peso = peso;
		this.cor = cor;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return " especie:  " + getEspecie() + " | alimento: " + getAlimento() + " | peso: " + getPeso() + " | cor: "
				+ getCor();
	}

}
