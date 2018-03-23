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

    //Não entendi a funcionalidade deste método, inicializei as filas com tamanhos estáticos.
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
        Tipo maiorqzeropar = Tipo.MaiorQZeroPar;
        Tipo maiorqzeroimpar = Tipo.MaiorQZeroImpar;
        Tipo menorigualzeropar = Tipo.MenorIgualZeroPar;
        Tipo menorigualzeroimpar = Tipo.MenorIgualZeroImpar;

        //objeto instacia da classe main para chamar os métodos implementados da classe abstrata.

        Main main = new Main() {
            @Override
            public void adicionar(int valor) {
                if ((valor > 0) && (valor % 2 == 0)) {
                    try {
                        f1.queue(valor);
                    } catch (Fila.FilaCheiaException e) {
                        System.out.println(e.getMessage());
                    }

                }

                if ((valor > 0) && (valor % 2 != 0)) {
                    try {
                        f2.queue(valor);
                    } catch (Fila.FilaCheiaException e) {
                        System.out.println(e.getMessage());
                    }

                }

                if ((valor <= 0) && (valor % 2 == 0)) {
                    try {
                        f3.queue(valor);
                    } catch (Fila.FilaCheiaException e) {
                        System.out.println(e.getMessage());
                    }

                }

                if ((valor <= 0) && (valor % 2 != 0)) {
                    try {
                        f4.queue(valor);
                    } catch (Fila.FilaCheiaException e) {
                        System.out.println(e.getMessage());
                    }

                }
            }

            @Override
            public int obterProximo(Tipo tipo) {
                int retorno = 0;

                switch (tipo) {
                    case MaiorQZeroPar:

                        try {
                            retorno = f1.deQueue();
                        } catch (Fila.FilaVaziaException e) {
                            System.out.println(e.getMessage());
                        }

                        break;
                    case MaiorQZeroImpar:

                        try {
                            retorno = f2.deQueue();
                        } catch (Fila.FilaVaziaException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case MenorIgualZeroPar:

                        try {
                            retorno = f3.deQueue();
                        } catch (Fila.FilaVaziaException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case MenorIgualZeroImpar:

                        try {
                            retorno = f4.deQueue();
                        } catch (Fila.FilaVaziaException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                }
                return retorno;
            }

            @Override
            public void excluirTodos(Tipo tipo) {
                switch (tipo) {
                    case MaiorQZeroPar:
                        f1 = Fila.createFilaFactory(TAMANHO_FILA);
                        System.out.println("Os valores maior que zero par foram removidos !");
                        break;
                    case MaiorQZeroImpar:
                        f2 = Fila.createFilaFactory(TAMANHO_FILA);
                        System.out.println("Os valores maior que zero impar foram removidos !");
                        break;
                    case MenorIgualZeroPar:
                        f3 = Fila.createFilaFactory(TAMANHO_FILA);
                        System.out.println("Os valores menor ou igual a  zero par foram removidos !");
                        break;
                    case MenorIgualZeroImpar:
                        f4 = Fila.createFilaFactory(TAMANHO_FILA);
                        System.out.println("Os valores menor ou igual a zero impar foram removidos !");
                        break;
                }


            }
        };

        Scanner read = new Scanner(System.in);
        int menu = -1;

        do {
            System.out.println("==================== MENU ====================");
            System.out.println("1- Preencher estrutura de dados.");
            System.out.println("2- retornar um valor maior que zero par.");
            System.out.println("3- retornar um valor maior que zero impar.");
            System.out.println("4- retornar um valor menor ou igual a  zero par.");
            System.out.println("5- retornar um valor menor ou igual a zero impar.");
            System.out.println("6- excluir todo valor maior que zero par.");
            System.out.println("7- excluir todo valor maior que zero impar.");
            System.out.println("8- excluir todo valor menor ou igual a  zero par.");
            System.out.println("9- excluir todo valor menor ou igual a zero impar.");
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
                    System.out.println(main.obterProximo(maiorqzeropar));
                    break;
                case 3:
                    System.out.println(main.obterProximo(maiorqzeroimpar));
                    break;
                case 4:
                    System.out.println(main.obterProximo(menorigualzeropar));
                    break;
                case 5:
                    System.out.println(main.obterProximo(menorigualzeroimpar));
                    break;
                case 6:

                    break;
            }
        } while (menu != 0);
    }
}