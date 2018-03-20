import java.util.Scanner;

public class Main {

    public static final int TAMANHO_PILHA = 5;
    public static final int TAMANHO_FILA = 10;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CaixaBebida caixa;
        Fila galpaoBebidas = Fila.createFilaFactory(TAMANHO_FILA);
        Pilha carrinhoTransporte = Pilha.createPilhaFactory(TAMANHO_PILHA);

        int menu = -1;

        do {
            System.out.println("==================== MENU ====================");
            System.out.println("1- Adicionar caixa de bebidas.");
            System.out.println("2- Consumir uma nova caixa de bebidas.");
            System.out.println("3- Descartar um lote inteiro de bebidas.");
            System.out.println("4- Situacao do galpao.");
            System.out.println("5- Relatorio.");
            System.out.println("0- Sair.");
            menu = read.nextInt();

            switch (menu) {
                case 1:

                    if (carrinhoTransporte.size() < TAMANHO_PILHA) {
                        System.out.println("Digite a marca da bebida: ");
                        read.nextLine();
                        String marca = read.nextLine();
                        System.out.println("Digite o tipo da bebida: ");
                        String tipoBebida = read.nextLine();
                        caixa = new CaixaBebida(marca, tipoBebida);
                        carrinhoTransporte.push(caixa);
                        System.out.println("Caixa adicionada no carrinho de transporte !");

                        if (carrinhoTransporte.isFull()) {

                            try {
                                galpaoBebidas.queue(carrinhoTransporte);
                                System.out.println("Seu carrinho está cheio e as caixas foram armazenadas no galpão.");
                            } catch (Fila.FilaCheiaException e) {
                                System.out.println("Seu galpao esta cheio, esta pilha de bebidas nao pode ser armazenada.");
                            }

                            carrinhoTransporte = Pilha.createPilhaFactory(TAMANHO_PILHA);

                            if (galpaoBebidas.getFim() == 7) {
                                System.out.println("O deposito alcançou 80% de sua capacidade.");
                            }
                        }
                    }
                    break;
                case 2:
                    try {
                        if (galpaoBebidas.firstPos().isEmpty()) {
                            galpaoBebidas.deQueue();
                        } else {
                            System.out.println(galpaoBebidas.firstPos().pop());
                        }
                    } catch (Fila.FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    try {
                        if (galpaoBebidas.firstPos() == null) {
                            System.out.println("Voce nao tem caixas no galpao.");
                        } else {
                            galpaoBebidas.deQueue();
                            System.out.println("Lote descartado.");
                        }
                    } catch (Fila.FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println(galpaoBebidas);
                    break;
                case 5:
                    System.out.println(carrinhoTransporte);
                    break;
            }
        } while (menu != 0);
    }
}