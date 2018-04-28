package Classes_ConstructorsAndInheritance.Inheritance;

public class Dog extends Animal {

    private int eyes;
    private int  legs;
    private int tail;
    private int teeth;
    private String coat;

    //Iniciar as características básicas de um animal.
    public Dog(String name, int brain, int body, int size, int weigth) {
        //Chamar o construtor da classe que se está extendendo. Utilizar o super;

        super(name, brain, body, size, weigth);
    }

}
