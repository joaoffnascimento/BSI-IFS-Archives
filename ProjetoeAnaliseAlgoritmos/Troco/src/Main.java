import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read  = new Scanner(System.in);

        int v = 0;
        int m = 0;

        //Parte referente a validacao das entradas
        do{
            v = read.nextInt();
        }while ((v < 0) || (v > Math.pow(10, 5)));

        do{
            m = read.nextInt();
        }while ((m < 0)||(m > Math.pow(10, 3)));
        //Math.pow(x, y);

        Mi = new int[1000000];
        for (int i = 1; i <= m; i++) {
            do{
                Mi[i] = read.nextInt();
            }while ((v < 0) || (v > Math.pow(10, 5)));
        }

        if(min(v,m)){
            System.out.println("S");
        }else{
            System.out.println("N");
        }

    }

    static int[] Mi;

    static boolean min(int v, int m){
        if(v < 0) return false;
        if(v == 0) return true;
        if(m == 0) return false;
        return min(v-Mi[m], m-1) || min(v, m-1);
    }
}
