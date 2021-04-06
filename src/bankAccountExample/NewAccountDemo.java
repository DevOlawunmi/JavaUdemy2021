package bankAccountExample;

public class NewAccountDemo {
    public static void main(String[] args) {
        NewAccount account1 = new NewAccount();
        account1.sortCode =600044;
        account1.accountNumber = 89008777;
        account1.customerID = 001;
        account1.firstName = "Ola";
        account1.lastName = "Ajibola";
        account1.createAccount();
    }
}
