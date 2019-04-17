import java.util.Scanner;

public class Main {
    //Algoritmo Fibonacci DP TOPDOWN

    private static int[] fibonacci = new int[999];

    private int fibonacciPD (int n){
        if(n == 0){
            return 1;
        }

        if(fibonacci[n] > 0){
            return fibonacci[n];
        }

        fibonacci[n] = fibonacciPD(n - 1) + fibonacciPD(n - 2);

        return fibonacci[n];
    }

    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        Main metodos = new Main();
        boolean flag = true;

        //inicializar o vetor
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        fibonacci[2] = 2;

        System.out.println("Digite o tamanho do vetor para armazenamento: ");
        int n = read.nextInt();
        for (int i = 3; i < n; i++) {
            fibonacci[i] = -1;
        }

        do {
            System.out.println("Deseja calcular o fatorial de qual numero? ");
            int valor = read.nextInt();
            valor = valor - 1;
            System.out.println(metodos.fibonacciPD(valor));
            System.out.println();
            System.out.println("Deseja sair? TRUE/FALSE");
            flag = read.nextBoolean();
            System.out.println();

        }while(flag != true);
        for (int i = 1; i <= n; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}
