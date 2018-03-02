import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        short menu = -1;
        do {
            System.out.println("======= MENU =======");
            System.out.printf("1 - Cadastrar Pessoa: " + "\n2- Listar Pessoas: " +
                    "\n3- Atualizar Pessoas: " + "\n4- Excluir Pessoa: " + "\n5- Exibir Operacoes Extras: " +
                    "\n0- Sair.\n");

        } while (menu != 0);

    }
}
