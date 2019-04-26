package Iniciante;
import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int x = 0;

        a = read.nextInt();
        b = read.nextInt();
        x = a+b;
        System.out.println("X = " + x);
    }
}
