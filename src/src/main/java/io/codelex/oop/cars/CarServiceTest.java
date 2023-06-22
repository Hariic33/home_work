package io.codelex.oop.cars;

import java.util.List;

public class CarServiceTest {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Manufacturer manufacturer1 = new Manufacturer("Alfa Romeo", 1910, "Italy");
        Manufacturer manufacturer2 = new Manufacturer("Mercedes-Benz", 1926, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Ferrari", 1939, "Italy");
        Manufacturer manufacturer4 = new Manufacturer("Lamborghini", 1963, "Italy");
        Manufacturer manufacturer5 = new Manufacturer("Audi", 1910, "Germany");
        Manufacturer manufacturer6 = new Manufacturer("Porsche", 1931, "Germany");

        Car car1 = new Car("Alfa Romeo Giulia", "Model #1", 50000, 2019, List.of(manufacturer1), EngineType.V6);
        Car car2 = new Car("Mercedes-Benz S-Class", "Model #2", 100000, 2020, List.of(manufacturer2), EngineType.V8);
        Car car3 = new Car("Ferrari 488 GTB", "Model #3", 250000, 2019, List.of(manufacturer3), EngineType.V12);
        Car car4 = new Car("Lamborghini Aventador", "Model #4", 400000, 2021, List.of(manufacturer4), EngineType.V12);
        Car car5 = new Car("Audi R8", "Model #5", 150000, 2020, List.of(manufacturer5), EngineType.V10);
        Car car6 = new Car("Ferrari 812 Superfast", "Model #6", 350000, 2022, List.of(manufacturer3, manufacturer4, manufacturer6), EngineType.V12);
        Car car7 = new Car("Lamborghini Huracan Evo", "Model #7", 250000, 2021, List.of(manufacturer4), EngineType.V10);
        Car car8 = new Car("Chevrolet Camaro", "Model #8", 30000, 1970, List.of(manufacturer5), EngineType.V8);
        Car car9 = new Car("Ford Mustang", "Model #9", 40000, 1965, List.of(manufacturer5), EngineType.V8);
        Car car10 = new Car("Porsche 911", "Model #10", 60000, 1998, List.of(manufacturer5, manufacturer6), EngineType.V6);

        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);
        carService.addCar(car6);
        carService.addCar(car7);
        carService.addCar(car8);
        carService.addCar(car9);
        carService.addCar(car10);

        carService.removeCar(car7);

        System.out.println("All cars: " + carService.getAllCars());
        System.out.println("Cars with V12 engine: " + carService.getCarsWithV12Engine());
        System.out.println("Cars produced before 1999: " + carService.getCarsProducedBefore1999());
        System.out.println("The most expensive car: " + carService.getMostExpensiveCar());
        System.out.println("The cheapest car: " + carService.getCheapestCar());
        System.out.println("The cars with three manufacturers: " + carService.getCarsWithAtLeastThreeManufacturers());
        System.out.println("Cars sorted by price: " + carService.getCarsSortedByPrice(true));
        System.out.println("Car service has the first car: " + carService.hasCar(car1));
        System.out.println("Car service has the first manufacturer: " + carService.getCarsByManufacturer(manufacturer1));
        System.out.println("All cars manufactured by Audi, before the year 2020: " + carService.getCarsByManufacturerWithYearComparison(manufacturer5, "<", 2020));
    }
}