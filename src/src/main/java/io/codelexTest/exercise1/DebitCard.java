package io.codelexTest.exercise1;

public class DebitCard extends Card {
    private static final double MAX_BALANCE = 10000;

    public DebitCard(String number, String owner, String ccvCode, double balance) {
        super(number, owner, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        if (getBalance() + amount > MAX_BALANCE) {
            System.out.println("Warning: Too much money");
        }
        super.addMoney(amount);
    }
}