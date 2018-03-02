public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.inicializar(5);

        Pessoa pessoa = new Pessoa("jose", 450, 18);
        Pessoa pessoa1 = new Pessoa("asdasd", 450, 18);
        Pessoa pessoa2 = new Pessoa("weqewqeq", 450, 18);
        Pessoa pessoa3 = new Pessoa("jhjkjhkkj", 450, 18);
        Pessoa pessoa4 = new Pessoa("~/´/´~p/´~", 450, 18);
        Pessoa pessoa5 = new Pessoa("312331232133", 450, 18);

        pilha.empilhar(pessoa);
        pilha.empilhar(pessoa1);
        pilha.empilhar(pessoa2);
        pilha.empilhar(pessoa3);
        pilha.empilhar(pessoa4);
        pilha.empilhar(pessoa5);


        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());


        //System.out.println(pilha);
    }
}
