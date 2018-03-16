import java.util.Scanner;

//padrao factory
//Enquanto estiver vazia, ou enquanto estiver cheia. (Problemas nos CONTADORES TOPO_PILHA)
//80% de todos os elementos 10x5

public class Main {
    public static final int TAMANHO_PILHA = 5;
    public static final int TAMANHO_FILA = 10;

    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        CaixaBebida caixa;
        Fila galpaoBebidas = Fila.createFilaFactory(TAMANHO_FILA);
        Pilha pilhaBebidas = Pilha.createPilhaFactory(TAMANHO_PILHA);
        Pilha carrinhoTransporte = Pilha.createPilhaFactory(TAMANHO_PILHA);

        int menu = -1;

        do {
            System.out.println("==================== MENU ====================");
            System.out.println("1- Adicionar caixa de bebidas.");
            System.out.println("2- Consumir uma nova caixa de bebidas.");
            System.out.println("3- Descartar um lote inteiro de bebidas.");
            menu = read.nextInt();

            switch (menu) {
                case 1:
                    //Saber se uma pilha de caixas de bebidas esta sendo consumida:
                    //Para ignorar essa pilha e empilhar no carrinhoTransporte e depois jogar no depósito.
                    //Problema já é solucinado na estrutura abaixo, uma caixa não é colocada diretamente na pilha de bebidas
                    //E não é possível consumir as caixas do carrinhoTransporte e
                    //Uma nova pilha só pode ser criada quando a altura máxima for alcançada.
                    //v2 ======================================================================== /\ ignorar ====
                    //Alterada a interface IFilha para não armazenar objetos e sim pilhas.
                    
                    if (carrinhoTransporte.size() < TAMANHO_PILHA) {
                        System.out.println("Digite a marca da bebida: ");
                        read.nextLine();
                        String marca = read.nextLine();
                        System.out.println("Digite o tipo da bebida: ");
                        String tipoBebida = read.nextLine();
                        System.out.println("Digite o volume dos recipientes das bebidas");
                        float volume = read.nextFloat();
                        caixa = new CaixaBebida(marca, tipoBebida, volume);
                        carrinhoTransporte.push(caixa);

                    } else if (carrinhoTransporte.size() >= TAMANHO_PILHA) {
                        // * * *> Tamanho das pilhas temp e carrinhoTransporte.
                        Pilha temp = new Pilha();
                        temp = Pilha.createPilhaFactory(5);
                        //Enquanto estiver vazia, ou enquanto estiver cheia.
                        while(!carrinhoTransporte.isEmpty()) {
                            temp.push(carrinhoTransporte.pop());
                        }
                        while(!temp.isEmpty()) {
                            pilhaBebidas.push(temp.pop());
                        }
                        galpaoBebidas.queue(pilhaBebidas);
                        System.out.println("Seu carrinho está cheio e as caixas foram armazenadas no galpão.");
                        carrinhoTransporte = Pilha.createPilhaFactory(TAMANHO_PILHA);
                        temp = Pilha.createPilhaFactory(TAMANHO_PILHA);
                        pilhaBebidas = Pilha.createPilhaFactory(TAMANHO_PILHA);
                    }

                    break;
                case 2:
                    //Para remover uma caixa da pilha de dentro da fila, utilizando os métodos padrão da interface
                    //IFila se torna inviável para o meu nível de abstração
                    //Vou criar um método para remover a pilha de caixas do inicio da fila
                    //Fazer a remoção da caixa do topo da pilha e
                    //retornar a pilha modificada para o inicio da fila (até a pilha ser totalmente "atendida" e ser removida, para
                    //o "atendimento" fila prosseguir seguindo a ordem normal, e sem burlar os princípios da fila.

                    break;
                case 3:
                    System.out.println(carrinhoTransporte);
                    break;
                case 4:
                    System.out.println(galpaoBebidas);
                    break;
            }
        } while (menu != 0);
    }
}

