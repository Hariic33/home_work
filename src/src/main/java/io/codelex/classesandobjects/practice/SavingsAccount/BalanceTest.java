package io.codelex.classesandobjects.practice.SavingsAccount;

import java.util.Scanner;

class BalanceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How much money is in the account?: ");
        double initialBalance = scan.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scan.nextDouble();

        System.out.print("How long has the account been opened? ");
        int numOfMonths = scan.nextInt();

        SavingsAccount account = new SavingsAccount(initialBalance);
        account.setAnnualInterestRate(annualInterestRate);

        double totalDeposits = 0;
        double totalWithdrawals = 0;

        for (int i = 1; i <= numOfMonths; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double deposit = scan.nextDouble();
            account.Deposit(deposit);
            totalDeposits += deposit;

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdraw = scan.nextDouble();
            account.Withdraw(withdraw);
            totalWithdrawals += withdraw;

            account.addMonthlyInterest();
        }
        double endingBalance = account.getBalance();
        double totalInterestEarned = endingBalance - initialBalance - totalDeposits + totalWithdrawals;

        System.out.printf("Total deposited: $%,.2f\n", totalDeposits);
        System.out.printf("Total withdrawn: $%,.2f\n", totalWithdrawals);
        System.out.printf("Interest earned: $%,.2f\n", totalInterestEarned);
        System.out.printf("Ending balance: $%,.2f\n", endingBalance);
    }
}
