import java.util.Scanner;

public class Main {

    public static int multiplicacaoComSoma(int a, int b){
        if ((a == 0) || (b == 0)){
            return 0;
        }
        return b + multiplicacaoComSoma(a -1, b);

    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número para A:");
        int a = read.nextInt();
        System.out.println("Digite um número para B:");
        int b = read.nextInt();
        System.out.println(multiplicacaoComSoma(a,b));

    }
}
