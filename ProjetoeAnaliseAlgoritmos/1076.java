import java.util.Scanner;

public class Main {
    static int matriz[][];
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int nCasosTeste = scan.nextInt();

        while (nCasosTeste != 0) {
            int inicio = scan.nextInt();
            int v = scan.nextInt();
            int a = scan.nextInt();
            matriz = new int[v][v];
            for (int i = 0; i < a; ++i) {
                int posX = scan.nextInt();
                int posY = scan.nextInt();
                matriz[posX][posY] = 1;
                matriz[posY][posX] = 1;
            }
            System.out.println(contarTracado(inicio));
            nCasosTeste--;
        }

    }

    public static int contarTracado(int pos){
        int count = 0;
        for(int i =0; i < matriz.length; ++i){
            if(i != pos){
                if(matriz[pos][i] == 1){
                    matriz[pos][i] = matriz[i][pos] = 0;
                    count += 2;
                    count += contarTracado(i);
                }
            }
        }
        return count;
    }


}