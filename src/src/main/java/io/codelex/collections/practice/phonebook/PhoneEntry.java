package io.codelex.collections.practice.phonebook;

class PhoneEntry {
    private final String name;
    private final String number;

    public PhoneEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
