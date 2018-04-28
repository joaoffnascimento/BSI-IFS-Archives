package Aula02;

import java.util.*;

public class Questao09 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String reservaPassagens[][] = new String[2][7];

        for (int linha = 0; linha < reservaPassagens.length; linha++) {

            System.out.println("Avião " + (linha + 1) + "\n");
            System.out.print("Digite o número do vôo: ");
            reservaPassagens[linha][0] = read.nextLine();
            System.out.print("\nDigite a origem do Vôo: ");
            reservaPassagens[linha][1] = read.nextLine();
            System.out.print("\nDigite o destino do Vôo: ");
            reservaPassagens[linha][2] = read.nextLine();
            System.out.print("\nDigite o número de lugares disponíveis: \n");
            reservaPassagens[linha][3] = read.nextLine();

        }
        System.out.println("");

        byte flag = 0;
        String escolha;
        do {
            mostrarMenu();
            escolha = read.nextLine();
            byte sair = 1;
            switch (escolha.toLowerCase()) {
                case "a":
                    consultar(reservaPassagens);
                    break;
                case "b":
                    efetuarReserva(reservaPassagens);
                    break;
                case "c":
                    listarReservas(reservaPassagens);
                    break;
                case "d":
                    flag = 1;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (flag != 1);
    }

    public static void consultar(String reservaPassagens[][]) {
        Scanner read = new Scanner(System.in);

        byte escolha;

        do {
            System.out.printf("0 - Por número de Vôo" + "\n1 - Por origem" + "\n2 - Por Destino");
            escolha = read.nextByte();
        } while (escolha < 0 || escolha > 2);

        for (int linha = 0; linha < reservaPassagens.length; linha++) {
            System.out.println("Avião " + (linha + 1) + " " + reservaPassagens[linha][escolha]);
        }
    }

    public static void efetuarReserva(String reservaPassagens[][]) {
        Scanner read = new Scanner(System.in);
        System.out.println("\nInforme o número do vôo no qual você deseja viajar");
        String numero = read.nextLine();
        int count = 0;
        for (int linha = 0; linha < reservaPassagens.length; linha++) {

            if (reservaPassagens[linha][0].equals(numero)) {
                if (Integer.parseInt(reservaPassagens[linha][3]) >= 1) {
                    reservaPassagens[linha][4] = "x";
                    reservaPassagens[linha][3] = Integer.toString(Integer.parseInt(reservaPassagens[linha][3]) - 1);
                    reservaPassagens[linha][5] = "0";
                    reservaPassagens[linha][6] = reservaPassagens[linha][3];
                    reservaPassagens[linha][5] = Integer.toString(Integer.parseInt(reservaPassagens[linha][5]) + 1);
                    System.out.println("\nReserva Confirmada");
                    count++;
                    break;
                }
                if (Integer.parseInt(reservaPassagens[linha][3]) < 1) {

                    System.out.print("Vôo Lotado\n");
                    count++;
                    break;
                }
            }
        }
        if (count == 0)
            System.out.println("Vôo Inexistente\n");
    }


    public static void listarReservas(String reservaPassagens[][]) {
        System.out.println("Reservas Efetuadas: \n");

        for (int linha = 0; linha < reservaPassagens.length; linha++) {
            System.out.println("Vôo Número - " + reservaPassagens[linha][0] + "\n");
            for (int coluna = 0; coluna < reservaPassagens[linha].length; coluna++) {
                if (reservaPassagens[linha][4].equalsIgnoreCase("x")) {
                    if (coluna == 5) {
                        System.out.print("Cadeiras ocupadas = ");
                        System.out.print(reservaPassagens[linha][5]);
                        System.out.println();
                    }
                    if (coluna == 6) {
                        System.out.print("Cadeiras Livres = ");
                        System.out.print(reservaPassagens[linha][6]);
                        System.out.println();
                    }
                }
            }
            System.out.println(" ");

        }
    }

    public static void mostrarMenu() {
        System.out.printf("\nA) consultar" + "\nB) Efetuar Reserva" + "\nC) Listar Reservas por Vôo" + "\nD) Sair\n");
    }
}
