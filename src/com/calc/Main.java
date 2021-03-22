/*Console application "Calculator".
    The application read the arithmetic operations entered by the user from the console
and output the result of their execution to the console.
    The calculator can perform operations of addition, subtraction, multiplication and
division with two numbers: a + b, a - b, a * b, a / b. The data is transferred in
one line!
    The calculator can work with both Arabic (1,2,3,4,5 ...) and Roman (I, II, III, IV, V ...) numbers.
    The calculator accept numbers from 1 to 10 inclusively, no more.
At the output, the numbers are not limited in size and can be any.
    The calculator can only work with whole numbers.
    The calculator can only work with Arabic or Roman numerals at the same time,
when the user enters a line like 3 + II, the calculator throw an exception and stop working.
Example:
    [IN]: 1 + 2
    [OUT]: 3

    [IN]: V * IV
    [OUT]: XX
* */
package com.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Simple Calculator");
//        Input operation.
        Scanner in = new Scanner(System.in);
        System.out.print("[IN]: ");
        String operation = in.nextLine();
        in.close();

//        Determine type of numbers(arab or roman).
        String calcType = Calculator.checkType(operation);
        Calculator calc = new Calculator(calcType);
//        Evaluate.
        int result = calc.evaluate(operation);
//        Display result.
        calc.displayResult(calcType, result);
    }
}
