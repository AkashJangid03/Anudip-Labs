package Lab10;

public class BankAccount implements BankOperation {
    String accountHolderName;
    String bankName;
    double accountBalance;

    public BankAccount(String name, String bank, double initialBalance) {
        accountHolderName = name;
        bankName = bank;
        accountBalance = initialBalance;
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance = accountBalance + amount;
            System.out.println("Deposited " + amount + " into " + accountHolderName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance = accountBalance - amount;
            System.out.println("Withdrawn " + amount + " from " + accountHolderName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid amount for " + accountHolderName + ".");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Current Balance: " + accountBalance);
        System.out.println();
    }
}
