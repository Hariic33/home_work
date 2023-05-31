package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, PhoneEntry> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    private int find(String name) {
        int i = 0;
        for (String key : data.keySet()) {
            if (key.equals(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            PhoneEntry entry = data.get(name);
            return entry.getNumber();
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }

        PhoneEntry entry = new PhoneEntry(name, number);
        data.put(name, entry);
    }
}