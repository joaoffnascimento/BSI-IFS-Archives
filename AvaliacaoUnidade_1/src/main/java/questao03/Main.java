package questao03;

import java.util.Random;
import java.util.Scanner;

enum Tipo {

    MaiorQZeroPar,
    MaiorQZeroImpar,
    MenorIgualZeroPar,
    MenorIgualZeroImpar
}

abstract class QuestaoProva {

    public abstract void adicionar(int valor);

    public abstract int obterProximo(Tipo tipo);

    public abstract void excluirTodos(Tipo tipo);

    int capacidadeMaxPorTipo = 0;

    public QuestaoProva(int capacidadeMaxPorTipo) {
        this.capacidadeMaxPorTipo = capacidadeMaxPorTipo;

    }

    public QuestaoProva() {
        //Construtor padrao.
    }
}


public abstract class Main extends QuestaoProva {

    public static final int TAMANHO_FILA = 50;
    public static int countSinal = 0;

    public static int gerarNumeroAleatorio() {

        Random random = new Random();
        countSinal++;
        if (countSinal % 2 == 0) {
            return random.nextInt(999);
        } else {
            return random.nextInt(999) * -1;
        }
    }

    public static Fila f1 = Fila.createFilaFactory(TAMANHO_FILA);
    public static Fila f2 = Fila.createFilaFactory(TAMANHO_FILA);
    public static Fila f3 = Fila.createFilaFactory(TAMANHO_FILA);
    public static Fila f4 = Fila.createFilaFactory(TAMANHO_FILA);

    public static void main(String[] args) {
        //objeto instacia da classe main para chamar os métodos implementados da classe abstrata.

        Main main = new Main() {
            @Override
            public void adicionar(int valor) {
                if ((valor > 0) && (valor % 2 == 0)) {
                    f1.queue(valor);
                }

                if ((valor > 0) && (valor % 2 != 0)) {
                    f2.queue(valor);
                }

                if ((valor <= 0) && (valor % 2 == 0)) {
                    f3.queue(valor);
                }

                if ((valor <= 0) && (valor % 2 != 0)) {
                    f4.queue(valor);
                }
            }

            @Override
            public int obterProximo(Tipo tipo) {
                return 1;
            }

            @Override
            public void excluirTodos(Tipo tipo) {

            }
        };

        Scanner read = new Scanner(System.in);
        int menu = -1;

        do {
            System.out.println("==================== MENU ====================");
            System.out.println("1- Preencher estrutura de dados.");
            System.out.println("0- Sair.");
            menu = read.nextInt();

            switch (menu) {
                case 1:

                    for (int i = 0; i < 50; i++) {
                        main.adicionar(gerarNumeroAleatorio());
                    }
                    System.out.println(f1);
                    System.out.println(f2);
                    System.out.println(f3);
                    System.out.println(f4);
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