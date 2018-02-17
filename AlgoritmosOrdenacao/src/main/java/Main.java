import java.util.Scanner;
import java.util.Random;

public class Main {
    Scanner read = new Scanner(System.in);

    public static void exibirVetor(int[] vetorElementos) {
        for (int i = 0; i < vetorElementos.length; i++) {
            System.out.print(vetorElementos[i] + " ");
        }
        System.out.println("");
    }

    public static void randomVetor(int[] vetorElementos) {
        Random random = new Random();
        for (int i = 0; i < vetorElementos.length; i++) {
            vetorElementos[i] = random.nextInt(20);
        }
    }


    ///////////////////////// BUBBLE SORT //////////////////////////////

    public static void bubbleSortCrescente(int[] vetorElementos) {
        for (int i = 0; i < vetorElementos.length; i++) {

            for (int j = 0; j < vetorElementos.length - 1; j++) {

                if (vetorElementos[j] > vetorElementos[j + 1]) {

                    int aux2 = vetorElementos[j];
                    vetorElementos[j] = vetorElementos[j + 1];
                    vetorElementos[j + 1] = aux2;
                }
            }
        }
    }

    public static void bubbleSortDecrescente(int[] vetorElementos) {
        for (int i = 0; i < vetorElementos.length; i++) {

            for (int j = 0; j < vetorElementos.length - 1; j++) {

                if (vetorElementos[j] < vetorElementos[j + 1]) {

                    int aux = vetorElementos[j];
                    vetorElementos[j] = vetorElementos[j + 1];
                    vetorElementos[j + 1] = aux;
                }
            }
        }
    }

    //////////////////////// Selection Sort ////////////////////////////

    public static void selectionSortDecrescente(int[] vetorElementos) {
        int indiceMaiorValor;
        for(int i = 0; i < vetorElementos.length; i++){
            indiceMaiorValor = i;
            for (int j = i+1; j < vetorElementos.length; j++) {
                if(vetorElementos[j] >= vetorElementos[i]){
                    indiceMaiorValor = j;
                }
                troca(vetorElementos, i, indiceMaiorValor);
            }
        }
    }

    public static void selectionSortCrescente(int[] vetorElementos) {
        for (int i = 0; i < vetorElementos.length; i++) {
            int indiceMenorValor = i;

            for (int j = i + 1; j < vetorElementos.length; j++) {
                if (vetorElementos[j] <= vetorElementos[indiceMenorValor]) {
                    indiceMenorValor = j;
                }
                troca(vetorElementos, i, indiceMenorValor);
            }

        }
    }

    //////////////////////// Inserction Sort ////////////////////////////


    /////////////////////////// Merge Sort //////////////////////////////

