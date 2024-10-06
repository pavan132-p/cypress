package javaproject;

//public class SimpleCalculator {
//
//}

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Implement switch case to perform arithmetic operations
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
            }
            case '/' -> {
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
            }
            default -> System.out.println("Error: Invalid operator.");
        }

        scanner.close();
    }
}