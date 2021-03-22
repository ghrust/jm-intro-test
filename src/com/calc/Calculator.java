package com.calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Calculator {

    String calcType;

    public static final ArrayList<String> romanNumbers = new ArrayList<>(
            Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"));
    public static final ArrayList<String> arabNumbers = new ArrayList<>(
            Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));

    Calculator(String calcType) {
        this.calcType = calcType;
    }

    int evaluate(String operation) {
//        Evaluate operation.
        String[] operationArray = operation.split("\\s+");

//        Convert operands to Integer.
        int firstOperand = convertToInt(calcType, operationArray[0]);
        int secondOperand = convertToInt(calcType, operationArray[2]);
        String symbol = operationArray[1];

        if (firstOperand <= 0 || firstOperand > 10 || secondOperand <= 0 || secondOperand > 10) {
            throw new NumberFormatException("Enter numbers in range from 1 to 10 (from I to X).");
        }

        switch (symbol) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                return firstOperand / secondOperand;
            default:
                throw new ArithmeticException("Wrong operation symbol.");
        }
    }

    int convertToInt(String calcType, String number) {
        if (calcType.equals("roman")) {
            return romanNumbers.indexOf(number) + 1;
        }
        return new Integer(number);
    }

    void displayResult(String calcType, int result) {
//        Display result in roman or arab numerics.
        if (calcType.equals("roman")) {
            String resultInRoman = String.join("", Collections.nCopies(result, "I"))
                    .replace("IIIII", "V")
                    .replace("IIII", "IV")
                    .replace("VV", "X")
                    .replace("VIV", "IX")
                    .replace("XXXXX", "L")
                    .replace("XXXX", "XL")
                    .replace("LL", "C")
                    .replace("LXL", "XC");
            System.out.println("[OUT]: " + resultInRoman);
        } else {
            System.out.println("[OUT]: " + result);
        }
    }

    public static String checkType(String operation) {
//        Determines the type of numbers entered.
        String calcType = "";
        String[] operationArray = operation.split("\\s+");
        if (romanNumbers.contains(operationArray[0]) && romanNumbers.contains(operationArray[2])) {
            calcType = "roman";
        } else if (arabNumbers.contains(operationArray[0]) && arabNumbers.contains(operationArray[2])) {
            calcType = "arab";
        } else {
            throw new NumberFormatException("Wrong format.");
        }
        return calcType;
    }
}
