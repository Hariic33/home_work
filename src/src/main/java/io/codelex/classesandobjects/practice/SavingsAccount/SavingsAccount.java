package io.codelex.classesandobjects.practice.SavingsAccount;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void Withdraw(double amount) {
        balance -= amount;
    }

    public void Deposit(double amount) {
        balance += amount;
    }

    public void addMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }
}

