package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation (+, -, *, /):");
        String operation = scanner.next();
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        double result = calculator.calculate(Operation.valueOf(operation), num1, num2);
        System.out.println("Result: " + result);
    }
}