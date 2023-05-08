package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        return Math.PI * radius.pow(2).doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.doubleValue() * width.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal height) {
        return base.doubleValue() * height.doubleValue() * 0.5;
    }
}