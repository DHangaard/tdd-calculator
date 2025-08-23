package io.dhangaard.tdd;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Overload addition method to take String input
    public int add (String input){
        int result = 0;
        String[] numbers = input.split(",");

        for (String number : numbers){
            int n = Integer.parseInt(number);
            result += n;
        }

        return result;
    }

    // Subtraction
    public int sub(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int mul(int a, int b) {
        return a * b;
    }

    // Division
    public int div(int a, int b) {
        return a / b;
    }
}
