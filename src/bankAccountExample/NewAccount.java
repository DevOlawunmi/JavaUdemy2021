package bankAccountExample;

public class NewAccount {
    int customerID;
    String firstName;
    String lastName;
    int sortCode;
    int accountNumber;
    int openingBalance;

    public void createAccount(){
        System.out.println("Your account details are "+ "Sort code: "+ sortCode+  " Account number: "+ accountNumber);

    }
}
