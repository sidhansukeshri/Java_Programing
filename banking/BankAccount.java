package banking;

public class BankAccount {
    private String accountHolder;
    private double balance;
    protected String accountType;
    public String accountNumber;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to view balance (Customers can only view)
    public void viewBalance() {
        System.out.println(accountHolder + "'s Balance: $" + balance);
    }

    // Method to allow deposits
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Protected method to allow Employees to update account type
    protected void updateAccountType(String newType) {
        this.accountType = newType;
        System.out.println(accountHolder + "'s account type updated to: " + newType);
    }

    // Private method for internal balance modification (Admins only)
    private void updateBalance(double newBalance) {
        this.balance = newBalance;
        System.out.println("Admin updated " + accountHolder + "'s balance to $" + newBalance);
    }

    // Nested Admin class with full control
    public static class Admin {
        public void setBalance(BankAccount account, double newBalance) {
            account.updateBalance(newBalance); // Admin modifies balance using private method
        }
    }
}
