import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Pilha cadastroPessoas = new Pilha();
        cadastroPessoas.inicializarPilha(5);
        int qtdPessoas = 0;

        int menu = -1;

        do{
            System.out.println("===== MENU =====");
            System.out.println("1- Criar uma nova pessoa.");

            menu = read.nextInt();

            switch (menu){
                case 1:

                    System.out.println("Digite o nome da pessoa: ");
                    read.nextLine();
                    String nome = read.next();
                    System.out.println("Digite o CPF da pessoa: ");
                    read.nextLine();
                    String cpf = read.nextLine();
                    System.out.println("Digite a idade da pessoa: ");
                    int idade = read.nextInt();

                    cadastroPessoas.push(criarPessoa(idade, nome, cpf));
                    qtdPessoas++;
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        }while (menu != 0);

    }


    //Operacao CRUD
    //CREATE
    public static Object criarPessoa(int idade, String nome, String cpf){
        Pessoa pessoa = new Pessoa(idade, nome, cpf);
        return pessoa;
    }

    //READ
    //Desempilhar, Listar, Empilhar novamente.
    public static void lerPessoa(Pilha cadastroPessoa, int qtdPessoas){
        Pilha auxiliar = new Pilha();
        auxiliar.inicializarPilha(5);
        Object pessoa;
        //Desempilhar para colocar exibir na ordem de entrada.
        for (int i = 0; i < qtdPessoas; i++) {
            auxiliar.push(cadastroPessoa.pop());
        }

        //Exibir as pessoas e empilhar novamente a pilha do jeito que estava.
        for (int i = 0; i <qtdPessoas ; i++) {
            pessoa = auxiliar.top();
            System.out.println(pessoa);
            cadastroPessoa.push(auxiliar.pop());
        }
    }
}
