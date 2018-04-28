package Classes_ConstructorsAndInheritance;

import java.util.*;

public class BankAccount {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        BankAccount usuario = new BankAccount();

        /* exemplo inicialização de objeto com construtor
        BankAccount usuario2 = new BankAccount(12345, 0.00f, "Bob brown",
                "myemail@bob.com", "7999454");
        System.out.println(usuario2);
        */

        byte option;

        byte flag = 0;
        byte flag1 = 0;

        do {

            System.out.println("Enter your name: ");
            usuario.setCustomerName(read.nextLine());
            read.nextLine();
            System.out.println("Enter your account number: ");
            usuario.setAccountNumber(read.nextInt());
            System.out.println("Enter your phone number: ");
            usuario.setPhoneNumber(read.nextLine());
            read.nextLine();
            System.out.println("Enter your email: ");
            usuario.setEmail(read.nextLine());
            read.nextLine();
            System.out.println("What is your current balance? ");
            usuario.setBalance(read.nextFloat());


            do {
                System.out.println("You want to perform witch operation: 1 deposit / 2 withdrawn");
                option = read.nextByte();
                switch (option) {
                    case 1:
                        System.out.println("Enter the value for deposit: ");
                        usuario.deposit(read.nextFloat());
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter the value for withdrawn: ");
                        usuario.withdrawalFounds(read.nextFloat());
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Invalid operation: ");
                }

                System.out.println("Perform some more action? 0 yes | 1 no");
                flag1 = read.nextByte();

            } while (flag1 != 1);

            System.out.println("Switch User? 0 yes | 1 no");
            flag = read.nextByte();
        } while (flag != 1);
    }
    //Construtores são utilizados para inicializar um objeto criado, com parâmetros; pode ser sobrecarregado da mesma forma
    // que os métodos;
    // para utilizar o construtor, basta informar os parâmetros na criação do objeto.
    // um construtor vazio pode ser utilizado para passar valores padrão para o objeto.
    //this. tem que ser a primeira linha do construtor;

    public BankAccount() {
        //essa linha chama outro construtor, a escolha é feita pelos parâmetros
        this(12345, 0.00f, "default customerName", "default email",
                "default phoneNumber");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, float balance, String customerName, String email, String phoneNumber) {
        // é possível utilizar o this para atribuir os valores dos parametros para as variaveis protegidas;
        // também é possível utilizar o método setter para atribuir um valor, e ainda utilizar estruturas de validação
        // embutidas dentro desses métodos;


        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        /*
        setAccountNumber(accountNumber);
        setBalance(balance);
        setCustomerName(customerName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        */
        System.out.println("Account constructor with parameters called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(12345, 0.00f, customerName, email, phoneNumber);
    }

    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(float depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of R$ " + depositAmount + " made. New balance is R$ " + this.balance);
    }

    public void withdrawalFounds(float withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only" + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of R$ " + withdrawalAmount + " processed.  Remaining balance = R$ " + this.balance);
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

}
