package io.codelex.oop.shapes;

public class Cone extends ThreeDShape {
    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        super(1);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * slantHeight + Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}