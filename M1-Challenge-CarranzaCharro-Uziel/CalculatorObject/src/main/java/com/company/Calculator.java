package com.company;

import java.text.DecimalFormat;

public class Calculator {

    //    Calculates Integers
    public String addition(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtraction(int num1, int num2) {

        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplication(int num1, int num2) {

        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String division(int num1, int num2) {

        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

    //    Calculates Doubles
    public String addition(double num1, double num2) {

        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtraction(double num1, double num2) {

        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplication(double num1, double num2) {

        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String division(double num1, double num2) {

        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
