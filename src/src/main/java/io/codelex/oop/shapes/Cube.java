package io.codelex.oop.shapes;

public class Cube extends ThreeDShape {
    private final double sideLength;

    public Cube(double sideLength) {
        super(6);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 6 * sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return sideLength * sideLength * sideLength;
    }
}