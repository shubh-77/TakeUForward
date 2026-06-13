package com.oops.attributesandmethods;

public class BankAccount1 {

    private String accountNumber;
    private double balance;

    public BankAccount1(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance = -amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void displayDetails() {
        System.out.printf("\nAccount Number : %s", this.accountNumber);
        System.out.printf("\nBalance : %.2f ", this.balance);

    }
    /*
     * deposit (double amount) : It adds the amount to the balance of the user's
     * account.
     * withdraw (double amount) : It deducts the money (amount) from the balance. If
     * the balance is insufficient then print "Insufficient funds!" and do not
     * change the original amount.
     * displayDetails() : It displays the accountNumber and balance of the account.
     * 
     * 
     * 
     */

}
