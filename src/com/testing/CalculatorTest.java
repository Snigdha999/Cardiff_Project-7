package com.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    private static Calculator calculator;

    @BeforeAll
    public static void before() {
        calculator = new Calculator();
    }

    @Test
    public void whenDivideNumbersThenReturnDivision() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void whenDivideByZeroThenThrowException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    public void whenAddNumbersThenReturnAddition() {
        assertEquals(6, calculator.addition(4, 2));
    }

    @Test
    public void whenSubtractNumbersThenReturnSubtraction() {
        assertEquals(-2, calculator.subtraction(2, 4));
    }

    @Test
    public void whenMultiplyNumbersThenReturnMultiplication() {
        assertEquals(8, calculator.multiplication(4, 2));
    }
}
