
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        // create object of class Account
        Account myAcc = new Account("ownber", 100.0);

        myAcc.deposit(20);
        System.out.println(myAcc);
    }
}
