package io.codelexTest.javaAdvancedTest.exercise1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234567890", "John Doe", "123", 1500);

        try {
            creditCard.takeMoney(550);
            creditCard.takeMoney(900);
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        DebitCard debitCard = new DebitCard("0987654321", "Jane Doe", "987", 9000);

        try {
            debitCard.addMoney(1050);
            debitCard.takeMoney(5000);
            debitCard.takeMoney(6000);
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}