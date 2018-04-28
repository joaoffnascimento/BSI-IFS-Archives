package Classes_ConstructorsAndInheritance;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //Utilizando o setter para fazer validações, exemplo:

    public void setDoors(int doors) {
        if (doors > 4 || doors < 2) {
            this.doors = 0;
        } else {
            this.doors = doors;
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setModel (String model){
        String validModel = model.toLowerCase();

        if (model.equals("911") || model.equals("la ferrari")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel (){
        return model;
    }
}
