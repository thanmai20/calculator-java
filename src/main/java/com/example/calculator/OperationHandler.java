package com.example.calculator;

@FunctionalInterface
public interface OperationHandler {
    double handle(double a, double b);
}