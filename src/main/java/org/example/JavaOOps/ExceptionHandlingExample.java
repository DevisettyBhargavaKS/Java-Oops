package org.example.JavaOOps;




public class ExceptionHandlingExample {


    public static int divide(int numerator, int denominator) {

        if (denominator == 0) {

            throw new ArithmeticException("Cannot divide by zero");
        }

        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {

            int result = divide(10, 5);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());
        } finally {

            System.out.println("Finally block - cleanup code goes here");
        }

        System.out.println("Program continues...");
    }

}


