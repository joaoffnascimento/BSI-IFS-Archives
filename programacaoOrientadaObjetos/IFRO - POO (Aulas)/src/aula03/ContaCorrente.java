package aula03;

public class ContaCorrente {
	// Atributos (Caracter�sticas da classe), getters e setters (M�todos
	// espec�ficos).
	// Quer permitem manipular os atributos de uma classe.

	private int numero;
	private String titular;
	private double saldo;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int valor) {
		numero = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String valor) {
		titular = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double valor) {
		if (valor >= 0) {
			saldo = valor;
		}
	}

	// Definir os comportamentos = m�todos.
	// Necessitam de par�metros(Informa��es) para realizar determinadas a��es.
	// O m�todo tem um tipo de retorno, ex.: void n�o retorna nada.

	public boolean Sacar(double valorDoSaque) {
		boolean conseguiuSacar = false;
		if (saldo >= valorDoSaque) {
			saldo = saldo - valorDoSaque;
			conseguiuSacar = true;
		}
		return conseguiuSacar;
	}

	public void Depositar(double valorDoDeposito) {
		saldo = saldo + valorDoDeposito;
	}

	// comportamento = construtor
	// Geralmente construtures s�o p�blicos, n�o possuem retorno e tem o mesmo
	// nome da classe
	//Pode ter parametros ou n�o

	public ContaCorrente() {
		//Definido o estado inicial de um objeto
		numero = 0;
		titular = null;
		saldo = 0;
	}
	
	//Criar um objeto passando os valores
	//Padr�o de desenvolvimento
	
	public ContaCorrente(int numero, String titular, double saldo) {
		//Dferente do construtor anterior, Parametros
		
		//Atributo = parametro
		//this.atributo da classe = recebe parametro.
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	

}
