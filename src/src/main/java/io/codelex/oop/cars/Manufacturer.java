package io.codelex.oop.cars;

import java.util.Objects;

class Manufacturer {
    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment &&
                Objects.equals(name, that.name) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }
}