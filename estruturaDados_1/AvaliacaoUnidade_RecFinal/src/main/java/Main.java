public class Main {

    public static final int TAMANHO_PILHA = 10;

    public static boolean iguais(IPilha pilhaA, IPilha pilhaB) {
        int countAux = 0;

        Pilha aux1 = new Pilha();
        Pilha aux2 = new Pilha();

        aux1.inicializarPilha(pilhaA.size());
        aux2.inicializarPilha(pilhaB.size());

        if (pilhaA.size() != pilhaB.size()) {
            return false;
        }

        do {
            Object dadoPilhaA = pilhaA.pop();
            Object dadoPilhaB = pilhaB.pop();

            if (dadoPilhaA.equals(dadoPilhaB)) {
                countAux++;
            }
            aux1.push(dadoPilhaA);
            aux2.push(dadoPilhaB);
        } while (!pilhaA.isEmpty());

        int tamanhoPilhaAux1 = aux1.size();
        for (int i = 0; i < tamanhoPilhaAux1; i++) {
            pilhaA.push(aux1.pop());
        }
        int tamanhoPilhaAux2 = aux2.size();
        for (int i = 0; i < tamanhoPilhaAux2; i++) {
            pilhaB.push(aux2.pop());
        }

        if (countAux == TAMANHO_PILHA) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Pilha pilhaUm = new Pilha();
        Pilha pilhaDois = new Pilha();

        System.out.println(" =============== TESTE 1 CASO =============");
        //Pilhas diferentes
        pilhaUm.inicializarPilha(10);
        pilhaDois.inicializarPilha(5);


        int a = 0;
        do{
            pilhaUm.push(a);
            a++;
        }while (!pilhaUm.isFull());

        int b = 0;
        do{
            pilhaDois.push(b);
            b++;
        }while (!pilhaDois.isFull());


        System.out.println("Pilhas antes da comparacao = ");
        System.out.println(pilhaUm);
        System.out.println(pilhaDois);

        System.out.println(iguais(pilhaUm, pilhaDois));

        System.out.println("Pilhas depois da comparacao = ");
        System.out.println(pilhaUm);
        System.out.println(pilhaDois);

        System.out.println(" =============== TESTE 2 CASO =============");
        //Pilhas iguais
        pilhaUm.inicializarPilha(10);
        pilhaDois.inicializarPilha(10);


        a = 0;
        do{
            pilhaUm.push(a);
            a++;
        }while (!pilhaUm.isFull());

        b = 0;
        do{
            pilhaDois.push(b);
            b++;
        }while (!pilhaDois.isFull());


        System.out.println("Pilhas antes da comparacao = ");
        System.out.println(pilhaUm);
        System.out.println(pilhaDois);

        System.out.println(iguais(pilhaUm, pilhaDois));

        System.out.println("Pilhas depois da comparacao = ");
        System.out.println(pilhaUm);
        System.out.println(pilhaDois);


    }
}
