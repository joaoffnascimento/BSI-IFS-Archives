import java.util.Scanner;

public class Main {

    static int count = 0;

    public static int fibonacci(int n){
        count += 1;
        if (n < 2){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Main fibonacci = new Main();
        Scanner read = new Scanner(System.in);
        int casosTeste = read.nextInt();
        for (int i = 0; i < casosTeste; i++) {
            int number = read.nextInt();
            count = 0;
            int res = fibonacci(number);
            System.out.println("fib("+number+")"+" = "+(count-1)+" calls = " +res);
        }

    }
}