// BankAccount.java
class BankAccount {
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

    // Public method for customers to view balance
    public void viewBalance() {
        System.out.println(accountHolder + "'s Balance: $" + balance);
    }

    // Public method for customers to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Protected method for employees to update account type
    protected void updateAccountType(String newType) {
        this.accountType = newType;
        System.out.println(accountHolder + "'s account type updated to: " + newType);
    }

    // Private method for internal balance updates
    private void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Admin subclass with full control
    static class Admin extends BankAccount {
        public Admin(String accountHolder, String accountNumber, double balance, String accountType) {
            super(accountHolder, accountNumber, balance, accountType);
        }

        // Admin can update balance
        public void setBalance(double newBalance) {
            super.balance = newBalance;
            System.out.println(accountHolder + "'s new balance set to: $" + newBalance);
        }
    }
}

// Employee.java
class Employee extends BankAccount {
    public Employee(String accountHolder, String accountNumber, double balance, String accountType) {
        super(accountHolder, accountNumber, balance, accountType);
    }

    public void changeAccountType(String newType) {
        updateAccountType(newType);
    }
}

// BankSystem.java
public class BankSystem {
    public static void main(String[] args) {
        // Creating a customer account
        BankAccount customer = new BankAccount("Alice", "12345", 5000.0, "Savings");
        customer.viewBalance();
        customer.deposit(1000.0);

        // Creating an employee object to change account type
        Employee emp = new Employee("Alice", "12345", 5000.0, "Savings");
        emp.changeAccountType("Current");

        // Creating an admin object to modify balance
        BankAccount.Admin admin = new BankAccount.Admin("Alice", "12345", 5000.0, "Current");
        admin.setBalance(10000.0);
    }
}
