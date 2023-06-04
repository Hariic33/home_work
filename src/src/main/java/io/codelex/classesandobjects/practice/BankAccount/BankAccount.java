package io.codelex.classesandobjects.practice.BankAccount;

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        if (balance >= 0) {
            return name + ", $" + String.format("%.2f", balance);
        } else {
            return name + ", -$" + String.format("%.2f", -balance);
        }
    }
}

