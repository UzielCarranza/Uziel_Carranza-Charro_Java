package com.company;

public class AppCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition of integers");
        System.out.println(calculator.addition(1, 1));
        System.out.println();
        System.out.println("Subtraction of integers");
        System.out.println(calculator.subtraction(23, 52));
        System.out.println();
        System.out.println("Multiplication of integers");
        System.out.println(calculator.multiplication(34, 2));
        System.out.println();
        System.out.println("Division of integers");
        System.out.println(calculator.division(12, 3));
        System.out.println(calculator.division(12, 7));

        System.out.println();

        System.out.println("Addition of doubles");
        System.out.println(calculator.addition(3.4, 2.3));
        System.out.println();
        System.out.println("Subtraction of doubles");
        System.out.println(calculator.subtraction(5.5, 0.5));
        System.out.println();
        System.out.println("Multiplication of doubles");
        System.out.println(calculator.multiplication(6.7, 4.4));
        System.out.println();
        System.out.println("Division of doubles");
        System.out.println(calculator.division(10.8, 2.2));
    }
}
