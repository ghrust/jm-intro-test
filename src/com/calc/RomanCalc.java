package com.calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RomanCalc {
//    Roman calculator.
    ArrayList<String> romanNumbers = new ArrayList<String>(
            Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"));
    String[] operation;

    RomanCalc(String[] operation) {
        this.operation = operation;
    }

    int calculate(String[] operation) {
//        Convert operands to Integer.
        int firstOperand = convertToInt(operation[0]);
        int secondOperand = convertToInt(operation[2]);

        if (firstOperand <= 0 || firstOperand > 10 || secondOperand <= 0 || secondOperand > 10) {
            System.out.println("Enter numbers in range from I to X.");
            return 0;
        }

        if (operation[1].equals("+")) {
            return firstOperand + secondOperand;
        } else if (operation[1].equals("-")) {
            return firstOperand - secondOperand;
        } else if (operation[1].equals("*")) {
            return firstOperand * secondOperand;
        } else  if (operation[1].equals("/")) {
            return firstOperand / secondOperand;
        } else {
            System.out.println("Wrong operation.");
            return 0;
        }
    }

    int convertToInt(String romanNumber) {
        int arabNumber = romanNumbers.indexOf(romanNumber) + 1;
        return arabNumber;
    }

    void displayResultInRomanNumbers(int number) {
        String numberInRoman = String.join("", Collections.nCopies(number, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC");
        System.out.println(numberInRoman);
    }
}
