package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CarService {
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCarsWithV12Engine() {
        List<Car> v12Cars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                v12Cars.add(car);
            }
        }
        return v12Cars;
    }

    public List<Car> getCarsProducedBefore1999() {
        List<Car> carsBefore1999 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture() < 1999) {
                carsBefore1999.add(car);
            }
        }
        return carsBefore1999;
    }

    public Car getMostExpensiveCar() {
        if (cars.isEmpty()) {
            return null;
        }
        Car mostExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar() {
        if (cars.isEmpty()) {
            return null;
        }
        Car cheapestCar = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() < cheapestCar.getPrice()) {
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public List<Car> getCarsWithAtLeastThreeManufacturers() {
        List<Car> carsWithThreeManufacturers = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturers().size() >= 3) {
                carsWithThreeManufacturers.add(car);
            }
        }
        return carsWithThreeManufacturers;
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        List<Car> sortedCars = new ArrayList<>(cars);
        sortedCars.sort(Comparator.comparingDouble(Car::getPrice));
        if (!ascending) {
            Collections.reverse(sortedCars);
        }
        return sortedCars;
    }

    public boolean hasCar(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturers().contains(manufacturer)) {
                carsByManufacturer.add(car);
            }
        }
        return carsByManufacturer;
    }

    public List<Car> getCarsByManufacturerWithYearComparison(Manufacturer manufacturer, String comparisonOperator, int year) {
        List<Car> matchingCars = new ArrayList<>();
        for (Car car : cars) {
            List<Manufacturer> manufacturers = car.getManufacturers();
            if (manufacturers.contains(manufacturer) && compareYears(car.getYearOfManufacture(), year, comparisonOperator)) {
                matchingCars.add(car);
            }
        }
        return matchingCars;
    }

    private boolean compareYears(int year1, int year2, String operator) {
        return switch (operator) {
            case "<" -> year1 < year2;
            case ">" -> year1 > year2;
            case "<=" -> year1 <= year2;
            case ">=" -> year1 >= year2;
            case "=" -> year1 == year2;
            case "!=" -> year1 != year2;
            default -> false;
        };
    }
}