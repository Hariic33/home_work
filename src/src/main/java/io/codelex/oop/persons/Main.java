package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Brown",
                "123456-78910", 27, "Accountant", LocalDate.of(2015, 7, 15));
        System.out.println("Employee: " + employee.getInfo() + " " + employee.getId());

        Customer customer = new Customer("Peter", "Brown",
                "098765-43210", 33, "CID1234", 5);
        customer.setPurchaseCount(10);
        System.out.println("Customer: " + customer.getInfo());
    }
}