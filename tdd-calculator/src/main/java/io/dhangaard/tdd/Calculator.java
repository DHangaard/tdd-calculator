package io.dhangaard.tdd;

public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Overload addition method to take String input
    public int add(String numbers){
        int result = 0;

        for (String number : numbers.split(",")){
            int n = Integer.parseInt(number);
            result += n;
        }

        return result;
    }

    // Overload addition method to take int array
    public int add(int[] numbers){
        int result = 0;

        for (int number : numbers){
            result += number;
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