    public static void merge(int[] vetorElementos, int inicio, int fim) {
        //Serão passados como parametros o inicio e o fim do vetor;
        //Para descobrir o meio;
        //De forma recursiva o algoritmo vai chamar o metodo merge para ir dividindo do inicio ao meio
        //E do meio ao fim;
        int meio;

        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(vetorElementos, inicio, meio);
            merge(vetorElementos, meio + 1, fim);
            ordenarMerge(vetorElementos, inicio, meio, fim);
        }
    }

    //Para intercalar os subvetores divididos pelo método merge com recursão, é necessário conhecer o inicio, meio e fim do vetor;
    //Tais valores vão sendo atualizados de acordo com o subvetor que está sendo manipulado;

    public static void ordenarMerge(int[] vetorElementos, int inicio, int meio, int fim) {
        int[] vetorAuxiliar = new int[vetorElementos.length];

        int inicioVetor1, inicioVetor2, posVetorAuxiliar, i;
        inicioVetor1 = inicio;
        inicioVetor2 = meio + 1;
        posVetorAuxiliar = inicio;

        while ((inicioVetor1 <= meio) && (inicioVetor2 <= fim)) {

            if (vetorElementos[inicioVetor1] <= vetorElementos[inicioVetor2]) {
                vetorAuxiliar[posVetorAuxiliar] = vetorElementos[inicioVetor1];
                inicioVetor1++;
            } else {
                vetorAuxiliar[posVetorAuxiliar] = vetorElementos[inicioVetor2];
                inicioVetor2++;
            }
            posVetorAuxiliar++;
        }
        //Se sobrarem valores que não forem intercalados
        for (i = inicioVetor1; i <= meio; i++) {
            vetorAuxiliar[posVetorAuxiliar] = vetorElementos[i];
            posVetorAuxiliar++;
        }


        for (i = inicioVetor2; i <= fim; i++) {
            vetorAuxiliar[posVetorAuxiliar] = vetorElementos[i];
            posVetorAuxiliar++;
        }

        for (i = inicio; i <= fim; i++) {
            vetorElementos[i] = vetorAuxiliar[i];
        }
    }

    //---------------------------------------------------------------------------------------//
    public static void unirDoisVetoresOrdenados(int[] par, int[] impar, int[] resultado) {
        int countVetorPar = 0;
        int countVetorImpar = 0;
        int countVetorResultado = 0;

        while ((countVetorPar < par.length) && (countVetorImpar < impar.length)) {

            if (par[countVetorPar] <= impar[countVetorImpar]) {
                resultado[countVetorResultado] = par[countVetorPar];
                countVetorPar++;
            } else {
                resultado[countVetorResultado] = impar[countVetorImpar];
                countVetorImpar++;
            }

            countVetorResultado++;

        }
        //Condições para: não foram utilizadas todas as posições do vetor 1 e vetor 2;
        //se indice do vetor1 é menor que o índice final do vetor 1;
        if (countVetorPar < par.length) {
            //for com a quantidade de itens que faltam para preencher o vetor resultado;
            //for ter a quantidade de intens como parametros, a variável I já indica o local do vetor onde estão os valores a serem passados;
            for (int i = countVetorPar; i < par.length; i++) {
                resultado[countVetorResultado] = par[i];
                countVetorResultado++;
            }
        }

        if (countVetorImpar < impar.length) {
            for (int i = countVetorImpar; i < impar.length; i++) {
                resultado[countVetorResultado] = impar[i];
                countVetorResultado++;
            }
        }

    }
    //---------------------------------------------------------------------------------------//

    /////////////////////////  Quick Sort //////////////////////////////

    public static void troca(int[] vetorElementos, int countEsq, int countDir) {
        int aux = vetorElementos[countEsq];
        vetorElementos[countEsq] = vetorElementos[countDir];
        vetorElementos[countDir] = aux;
    }

    public static int particao(int[] vetorElementos, int inicio, int fim) {
        int countEsq, countDir, pivo, posPivo;
        countEsq = inicio;
        countDir = fim;
        posPivo = (inicio + fim) / 2;
        pivo = vetorElementos[posPivo];

        while (countEsq < countDir) {
            while (vetorElementos[countEsq] < pivo) {
                countEsq++;
            }
            while (vetorElementos[countDir] > pivo) {
                countDir--;
            }
            if (countEsq < countDir) {
                troca(vetorElementos, countEsq, countDir);
                countEsq++;
                countDir--;
            }
        }
        return countDir;
    }

    public static void quickSort(int[] vetorElementos, int inicio, int fim) {
        int posPivo;
        if (inicio < fim) {

            posPivo = particao(vetorElementos, inicio, fim);
            quickSort(vetorElementos, inicio, posPivo);
            quickSort(vetorElementos, posPivo + 1, fim);
        }
    }

    ////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int esc = 10;

        System.out.println("Digite o tamanho do vetor: ");
        int[] vetorElementos = new int[read.nextInt()];
        randomVetor(vetorElementos);

        do {
            System.out.println("1 - BubbleSort Ordem Crescente: ");
            System.out.println("2 - BubbleSort Ordem Decrescente: ");
            System.out.println("3 - SelectionSort Ordem Crescente:");
            System.out.println("4 - SelectionSort Ordem Decrescente:");
            System.out.println("5 - MergeSort: ");
            System.out.println("6 - QuickSort: ");
            System.out.println("7 - Unir 2 vetores Ordenados: ");
            System.out.println("20 - Exibir vetor: ");
            System.out.println("0 - Sair: ");
            esc = read.nextInt();

            switch (esc) {
                case 1:
                    bubbleSortCrescente(vetorElementos);
                    break;
                case 2:
                    bubbleSortDecrescente(vetorElementos);
                    break;
                case 3:
                    selectionSortCrescente(vetorElementos);
                    break;
                case 4:
                    selectionSortDecrescente(vetorElementos);
                    break;
                case 5:
                    merge(vetorElementos, 0, vetorElementos.length - 1);
                    break;
                case 6:
                    quickSort(vetorElementos, 0, vetorElementos.length - 1);
                    break;
                case 7:

                    int[] par = {0, 2, 4, 6, 8, 10, 12, 14, 16};
                    int[] impar = {1, 3, 5, 7, 9, 11, 13, 15};
                    int[] resultado = new int[par.length + impar.length];
                    unirDoisVetoresOrdenados(par, impar, resultado);
                    exibirVetor(resultado);

                    break;
                case 20:
                    exibirVetor(vetorElementos);
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }

        } while (esc != 0);
    }

    ////////////////////////////////////////////////////////////////////


}

