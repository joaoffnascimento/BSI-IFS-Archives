package questao03;

import java.util.Random;
import java.util.Scanner;

enum Tipo{

    MaiorQZeroPar,
    MaiorQZeroImpar,
    MenorIgualZeroPar,
    MenorIgualZeroImpar
}

abstract class QuestaoProva {

    public abstract void adicionar (int valor);
    public abstract int obterProximo (Tipo tipo);
    public abstract void excluirTodos(Tipo tipo);
    int capacidadeMaxPorTipo = 0;

    public QuestaoProva (int capacidadeMaxPorTipo){
        this.capacidadeMaxPorTipo = capacidadeMaxPorTipo;

    }
    public QuestaoProva(){
    //Construtor padrao.
    }
}



public abstract class Main extends QuestaoProva{

    public static final int TAMANHO_FILA = 50;

    public static int gerarNumero(){
        Random random = new Random();
        

    }
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Fila f1 = Fila.createFilaFactory(TAMANHO_FILA);
        Fila f2 = Fila.createFilaFactory(TAMANHO_FILA);
        Fila f3 = Fila.createFilaFactory(TAMANHO_FILA);
        Fila f4 = Fila.createFilaFactory(TAMANHO_FILA);

        int menu = -1;

        do {
            System.out.println("==================== MENU ====================");
            System.out.println("1- Preencher estrutura de dados.");
            System.out.println("0- Sair.");
            menu = read.nextInt();

            switch (menu) {
                case 1:
                    for (int i = 0; i < 50; i++) {

                    }
                    break;
                case 2:
                    System.out.println(f1.tamanho());
                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        } while (menu != 0);
    }
}