package io.codelex.oop.shapes;

public abstract class ThreeDShape extends Shape {

    public ThreeDShape(int numSides) {
        super(numSides);
    }

    public abstract double calculateVolume();

}