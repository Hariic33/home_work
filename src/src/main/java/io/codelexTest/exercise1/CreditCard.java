package io.codelexTest.exercise1;

public class CreditCard extends Card {
    private static final double MIN_BALANCE = 100;

    public CreditCard(String number, String owner, String ccvCode, double balance) {
        super(number, owner, ccvCode, balance);
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Warning: Low funds");
        }
        super.takeMoney(amount);
    }
}