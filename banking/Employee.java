package banking;

public class Employee extends BankAccount {
    // Constructor calls superclass constructor
    public Employee(String accountHolder, String accountNumber, double balance, String accountType) {
        super(accountHolder, accountNumber, balance, accountType);
    }

    // Employee can change account type
    public void changeAccountType(String newType) {
        updateAccountType(newType);
    }
}
