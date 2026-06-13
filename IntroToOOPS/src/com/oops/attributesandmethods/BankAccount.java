package com.oops.attributesandmethods;

public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double money) {
        if (money > 0) {
            this.balance += money;
        } else {
            System.out.println("Can't deposit negative amount");
        }

    }

    public boolean withdraw(double money) {
        if (this.balance >= money) {
            this.balance = -money;
            return true;

        } else {
            System.out.println("Insufficient balance");
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
