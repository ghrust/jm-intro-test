package com.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Simple Calculator");
//        Input operation.
        Scanner in = new Scanner(System.in);
        System.out.println("Input an operation: ");
        String operation = in.nextLine();

//        TODO: Check for Arabic or Roman numerals.
        ArabicCalc calc = new ArabicCalc(operation);
        System.out.println(calc.calculate(operation));

        in.close();
    }
}
