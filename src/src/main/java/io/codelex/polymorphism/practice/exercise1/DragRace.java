package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class DragRace {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Mercedes mercedes = new Mercedes();
        Tesla tesla = new Tesla();
        Volvo volvo = new Volvo();

        carList.add(audi);
        carList.add(bmw);
        carList.add(lexus);
        carList.add(mercedes);
        carList.add(tesla);
        carList.add(volvo);

        for (int i = 0; i < 10; i++) {
            for (Car car : carList) {
                System.out.println(car + ", iteration #" + (i + 1));

                if (i == 0) {
                    car.startEngine();
                }

                if (i < 9) {
                    car.speedUp();
                }

                if (i == 9) {
                    car.slowDown();
                }

                if (i == 2 && car instanceof Boost boostCar) {
                    boostCar.useNitrousOxideEngine();
                }

                System.out.println("Current speed: " + car.showCurrentSpeed());
                System.out.println();
            }
        }
        System.out.println("The race is finished.");
        Car fastestCar = getFastestCar(carList);
        if (fastestCar != null) {
            System.out.println("Fastest car: " + fastestCar + ", Speed: " + fastestCar.showCurrentSpeed());
        }

    }

    private static Car getFastestCar(List<Car> carList) {
        Car fastestCar = null;
        int maxSpeed = 0;

        for (Car car : carList) {
            int currentSpeed = Integer.parseInt(car.showCurrentSpeed());
            if (currentSpeed > maxSpeed) {
                maxSpeed = currentSpeed;
                fastestCar = car;
            }
        }
        return fastestCar;
    }
}