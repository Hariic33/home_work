package io.codelex.oop.shapes;

public class Triangle extends Shape {
    double width;
    double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height * width) / 2;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(height * height + width * width);
        return height + width + hypotenuse;
    }
}