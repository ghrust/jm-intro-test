package com.calc;

public class ArabicCalc {
//    Arabic calculator.

    String operation;

    ArabicCalc(String operation) {
        this.operation = operation;
    }

    int calculate(String operation) {
//        Split String to Array by spaces.
        String[] operationArray = operation.split("\\s+");

//        Convert operands to Integer.
        int firstOperand = new Integer(operationArray[0]);
        int secondOperand = new Integer(operationArray[2]);

        if (operationArray[1].equals("+")) {
            return firstOperand + secondOperand;
        } else if (operationArray[1].equals("-")) {
            return firstOperand - secondOperand;
        } else if (operationArray[1].equals("*")) {
            return firstOperand * secondOperand;
        } else  if (operationArray[1].equals("/")) {
            return firstOperand / secondOperand;
        } else {
            System.out.println("Wrong operation.");
        }
        return 0;
    }
}
