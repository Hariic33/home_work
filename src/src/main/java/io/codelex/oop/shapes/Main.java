package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.5, 5.5);
        System.out.println("Rectangle");
        System.out.println("Number of sides: " + rectangle.getNumSides());
        System.out.println("Width: " + rectangle.width);
        System.out.println("Height: " + rectangle.height);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3.5, 6.5);
        System.out.println("\nTriangle");
        System.out.println("Number of sides: " + triangle.getNumSides());
        System.out.println("Width/Base: " + triangle.width);
        System.out.println("Height: " + triangle.height);
        System.out.println("Area: " + String.format("%.2f", triangle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", triangle.getPerimeter()));

        Hexagon hexagon = new Hexagon(4);
        System.out.println("\nHexagon");
        System.out.println("Number of sides: " + hexagon.getNumSides());
        System.out.println("Length: " + hexagon.length);
        System.out.println("Area: " + String.format("%.2f", hexagon.getArea()));
        System.out.println("Perimeter: " + hexagon.getPerimeter());

        Cone cone = new Cone(3.5, 5.5);
        System.out.println("\nCone");
        System.out.println("Area: " + String.format("%.2f", cone.getArea()));
        System.out.println("Volume: " + String.format("%.2f", cone.calculateVolume()));

        Cube cube = new Cube(4.5);
        System.out.println("\nCube");
        System.out.println("Number of sides: " + cube.getNumSides());
        System.out.println("Area: " + cube.getArea());
        System.out.println("Volume: " + String.format("%.2f", cube.calculateVolume()));
    }
}