public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.inicializarFila(5);
        System.out.println(fila);
        Carro fiat = new Carro("uno",2016);
        Carro volks = new Carro("golf", 2014);
        Carro chev = new Carro("prisma", 2004);
        fila.queue(fiat);
        System.out.println(fila);
        System.out.println();
        fila.queue(volks);
        fila.queue(chev);
        System.out.println(fila);
        System.out.println();
        System.out.println(fila.deQueue());
        System.out.println();
        System.out.println(fila);
        System.out.println();
        System.out.println(fila.deQueue());
        System.out.println();
        System.out.println(fila);
        System.out.println();
        System.out.println(fila.deQueue());
        System.out.println();
        System.out.println(fila);
        System.out.println();

        Carro fiat2 = new Carro("uno2",2016);
        fila.queue(fiat2);
        Carro voks2 = new Carro("golf2", 2014);
        fila.queue(voks2);
        Carro chev2 = new Carro("prisma2", 2004);
        fila.queue(chev2);
        System.out.println(fila);
        System.out.println();


    }
}
