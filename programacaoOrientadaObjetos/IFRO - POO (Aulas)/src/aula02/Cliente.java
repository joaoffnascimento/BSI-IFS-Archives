package aula02;

public class Cliente {
	// Características de um objeto
	// padrão de projeto, utilizando atributos protegidos (private)
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private double rendaFamiliar;
	private String dataDeNascimento;

	// criação de getters e setters para cada atributo da classe.

	public String getNome() {
		return nome;
	}

	public void setNome(String valor) {
		nome = valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String valor) {
		endereco = valor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String valor) {
		telefone = valor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String valor) {
		if (valor.length() == 14) {
			cpf = valor;
		}
	}

	public double getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(double valor) {
		if (valor >= 0) {
			rendaFamiliar = valor;
		}
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String valor) {
		dataDeNascimento = valor;
	}

	// A classe tem que ter uma indentidade única, (atributo id).
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int valor) {
		id = valor;
	}

}
