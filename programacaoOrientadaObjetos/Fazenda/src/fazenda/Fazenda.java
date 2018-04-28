package fazenda;

import fazenda.entidades.*;
import java.util.Scanner;

public class Fazenda {

	Animal[] animais = new Animal[10];
	int qtd = 0;

	// Métodos para cadastrar
	public boolean cadastrarAnimal(Animal animal) {
		if (qtd >= animais.length)
			return false;

		this.animais[qtd] = animal;
		qtd++;
		return true;
	}

	// Métodos para listar
	public void listarAnimais() {
		for (int i = 0; i < qtd; i++) {
			System.out.println(animais[i]);
		}
	}

	// Método para excluir animal
	public boolean excluirAnimal(String especie) {
		for (int i = 0; i < qtd; i++) {
			if (animais[i].getEspecie().equalsIgnoreCase(especie)) {
				qtd--;
				animais[i] = animais[qtd];
				return true;
			}
		}
		return false;
	}

	// Método para consultar animal por espécie.
	public void consultarEspecie(String especie) {
		int count = 0;
		for (int i = 0; i < qtd; i++) {
			if (animais[i].getEspecie().equalsIgnoreCase(especie)) {
				System.out.println(animais[i]);
				count++;
			}
		}
		if (count < 1) {
			System.out.println("Animal não encontrado ! ");
		}
	}

	// Método para listar todos os Bovinos

	public void listarBovinos() {
		for (int i = 0; i < qtd; i++) {
			if (animais[i] instanceof Bovino) {
				System.out.println(animais[i]);
			}
		}
	}

	// Método para listar aves que coloca mais de 2 ovos por dia

	public void listarAves() {
		for (int i = 0; i < qtd; i++) {
			if (animais[i] instanceof Ave) {
				Ave ave = (Ave) animais[i];
				int qtdOvos = ave.getProducaoOvos();
				if (qtdOvos > 2) {
					System.out.println(animais[i]);
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Fazenda metodos = new Fazenda();

		byte opcaoMenu = 0;
		do {
			System.out.println("\n=== Menu ===");
			System.out.println("1- Cadastrar animal.");
			System.out.println("2- Listar todos os animais.");
			System.out.println("3- Consultar animal por espécie.");
			System.out.println("4- Listar todos os Bovinos.");
			System.out.println("5- Listar aves que produzem mais de 2 ovos por dia.");
			System.out.println("6- Remover animal do cadastro.");
			System.out.println("7- Sair.");
			System.out.print("Escolha uma opção: \n");
			opcaoMenu = read.nextByte();
			byte opcaoAnimal;

			switch (opcaoMenu) {
			case 1:
				String especie;
				String alimento;
				float peso;
				String cor;

				System.out.println("Deseja cadastrar (1- Bovino / 2- Ave / 3- Peixe)");
				opcaoAnimal = read.nextByte();

				System.out.println("Digite a espécie: ");
				especie = read.next();
				System.out.println("Digite a alimentação: ");
				alimento = read.next();
				System.out.println("Digite a cor do animal: ");
				cor = read.next();
				System.out.println("Digite o peso do animal: ");
				peso = read.nextFloat();

				switch (opcaoAnimal) {
				case 1:
					System.out.println("Digite a produção de leite em litros: ");
					float producaoLeite = read.nextFloat();
					Bovino bovino = new Bovino(especie, alimento, peso, cor, producaoLeite);

					if (metodos.cadastrarAnimal(bovino)) {
						System.out.println("Animal cadastrado com sucesso !");
					} else {
						System.out.println("Animal não cadastrado !");
					}

					break;
				case 2:
					System.out.println("Digite a quantidade de ovos: ");
					int producaoOvos = read.nextInt();
					Ave ave = new Ave(especie, alimento, peso, cor, producaoOvos);

					if (metodos.cadastrarAnimal(ave)) {
						System.out.println("Animal cadastrado com sucesso !");
					} else {
						System.out.println("Animal não cadastrado !");
					}

					break;
				case 3:
					System.out.println("Digite a profundidade: ");
					float profundidade = read.nextFloat();
					Peixe peixe = new Peixe(especie, alimento, peso, cor, profundidade);

					if (metodos.cadastrarAnimal(peixe)) {
						System.out.println("Animal cadastrado com sucesso !");
					} else {
						System.out.println("Animal não cadastrado !");
					}

					break;
				}

				break;
			case 2:
				metodos.listarAnimais();
				break;
			case 3:
				System.out.println("Digite a espécie: ");
				especie = read.next();
				metodos.consultarEspecie(especie);
				break;
			case 4:
				metodos.listarBovinos();
				break;
			case 5:
				metodos.listarAves();
				break;
			case 6:
				System.out.println("Digite a espécie do animal que deseja excluir: ");
				especie = read.next();
				if (metodos.excluirAnimal(especie)) {
					System.out.println("Animal excluido com sucesso !");
				} else {
					System.out.println("Animal não encontrado !");
				}
				break;
			}

		} while (opcaoMenu != 7);

	}

}
