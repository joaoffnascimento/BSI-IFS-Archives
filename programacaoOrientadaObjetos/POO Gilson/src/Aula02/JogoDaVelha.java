package Aula02;

import java.util.Scanner;


public class JogoDaVelha {
    public static void main(String[] args) {

        String jogoVelha[][] = new String[3][3];
        Scanner read = new Scanner(System.in);
        int linha, coluna;
        boolean teste1 = false;
        boolean teste2 = false;
        zerarJogo(jogoVelha);

        System.out.println("Player 1: Digite o seu nome");
        String player1 = read.next();
        System.out.println("Deseja X ou O");
        String opcaoPlayer1 = read.next();
        System.out.println("Player 2: Digite o seu nome");
        String player2 = read.next();
        String opcaoPlayer2;

        if (opcaoPlayer1.equalsIgnoreCase("x")) {
            opcaoPlayer2 = "O";
        } else {
            opcaoPlayer2 = "X";
        }

        System.out.println("Player " + player2 + " você ficou com: " + opcaoPlayer2);
        System.out.println();

        //Tendo como base o máximo de jogadas como = 9;
        for (int i = 0; i < 9; i++) {
            //Validações de entrada;
            do {
                System.out.println("Player " + player1 + " Deseja jogar em qual posição?  digite valores para linha e coluna\n");
                do {
                    System.out.print("linha:  ");
                    linha = read.nextInt();
                    System.out.print("Coluna: ");
                    coluna = read.nextInt();
                    teste1 = true;
                } while (((linha < 0) || (linha > 3)) || ((coluna < 0) || (coluna > 3)));

                if (verificarPosicao(jogoVelha, linha, coluna)) {
                    jogoVelha[linha][coluna] = opcaoPlayer1;
                    teste2 = false;
                } else {
                    System.out.println("Escolha inválida, tente novamente\n");
                    teste2 = true;
                }
                //Para a jogada ser válida, a entrada linha x coluna tem que seguir a regra, para não passar o valor do array;
                //E
                //Para a jogada ser válida, a posição escolhida não pode ter sido usada antes;
            } while (teste1 && teste2);

            System.out.println();
            mostrarJogo(jogoVelha);
            System.out.println();
            //Chamando método para verificar se OU venceu por linha x coluna OU diagonais
            if (verificarLinhaseColunas(jogoVelha, opcaoPlayer1) || verificarDiagonais(jogoVelha, opcaoPlayer1)) {
                System.out.println("Player : " + player1 + " Venceu !!!");
                //Caso um dos métodos retorne true o break irá encerrar o laço for;
                break;
            }

            do {
                System.out.println("Player " + player2 + " Deseja jogar em qual posição?  digite valores para linha e coluna\n ");
                do {
                    System.out.print("linha: ");
                    linha = read.nextInt();
                    System.out.print("Coluna: ");
                    coluna = read.nextInt();
                    teste1 = true;
                } while (((linha < 0) || (linha > 3)) || ((coluna < 0) || (coluna > 3)));

                if (verificarPosicao(jogoVelha, linha, coluna) || verificarDiagonais(jogoVelha, opcaoPlayer2)) {
                    jogoVelha[linha][coluna] = opcaoPlayer2;
                    teste2 = false;
                } else {
                    System.out.println("Escolha inválida, tente novamente\n");
                    teste2 = true;
                }

            } while (teste1 && teste2);


            System.out.println();
            mostrarJogo(jogoVelha);
            System.out.println();

            if (verificarLinhaseColunas(jogoVelha, opcaoPlayer2)) {
                System.out.println("Player : " + player2 + " Venceu !!!");
                break;
            }
        }
    }

    public static void zerarJogo(String jogoVelha[][]) {
        //Método para zerar o jogo.
        for (int linha = 0; linha < jogoVelha.length; linha++) {
            for (int coluna = 0; coluna < jogoVelha[linha].length; coluna++) {
                jogoVelha[linha][coluna] = "0";
            }
        }
    }

    public static void mostrarJogo(String jogoVelha[][]) {
        //Metodo para mostrar o jogo.
        for (int linha = 0; linha < jogoVelha.length; linha++) {
            for (int coluna = 0; coluna < jogoVelha[linha].length; coluna++) {
                System.out.print(jogoVelha[linha][coluna] + " | ");
            }
            System.out.println("");
        }
    }

    public static boolean verificarPosicao(String jogoVelha[][], int a, int b) {
        //Método para verificar se a posição está disponível.
        boolean result = false;
        for (int linha = 0; linha < jogoVelha.length; linha++) {
            for (int coluna = 0; coluna < jogoVelha[linha].length; coluna++) {

                if (jogoVelha[a][b].equalsIgnoreCase("0")) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    public static boolean verificarLinhaseColunas(String jogoVelha[][], String opcaoPlayer) {
        boolean venceu = false;
        int count = 0;
        //Colunas

        for (int i = 0; i < 3; i++) {
            if (jogoVelha[i][0].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
        }
        if (count == 3) {
            venceu = true;
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
            if (jogoVelha[i][1].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
        }
        if (count == 3) {
            venceu = true;
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
            if (jogoVelha[i][2].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
        }
        if (count == 3) {
            venceu = true;
        }
        count = 0;
        //Linhas
        for (int i = 0; i < 3; i++) {
            if (jogoVelha[0][i].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
        }
        if (count == 3) {
            venceu = true;
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
            if (jogoVelha[1][i].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
        }
        if (count == 3) {
            venceu = true;
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
            if (jogoVelha[2][i].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
        }
        if (count == 3) {
            venceu = true;
        }
        return venceu;
    }

    public static boolean verificarDiagonais(String jogoVelha[][], String opcaoPlayer) {
        boolean venceu = false;
        int count = 0;
        int aux1 = 2;

        //Diagonal 1
        for (int i = 0; i < 3; i++) {
            if (jogoVelha[aux1][i].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
            aux1--;
        }
        if (count == 3) {
            venceu = true;
        }
        count = 0;

        //Diagonal 2

        for (int i = 0; i < 3; i++) {
            if (jogoVelha[i][i].equalsIgnoreCase(opcaoPlayer)) {
                count++;
            }
        }
        if (count == 3) {
            venceu = true;
        }

        return venceu;
    }
}