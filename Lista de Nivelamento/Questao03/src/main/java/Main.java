import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        VetorPessoa metodos = new VetorPessoa();
        int menu = 0;

        do {
            System.out.println("Digite uma opção: ");
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
                    int ano = metodos.anoNascimento(dataNascimento);
                    int mes = metodos.mesNascimento(dataNascimento);
                    int dia = metodos.diaNascimento(dataNascimento);

                    Pessoa pessoa = new Pessoa(nome, dataNascimento, cpf);
                    if (!metodos.verificarCPF(cpf) && metodos.cadastrarPessoa(pessoa)) {
                        System.out.println("Pessoa cadastrada com sucesso !");
                    } else {
                        System.out.println("Pessoa não cadastrada !");
                    }
                    break;
                case 2:
                    metodos.exibirPessoas();
                    break;
            }


        } while (menu != 9);

    }
}

