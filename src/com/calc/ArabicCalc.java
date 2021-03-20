package com.calc;

public class ArabicCalc {
//    Arabic calculator.

    String operation;

    ArabicCalc(String operation) {
        this.operation = operation;
    }

    int calculate(String operation) {
//        TODO: extend regex for many spaces case
        String[] operationArray = operation.split(" ");

        int firstOperand = new Integer(operationArray[0]);
        int secondOperand = new Integer(operationArray[2]);
        String symbol = new String(operationArray[1]);

        if (operationArray[1].equals("+")) {
            return firstOperand + secondOperand;
        } else if (operationArray[1].equals("-")) {
            return firstOperand - secondOperand;
        }
        return 0;
    }
}
