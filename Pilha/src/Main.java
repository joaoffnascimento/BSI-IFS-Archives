import java.util.Scanner;

public class Main {

    public static void listarPessoas(int tamanhoPilha, Pilha pilha){
        for (int i = 0; i <= tamanhoPilha; i++){
            pilha.desempilhar();
        }
    }


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        short menu = -1;
        Pilha pilha = new Pilha();
        pilha.inicializar(10);

        do {
            System.out.println("======= MENU =======");
            System.out.printf("1 - Cadastrar Pessoa: " + "\n2- Listar Pessoas: " +
                    "\n3- Atualizar Pessoas: " + "\n4- Excluir Pessoa: " + "\n5- Exibir Operacoes Extras: " +
                    "\n0- Sair.\n");
            System.out.println("Entre com uma opcao: ");
            menu = read.nextShort();

            switch (menu){
                case 1:
                    Pessoa pessoa = new Pessoa("jose", 450, 18);
                    pilha.empilhar(pessoa);
                    break;
                case 2:
                    listarPessoas(pilha.tamanhoPilha(), pilha);
                    break;
            }

        } while (menu != 0);

    }
}
