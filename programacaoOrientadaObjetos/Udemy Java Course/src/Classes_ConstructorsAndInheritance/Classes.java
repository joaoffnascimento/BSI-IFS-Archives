package Classes_ConstructorsAndInheritance;

public class Classes {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car ferrari = new Car();

        ferrari.setModel("la ferrari");
        ferrari.setDoors(2);
        System.out.println("Number of doors of " + ferrari.getModel() + " is " + ferrari.getDoors());

    }
}
