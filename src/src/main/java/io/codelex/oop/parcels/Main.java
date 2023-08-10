package io.codelex.oop.parcels;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(20, 40, 50, 25.0f, true);
        System.out.println("Validation result for 1st parcel: " + parcel1.validate() + "\n");

        Parcel parcel2 = new Parcel(60, 30, 40, 10.0f, false);
        System.out.println("Validation result for 2nd parcel: " + parcel2.validate() + "\n");

        Parcel parcel3 = new Parcel(30, 30, 30, 35.0f, false);
        System.out.println("Validation result for 3rd parcel: " + parcel3.validate() + "\n");

        Parcel parcel4 = new Parcel(40, 40, 40, 12.0f, true);
        System.out.println("Validation result for 4th parcel: " + parcel4.validate() + "\n");

        Parcel parcel5 = new Parcel(40, 130, 140, 30.0f, false);
        System.out.println("Validation result for 5th parcel: " + parcel5.validate() + "\n");

        Parcel parcel6 = new Parcel(40, 30, 50, 20.0f, true);
        System.out.println("Validation result for 6th parcel: " + parcel6.validate());
    }
}