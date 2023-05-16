package io.codelex.classesandobjects.practice;

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

class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female", "Molly", "Buster");

        System.out.println(max);
        System.out.println(rocky);
        System.out.println(sparky);
        System.out.println(buster);
        System.out.println(sam);
        System.out.println(lady);
        System.out.println(molly);
        System.out.println(coco);

        System.out.println(coco.fathersName());
        System.out.println(sparky.fathersName());

        System.out.println(coco.hasSameMotherAs(rocky));
        System.out.println(coco.hasSameMotherAs(max));
    }
}