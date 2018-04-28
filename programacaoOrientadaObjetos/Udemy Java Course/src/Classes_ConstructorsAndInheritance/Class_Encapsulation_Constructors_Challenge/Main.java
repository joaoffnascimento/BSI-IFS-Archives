package Classes_ConstructorsAndInheritance.Class_Encapsulation_Constructors_Challenge;

public class Main {

    public static void main(String[] args) {

        Account user_01 = new Account();

        user_01.setAccountNumber("123456789");
        user_01.setBalance(100.0f);
        user_01.setCustomerName("João Felipe");
        user_01.setEmail("thecurrentuser@live.com");
        user_01.setPhoneNumber("(79) 3631-2537");

        System.out.println("Hello " + user_01.getCustomerName());
        System.out.println("Your balance is R$ " + user_01.getBalance());

        user_01.depositFounds(100);
        user_01.withdrawalFounds(100);
        user_01.withdrawalFounds(100);
        System.out.println();

        VipCustomer userVip_01 = new VipCustomer();
        System.out.println("Hello vipCustomer: " + userVip_01.getName());
        System.out.println("Your current credit limit is R$ " + userVip_01.getCreaditLimit());
        System.out.println("Your email is: " + userVip_01.getEmail());

        System.out.println();
        VipCustomer clienteNovo = new VipCustomer("Mike", "mike.ufs@gmail.com.br");
        System.out.println("Hello : " + clienteNovo.getName());
        System.out.println("Your email is: " + clienteNovo.getEmail());
        System.out.println("Como sua é nova o seu limite de crédito é R$" + clienteNovo.getCreaditLimit());
        System.out.println();

        VipCustomer userVip_02 = new VipCustomer("Jeff", 100.0f, "jefflord@gmail.com.br");
        System.out.println("Hello " + userVip_02.getName());
        System.out.println("Your email is: " + userVip_02.getEmail());
        System.out.println("Your credit limit is R$ "+userVip_02.getCreaditLimit());
        System.out.println();


    }
}
