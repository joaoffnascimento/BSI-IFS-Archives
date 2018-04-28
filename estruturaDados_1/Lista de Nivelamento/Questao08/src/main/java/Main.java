import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void randomVetor(int[] vetorElementos) {
        Random random = new Random();
        for (int i = 0; i < vetorElementos.length; i++) {
            vetorElementos[i] = random.nextInt(20);
        }
    }

    public static void ordemCrescente(int[] vetorElementos) {

        for (int i = 0; i < vetorElementos.length; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < vetorElementos.length; j++) {
                if (vetorElementos[j] < vetorElementos[menorIndice]) {
                    menorIndice = j;
                }
                if (vetorElementos[i] != vetorElementos[menorIndice]) {
                    int aux = vetorElementos[i];
                    vetorElementos[i] = vetorElementos[menorIndice];
                    vetorElementos[menorIndice] = aux;
                }
            }
        }
    }

    public static void ordemDecrescente(int[] vetorElementos) {
        //Selection Sort
        //Pegar o índice com o menor valor, e colocar na primeira posição, e trocar com a atual;
        //E depois continuar pulando as posições já organizadas*

        for (int i = 0; i < vetorElementos.length; i++) {
            int indiceMaiorValor = i;
            for (int j = i + 1; j < vetorElementos.length; j++) {
                if (vetorElementos[j] > vetorElementos[indiceMaiorValor]) {
                    indiceMaiorValor = j;
                }
            }
            int aux = vetorElementos[i];
            vetorElementos[i] = vetorElementos[indiceMaiorValor];
            vetorElementos[indiceMaiorValor] = aux;
        }

    }

    public static void ordenarParidade(int[] vetorElementos) {
        for (int i = 0; i < vetorElementos.length; i++) {
            int indiceValorImpar = i;
            for (int j = i + 1; j < vetorElementos.length; j++) {
                if (vetorElementos[j] % 2 == 0) {
                } else {
                    indiceValorImpar = j;
                }
            }
            int aux = vetorElementos[indiceValorImpar];
            vetorElementos[indiceValorImpar] = vetorElementos[i];
            vetorElementos[i] = aux;
        }
    }

    public static void exibirVetor(int[] vetorElementos) {
        for (int i = 0; i < vetorElementos.length; i++) {
            System.out.print(vetorElementos[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int esc = 10;

        System.out.println("Digite o tamanho do vetor: ");
        int[] vetorElementos = new int[read.nextInt()];
        randomVetor(vetorElementos);

        do {
            System.out.println("1 - Ordem Crescente: ");
            System.out.println("2 - Ordem decrescente: ");
            System.out.println("3 - pares a direita e impares a esquerda: ");
            System.out.println("4 - Exibir vetor: ");
            System.out.println("9 - Sair: ");
            esc = read.nextInt();

            switch (esc) {
                case 1:
                    ordemCrescente(vetorElementos);
                    break;
                case 2:
                    ordemDecrescente(vetorElementos);
                    break;
                case 3:
                    ordenarParidade(vetorElementos);
                    break;
                case 4:
                    exibirVetor(vetorElementos);
                    break;
                default:
                    System.out.println("Opcao Inválida !");
                    break;
            }

        } while (esc != 9);
    }
}
