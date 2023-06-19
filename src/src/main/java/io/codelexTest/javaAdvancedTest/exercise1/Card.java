package io.codelexTest.javaAdvancedTest.exercise1;

public abstract class Card {
    private String number;
    private String owner;
    private String ccvCode;
    private int balance;

    public Card(String number, String owner, String ccvCode, int balance) {
        this.number = number;
        setOwner(owner);
        setCcvCode(ccvCode);
        this.balance = balance;
    }

    public void addMoney(int amount) {
        balance += amount;
    }

    public void takeMoney(int amount) throws NotEnoughFundsException {
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}