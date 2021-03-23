package com.calc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void evaluate() {
        String calcType;
        String operation;
        Calculator calc;

        calcType = "arab";
        calc = new Calculator(calcType);
        operation = "2 + 3";
        int actual = calc.evaluate(operation);
        int expected = 5;
        Assert.assertEquals(expected, actual);

        operation = "2 - 3";
        actual = calc.evaluate(operation);
        expected = -1;
        Assert.assertEquals(expected, actual);

        operation = "2 * 3";
        actual = calc.evaluate(operation);
        expected = 6;
        Assert.assertEquals(expected, actual);

        operation = "10 / 2";
        actual = calc.evaluate(operation);
        expected = 5;
        Assert.assertEquals(expected, actual);

        calcType = "roman";
        calc = new Calculator(calcType);
        operation = "II + III";
        actual = calc.evaluate(operation);
        expected = 5;
        Assert.assertEquals(expected, actual);

        operation = "III - II";
        actual = calc.evaluate(operation);
        expected = 1;
        Assert.assertEquals(expected, actual);

        operation = "V * VI";
        actual = calc.evaluate(operation);
        expected = 30;
        Assert.assertEquals(expected, actual);

        operation = "X / II";
        actual = calc.evaluate(operation);
        expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToInt() {
        String calcType = "arab";
        Calculator calc = new Calculator(calcType);
        int actual = calc.convertToInt(calcType, "1");
        int expected = 1;
        Assert.assertEquals(expected, actual);

        calcType = "roman";
        actual = calc.convertToInt(calcType, "II");
        expected = 2;
        Assert.assertEquals(expected, actual);
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