package questao01;

import java.util.Scanner;

public class Main {

    public static final int TAMANHO_PILHA = 5;

    public static boolean iguais(IPilha pilhaA, IPilha pilhaB) {
        int countAux = 0;

        do {
            if (pilhaA.pop().equals(pilhaB.pop())) {
                countAux++;
            }
        } while (!pilhaA.isEmpty());

        if (countAux == TAMANHO_PILHA) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int menu = -1;

        Pilha pilhaA = Pilha.createPilhaFactory(TAMANHO_PILHA);
        Pilha pilhaB = Pilha.createPilhaFactory(TAMANHO_PILHA);

        do {
            System.out.println("==================== MENU ====================");
            System.out.println("1- Preencher Pilha 1");
            System.out.println("2- Preencher Pilha 2");
            System.out.println("3- Verificar se são iguais");
            System.out.println("4- resetar pilhas");
            System.out.println("0- Sair.");
            menu = read.nextInt();

            switch (menu) {
                case 1:
                    do {
                        try {
                            System.out.println("Digite um valor para inserir na PilhaUm: ");
                            pilhaA.push(read.nextInt());//Pode ser numero, letra, boolean etc.
                        } catch (Pilha.FullPilhaException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!pilhaA.isFull());
                    System.out.println(pilhaA);
                    break;
                case 2:
                    do {
                        try {
                            System.out.println("Digite um valor para inserir na PilhaDois: ");
                            pilhaB.push(read.nextInt());//Pode ser numero, letra, boolean etc.
                        } catch (Pilha.FullPilhaException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!pilhaB.isFull());
                    System.out.println(pilhaB);
                    break;
                case 3:
                    if(iguais(pilhaA,pilhaB)){
                        System.out.println("Os valores da pilha são iguais");
                    } else {
                        System.out.println("Os valores da pilha não são iguais");
                    }
                    break;
                case 4:
                    pilhaA = Pilha.createPilhaFactory(TAMANHO_PILHA);
                    pilhaB = Pilha.createPilhaFactory(TAMANHO_PILHA);
                    break;
            }
        } while (menu != 0);
    }
}