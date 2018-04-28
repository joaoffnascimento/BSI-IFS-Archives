import java.util.Scanner;

public class Fatorial {
    //Questão utilizando métodos estáticos de classe
    public static int acc = 1;

    public static int fatorialRecursivo(int input) {
        if (input == 1) {
            return 1;
        } else {
            System.out.println("Método chamado pela " + acc++ + "º vez");
            return input * fatorialRecursivo(input - 1);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número para calcular o seu fatorial e o número X");
        System.out.println(fatorialRecursivo(read.nextInt()));

    }
}
