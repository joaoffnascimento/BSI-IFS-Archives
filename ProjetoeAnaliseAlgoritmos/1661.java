import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n;
        long unidTrabalho;
        long qtd;

        while (true) {
            n = read.nextInt();
            if (n == 0) {
                break;
            }

            qtd = 0;
            unidTrabalho = 0;

            for (int i = 0; i < n; i++) {
                qtd += read.nextInt();

                if(qtd >= 0){
                    unidTrabalho += qtd;
                } else {
                    unidTrabalho += (qtd * -1);
                }

            }
            System.out.println(unidTrabalho);
        }
    }
}