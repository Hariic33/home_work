package io.codelex.oop.shapes;

public class Hexagon extends Shape {
    double length;

    public Hexagon(double length) {
        super(6);
        this.length = length;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) * Math.pow(length, 2)) / 2;
    }

    @Override
    public double getPerimeter() {
        return 6 * length;
    }
}