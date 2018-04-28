package ifs.edu.questao01;

import java.util.Scanner;

public class Main {

    private int vetorInteiros[] = new int[5];
    private int qtd = 0;

    public boolean entradaVetor(int valorInteiro) {
        if (qtd > vetorInteiros.length) {
            return false;
        }

        vetorInteiros[qtd] = valorInteiro;
        qtd++;
        return true;
    }

    public void mostrarVetor() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(vetorInteiros[i]);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Main metodos = new Main();
        for (int i = 0; i < 5; i++) {
            metodos.entradaVetor(read.nextInt());
        }

        metodos.mostrarVetor();
    }
}
