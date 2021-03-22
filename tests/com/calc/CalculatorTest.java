package com.calc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void evaluate() {
    }

    @Test
    public void convertToInt() {
    }

    @Test
    public void displayResult() {
    }

    @Test
    public void checkType() {
        String expected = "arab";
        String actual = Calculator.checkType("1 + 1");
        Assert.assertEquals(expected, actual);

        expected = "roman";
        actual = Calculator.checkType("I + V");
        Assert.assertEquals(expected, actual);
    }
}