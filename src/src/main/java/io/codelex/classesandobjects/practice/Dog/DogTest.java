package io.codelex.classesandobjects.practice.Dog;

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
