import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        VetorPessoa metodos = new VetorPessoa();
        int menu = 0;

        do {
            System.out.println("Digite uma opção: 1 = cadastrar pessoa / 2 = exibir pessoas cadastradas");
            menu = read.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite o seu nome:");
                    read.nextLine();
                    String nome = read.nextLine();
                    System.out.println("Digite o seu CPF:");
                    String cpf = read.nextLine();
                    System.out.println("Digite a sua data de nascimento no seguinte modelo dd/mm/yyyy:");
                    String dataNascimento = read.nextLine();

                    Pessoa pessoa = new Pessoa(nome, dataNascimento, cpf);
                    if (!metodos.verificarCPF(cpf) && metodos.cadastrarPessoa(pessoa)) {
                        System.out.println("Pessoa cadastrada com sucesso !");
                    } else {
                        System.out.println("Pessoa não cadastrada !");
                    }
                    //Ordenar os cadastros ordem decrescente;
                    metodos.selectionSort();
                    break;
                case 2:
                    metodos.exibirPessoas();
                    break;
            }


        } while (menu != 9);

    }
}

