package com.calc;

import java.util.Scanner;

public class Main {
    public static final String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public static final String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static void main(String[] args) {
        System.out.println("Simple Calculator");
//        Input operation.
        Scanner in = new Scanner(System.in);
        System.out.println("Input an operation: ");
        String[] operation = in.nextLine().split("\\s+");

//        TODO: Check for Arabic or Roman numerals.
        if (contains(arab, operation[0]) && contains(arab, operation[2])) {
            ArabicCalc calc = new ArabicCalc(operation);
            System.out.println(calc.calculate(operation));
        } else if (contains(roman, operation[0]) && contains(roman, operation[2])) {
            RomanCalc calc = new RomanCalc(operation);
//            System.out.println(calc.calculate(operation));
            calc.displayResult(calc.calculate(operation));
        } else {
            throw new NumberFormatException();
        }


//

        in.close();
    }

    static Boolean contains(String[] sequence, String number) {
//        Check if number in sequence.
        for (String item:sequence) {
            if (item.equals(number)) {
                return true;
            }
        }
        return false;
    }
}
