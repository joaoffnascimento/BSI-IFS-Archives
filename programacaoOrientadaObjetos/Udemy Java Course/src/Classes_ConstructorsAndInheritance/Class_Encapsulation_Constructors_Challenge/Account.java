package Classes_ConstructorsAndInheritance.Class_Encapsulation_Constructors_Challenge;

public class Account {

    private String accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositFounds(float valueDeposit) {
        this.balance += valueDeposit;
        System.out.println("Added R$" + valueDeposit + " to your account, new value R$" + this.balance);
    }

    public void withdrawalFounds(float valueWithdrawal) {
        if (this.balance <= 0) {
            System.out.println("Insufficient founds! ");
        } else  if (valueWithdrawal == 0) {
            System.out.println("Insufficient value to withdrawal!");
        } else {
            this.balance -= valueWithdrawal;
            System.out.println("Removed R$" + valueWithdrawal + " to your account, new value R$" + this.balance);
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
