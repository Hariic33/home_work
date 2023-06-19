package io.codelexTest.javaAdvancedTest.exercise1;

public class CreditCard extends Card {
    private static final int MIN_BALANCE = 100;

    public CreditCard(String number, String owner, String ccvCode, int balance) {
        super(number, owner, ccvCode, balance);
    }

    @Override
    public void takeMoney(int amount) throws NotEnoughFundsException {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Warning: Low funds");
        }
        super.takeMoney(amount);
    }
}