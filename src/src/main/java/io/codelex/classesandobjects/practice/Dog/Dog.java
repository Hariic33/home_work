package io.codelex.classesandobjects.practice.Dog;

import java.util.Objects;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;


    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;

    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Dog: " + name + ", sex: " + sex;
    }

    public String fathersName() {
        return Objects.requireNonNullElse(father, "Unknown");
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother == null || otherDog.mother == null) {
            return false;
        }
        return mother.equals(otherDog.mother);
    }
}

