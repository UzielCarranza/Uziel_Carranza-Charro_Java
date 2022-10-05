package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

//    Integers
    @Test
    public void mustShowTheOperationPerformedAndTheResultOfAddingTwoIntegers() {
        //        Arrange
        int num1 = 1;
        int num2 = 3;
        String expectedResult = "1 + 3 = 4";

//        ACT
        String actualResult = calculator.addition(num1, num2);

//        Assert

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustShowTheOperationPerformedAndTheResultOfSubtractingTwoIntegers() {
        //        Arrange
        int num1 = 3;
        int num2 = 2;
        String expectedResult = "3 - 2 = 1";

//        ACT
        String actualResult = calculator.subtraction(num1, num2);

//        Assert

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustShowTheOperationPerformedAndTheResultOfMultiplyingTwoIntegers() {
        //        Arrange
        int num1 = 3;
        int num2 = 2;
        String expectedResult = "3 * 2 = 6";

//        ACT
        String actualResult = calculator.multiplication(num1, num2);

//        Assert

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustShowTheOperationPerformedAndTheResultOfDividingTwoIntegers() {
        //        Arrange
        int num1 = 3;
        int num2 = 2;
        String expectedResult = "3 / 2 = 1";

//        ACT
        String actualResult = calculator.division(num1, num2);

//        Assert

        assertEquals(expectedResult, actualResult);
    }

//    DOUBLES
@Test
public void mustShowTheOperationPerformedAndTheResultOfAddingTwoDoubles() {
    //        Arrange
    double num1 = 2.2;
    double num2 = 2.2;
    String expectedResult = "2.2 + 2.2 = 4.4";

//        ACT
    String actualResult = calculator.addition(num1, num2);

//        Assert

    assertEquals(expectedResult, actualResult);
}

    @Test
    public void mustShowTheOperationPerformedAndTheResultOfSubtractingTwoDoubles() {
        //        Arrange
        double num1 = 2.2;
        double num2 = 2.2;
        String expectedResult = "2.2 - 2.2 = 0.0";

//        ACT
        String actualResult = calculator.subtraction(num1, num2);

//        Assert

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustShowTheOperationPerformedAndTheResultOfMultiplyingTwoDoubles() {
        //        Arrange
        double num1 = 2.2;
        double num2 = 2.2;
        String expectedResult = "2.2 * 2.2 = 4.840000000000001";

//        ACT
        String actualResult = calculator.multiplication(num1, num2);

//        Assert

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mustShowTheOperationPerformedAndTheResultOfDividingTwoDoubles() {
        //        Arrange
        double num1 = 20.23;
        double num2 = 2.3;
        String expectedResult = "20.23 / 2.3 = 8.795652173913044";

//        ACT
        String actualResult = calculator.division(num1, num2);

//        Assert

        assertEquals(expectedResult, actualResult);
    }

}