package Classes_ConstructorsAndInheritance.Class_Encapsulation_Constructors_Challenge;

public class VipCustomer {

    private String name;
    private float creditLimit;
    private String email;

    public VipCustomer() {
        this("default Name", 0.00f, "defaultemail@default.com.br");
    }

    public VipCustomer(String name, String email) {
        this(name, 10000.00f, email);
    }

    public VipCustomer(String name, float creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public float getCreaditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
