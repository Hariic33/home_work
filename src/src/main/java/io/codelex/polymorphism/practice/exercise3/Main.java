package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("John", "Doe",
                "1234 Elm Street", 987654, 3.75);
        Person employee = new Employee("Jane", "Doe",
                "Cityville, Imaginaria", 123456, "Chief Beverage Officer");

        System.out.println("Student");
        student.display();
        System.out.println("\nEmployee");
        employee.display();
    }
}
