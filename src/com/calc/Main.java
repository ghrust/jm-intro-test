package com.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        Scanner in = new Scanner(System.in);
        System.out.println("Input an operation: ");
        String number = in.nextLine();

        System.out.printf("Your operation: %s \n", number);
        in.close();
    }
}
