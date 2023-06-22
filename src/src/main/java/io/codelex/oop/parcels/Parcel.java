package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("Sum of dimensions exceeds 300.");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Each dimension should be at least 30.");
            return false;
        }
        if (isExpress && weight > 15.0f) {
            System.out.println("Weight exceeds 15.0 for express delivery.");
            return false;
        }
        if (!isExpress && weight > 30.0f) {
            System.out.println("Weight exceeds 30.0 for standard delivery.");
            return false;
        }
        return true;
    }
}