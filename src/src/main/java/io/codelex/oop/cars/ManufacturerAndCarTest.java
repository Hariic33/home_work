package io.codelex.oop.cars;

import java.util.List;

public class ManufacturerAndCarTest {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Alfa Romeo", 1910, "Italy");
        Manufacturer manufacturer2 = new Manufacturer("Mercedes-Benz", 1926, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Toyota", 1937, "Japan");

        Car car1 = new Car("Car #1", "Model #1", 50000, 2005, List.of(manufacturer1, manufacturer2), EngineType.V6);
        Car car2 = new Car("Car #2", "Model #2", 70000, 2010, List.of(manufacturer2), EngineType.V8);
        Car car3 = new Car("Car #3", "Model #3", 90000, 2015, List.of(manufacturer1, manufacturer3), EngineType.V12);

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1.equals(manufacturer3));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(manufacturer1.hashCode());
        System.out.println(manufacturer2.hashCode());
    }
}