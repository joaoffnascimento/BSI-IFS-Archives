public class Main {

    public static final int TAMANHO_PILHA = 10;

    public static boolean iguais(IPilha pilhaA, IPilha pilhaB) {
        int countAux = 0;

        Pilha aux1 = new Pilha();
        Pilha aux2 = new Pilha();

        aux1.inicializarPilha(10);
        aux2.inicializarPilha(10);

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

        pilhaUm.inicializarPilha(10);
        pilhaDois.inicializarPilha(10);


        for (int i = 0; i < 10; i++) {
            pilhaUm.push(i);
            pilhaDois.push(i);
        }

        System.out.println("Pilhas antes da comparacao = ");
        System.out.println(pilhaUm);
        System.out.println(pilhaDois);

        System.out.println(iguais(pilhaUm, pilhaDois));

        System.out.println("Pilhas depois da comparacao = ");
        System.out.println(pilhaUm);
        System.out.println(pilhaDois);

    }
}
