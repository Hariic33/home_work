package io.codelexTest.exercise1;

public abstract class Card {
    private String number;
    private String owner;
    private String ccvCode;
    private double balance;

    public Card(String number, String owner, String ccvCode, double balance) {
        this.number = number;
        setOwner(owner);
        setCcvCode(ccvCode);
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (balance < amount) {
            throw new NotEnoughFundsException("Warning: Low funds");
        }
        balance -= amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner.isEmpty()) {
            throw new IllegalArgumentException("What's the owner's full name?");
        }
        String[] names = owner.split(" ");
        if (names.length != 2 || names[0].isEmpty() || names[1].isEmpty()) {
            throw new IllegalArgumentException("Expected: First name and last name.");
        }
        this.owner = owner;
    }

    public String getCcvCode() {
        return ccvCode;
    }

    public void setCcvCode(String ccvCode) {
        if (ccvCode.length() != 3 || !ccvCode.matches("\\d+")) {
            throw new IllegalArgumentException("CCV code should be a 3-digit number");
        }
        this.ccvCode = ccvCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    static class NotEnoughFundsException extends Exception {
        public NotEnoughFundsException(String message) {
            super(message);
        }
    }
}