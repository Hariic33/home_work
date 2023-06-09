package io.codelex.classesandobjects.practice;

import java.awt.*;

public class SwapPoints {
    public static void swapPoints(Point p1, Point p2) {
        Point temp = new Point(p1);
        p1.setLocation(p2);
        p2.setLocation(temp);
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}
