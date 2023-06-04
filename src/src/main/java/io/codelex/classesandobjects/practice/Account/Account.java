package io.codelex.classesandobjects.practice.Account;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void transfer(Account from, Account to, double howMuch) {
        if (from.balance() < howMuch) {
            System.out.println("Insufficient funds in the from account.");
            return;
        }
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
