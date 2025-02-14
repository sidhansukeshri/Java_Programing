package banking;

public class BankSystem {
    public static void main(String[] args) {
        // Customer account (Cannot modify balance, only view & deposit)
        BankAccount customer = new BankAccount("John Doe", "12345", 1000.0, "Savings");
        System.out.println("=== Customer Access ===");
        customer.viewBalance();
        customer.deposit(500.0);  // Customer deposits money
        customer.viewBalance();

        System.out.println("\n=== Employee Access ===");
        // Employee modifies account type
        Employee employee = new Employee("John Doe", "12345", 1000.0, "Savings");
        employee.changeAccountType("Current");

        System.out.println("\n=== Admin Access ===");
        // Admin modifies the customer's balance
        BankAccount.Admin admin = new BankAccount.Admin();
        admin.setBalance(customer, 5000.0);
        customer.viewBalance();
    }
}
