package io.codelexTest.javaAdvancedTest.exercise1;

public class DebitCard extends Card {
    private static final int MAX_BALANCE = 10000;

    public DebitCard(String number, String owner, String ccvCode, int balance) {
        super(number, owner, ccvCode, balance);
    }

    @Override
    public void addMoney(int amount) {
        if (getBalance() + amount > MAX_BALANCE) {
            System.out.println("Warning: Too much money");
        }
        super.addMoney(amount);
    }
}