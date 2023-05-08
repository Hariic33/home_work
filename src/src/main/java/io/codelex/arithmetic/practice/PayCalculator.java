package io.codelex.arithmetic.practice;

public class PayCalculator {
    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < 8.00) {
            System.out.println("Error: Base pay cannot be less than $8.00/h.");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Error: Employee cannot work more than 60h/week.");
            return;
        }
        double totalPay;
        if (hoursWorked > 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }
        System.out.println("Total pay: $" + totalPay);
    }
        public static void main(String[] args) {
            calculatePay(7.50, 35);
            calculatePay(8.20, 47);
            calculatePay(10.00, 73);
    }
}
