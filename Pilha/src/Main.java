import java.util.Scanner;

public class Main {
    public static void listarPessoas(Pilha pilha){
        for (int i = 0; i <= pilha.getIndicePilha(); i++){
            try{
                System.out.println(pilha.desempilhar());

            } catch (PilhaVaziaException pilhaVazia){
                System.out.println("Você já listou todas as pessoas!");
            }
        }
    }



    public static void atualizarDados(Pilha pilha, String nome, float salario){
        Pilha pilhaAuxiliar = new Pilha();
        pilhaAuxiliar.inicializar(10);

        for (int i = 0; i < pilha.getIndicePilha(); i++) {
            Pessoa pessoa = (Pessoa) pilha.desempilhar();
            if(pessoa.equals(nome)){
                pessoa.setSalario(salario);
                pilhaAuxiliar.empilhar(pessoa);
            } else {
                pilhaAuxiliar.empilhar(pessoa);
            }
        }
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        short menu = -1;
        Pilha pilha = new Pilha();
        pilha.inicializar(10);
        int countPessoaCadastradas = 0;
        do {
            System.out.println("======= MENU =======");
            System.out.printf("1 - Cadastrar Pessoa: " + "\n2- Listar Pessoas: " +
                    "\n3- Atualizar Pessoas: " + "\n4- Excluir Pessoa: " + "\n5- Exibir Operacoes Extras: " +
                    "\n0- Sair.\n");
            System.out.println("Entre com uma opcao: ");
            menu = read.nextShort();

            switch (menu){
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    read.nextLine();
                    String nome = read.nextLine();
                    System.out.println("Digite a idade da pessoa: ");
                    int idade = read.nextInt();
                    System.out.println("Digite o salário da pessoa: ");
                    float salario = read.nextFloat();
                    Pessoa pessoa = new Pessoa(nome, salario, idade);
                    pilha.empilhar(pessoa);
                    System.out.println("Pessoa cadastrada !" + (countPessoaCadastradas++));
                    break;
                case 2:
                    listarPessoas(pilha);
                    System.out.println(pilha);
                    break;
                case 3:
                    System.out.println("Digite o nome da pessoa: ");
                    read.nextLine();
                    String nomeSearch = read.nextLine();
                    System.out.println("Digite o novo salário da pessoa: ");
                    float newSalario = read.nextFloat();
                    atualizarDados(pilha, nomeSearch, newSalario);
                    System.out.println("Dados atualizados !");
                    break;
            }

        } while (menu != 0);

    }
}
