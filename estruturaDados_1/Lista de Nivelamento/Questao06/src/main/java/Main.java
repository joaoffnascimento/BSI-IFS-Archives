import java.util.Scanner;
import java.util.Random;

public class Main {
    //Colocar o preenchimento do vetor randomico e exibir o resultado do fatorial de cada posição

    static Random random = new Random();
    public static int[] vetorInteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // new int[10];

    public static void preencherVetor(int[] vetorInteiros) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            vetorInteiros[i] = random.nextInt(50);
        }
    }

    public static void exibirVetor(int[] vetorInteiros) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + " ");

        }
        System.out.println("");
    }

    public static int fatorial(int input) {
        if (input == 1) {
            return 1;
        }
        if (input == 0) {
            return 0;
        }

        return input * fatorial(input - 1);
    }

    public static void fatorialVetor(int[] vetorInteiros) {
        double fatorial = 1;
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(fatorial(vetorInteiros[i]));
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static int fatorialVetor(int[] vetorInteiros, double mediaVetor) {
        int maiorQueAMedia = 0;
        double fatorial = 1;

        for (int i = 0; i < vetorInteiros.length; i++) {
            if (fatorial(vetorInteiros[i]) > calcularMediaVetor(vetorInteiros)) {
                maiorQueAMedia++;
            }
        }
        return maiorQueAMedia;
    }

    public static float calcularMediaVetor(int[] vetorInteiros) {
        int acc = 0;
        for (int i = 0; i < vetorInteiros.length; i++) {
            acc += vetorInteiros[i];
        }
        return acc / vetorInteiros.length;
    }

    public static int opcaoC(int[] vetorInteiros) {
        int qtd = 0;
        int fatorial = 0;
        for (int i = 0; i < vetorInteiros.length; i++) {
            if (vetorInteiros[i] % 2 == 0) {

            } else {
                fatorial = fatorial(vetorInteiros[i]);
                if (fatorial % 2 == 0) {
                    if (fatorial > calcularMediaVetor(vetorInteiros)) {
                        qtd++;
                    }
                }

            }

        }
        return qtd;
    }

    public static void main(String[] args) {

        //preencherVetor(vetorInteiros);

        Scanner read = new Scanner(System.in);


        byte menu = 0;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1 = Calcular o fatorial de cada um dos números inteiros.");
            System.out.println("2 = A quantidade de vezes que o fatorial é menor que a média do vetor.");
            System.out.println("3 = A quantidade de vezes que um elemento é ímpar e seu fatorial é par com valor acima da média dos elementos do vetor.");
            menu = read.nextByte();

            switch (menu) {
                case 1:
                    fatorialVetor(vetorInteiros);
                    break;
                case 2:
                    fatorialVetor(vetorInteiros, calcularMediaVetor(vetorInteiros));
                    break;
                case 3:
                    opcaoC(vetorInteiros);
                    break;

            }

        } while (menu != 9);
    }
}
