package io.codelex.classesandobjects.practice;

import java.util.Scanner;

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

class BankBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = scan.nextLine();

        System.out.println("Input your balance");
        double balance = scan.nextDouble();

        BankAccount account = new BankAccount();
        account.name = name;
        account.balance = balance;

        System.out.println(account);

        System.out.println("What would you like to do?");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        int decision = scan.nextInt();

        System.out.println("Enter the amount: ");
        double amount = scan.nextDouble();

        if (decision == 1) {
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } else if (decision == 2) {
            if (amount <= account.balance) {
                account.withdraw(amount);
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid action.");
        }
        System.out.println("Updated account information:");
        System.out.println(account);
    }
}
