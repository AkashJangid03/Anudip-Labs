/*
⦁	Create a BankAccount class that
⦁	BankAccount class should have three fields accountHolderName (String), bankName (String), accountBalance(double)
⦁	Create a constructor that takes account holder's name, bank name and initial balance.
⦁	Add three methods to the interface - getBalance(), deposit() and withdraw()
⦁	Implement all three methods 
⦁	In the main method create three bank accounts with different account holders names and ICICI, HDFC and SBO as bank names
⦁	Deposit and withdraw money for each account. Display the account balance
 */

package Lab10;

public class Bank {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Akash", "ICICI", 5000);
        BankAccount acc2 = new BankAccount("ABC", "HDFC", 8000);
        BankAccount acc3 = new BankAccount("XYZ", "SBO", 10000);

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.display();

        acc2.deposit(3000);
        acc2.withdraw(1000);
        acc2.display();

        acc3.deposit(5000);
        acc3.withdraw(7000);
        acc3.display();
    }
}
