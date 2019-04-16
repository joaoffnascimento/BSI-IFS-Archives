import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner (System.in);
        String l;
        int N, D, t;
        String[] aux;
        char[] numbers;
        char current;
        while (!(l = read.nextLine()).equals("0 0")) {
            aux = l.split("\\s");
            N = Integer.parseInt(aux[0]);
            D = Integer.parseInt(aux[1]);
            Stack<Character> stack = new Stack<>();
            numbers = read.nextLine().toCharArray();
            t = N - D;
            for (int i = 0; i < N; i++) {
                current = numbers[i];
                while (stack.size() > 0  && stack.size() + N - i > t  && stack.lastElement() < current) {
                    stack.pop();
                }
                if (stack.size() < t) {
                    stack.push(current);

                }
            }
            for (char number : stack) {
                System.out.println(number);
            }
            System.out.println();
        }
    }
}
