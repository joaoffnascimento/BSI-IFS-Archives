import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VetorPessoas metodos = new VetorPessoas();
        Scanner read = new Scanner(System.in);
        short menu = 0;

        do {

            System.out.println(" === MENU === ");
            System.out.println("1 para cadastrar uma pessoa: ");
            System.out.println("2 para listar as pessoas:");
            System.out.println("9 para sair: ");
            menu = read.nextShort();

            switch (menu) {
                case 1:

                    System.out.println("Digite o nome da pessoa: ");
                    read.nextLine();
                    String nome = read.nextLine();
                    System.out.println("Digite o CPF da pessoa:");
                    String cpf = read.nextLine();
                    Pessoa pessoa = new Pessoa(nome, cpf);
                    if (!metodos.verificarCPF(cpf) && metodos.cadastrarPessoas(pessoa)) {
                        System.out.println("Cadastro realizado! ");
                    } else {
                        System.out.println("Cadastro não realizado !");
                    }

                    break;
                case 2:

                    metodos.listarPessoas();
                    break;

            }
        } while (menu != 9);
    }
}
