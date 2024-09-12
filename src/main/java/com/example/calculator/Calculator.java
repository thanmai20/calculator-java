package com.example.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.EnumMap;
import java.util.Map;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    private final Map<Operation, OperationHandler> operationHandlers;

    public Calculator() {
        operationHandlers = new EnumMap<>(Operation.class);
        registerOperationHandler(Operation.ADD, (a, b) -> a + b);
        registerOperationHandler(Operation.SUBTRACT, (a, b) -> a - b);
        registerOperationHandler(Operation.MULTIPLY, (a, b) -> a * b);
        registerOperationHandler(Operation.DIVIDE, (a, b) -> a / b);
    }

    public double calculate(Operation op, double num1, double num2) {
        OperationHandler handler = operationHandlers.get(op);
        if (handler == null) {
            logger.error("Unsupported operation: {}", op);
            throw new UnsupportedOperationException("Unsupported operation: " + op);
        }
        return handler.handle(num1, num2);
    }

    public double chainOperations(double initialValue, Operation... operations) {
        double result = initialValue;
        for (Operation op : operations) {
            result = calculate(op, result, 0);
        }
        return result;
    }

    private void registerOperationHandler(Operation op, OperationHandler handler) {
        operationHandlers.put(op, handler);
    }

    @FunctionalInterface
    private interface OperationHandler {
        double handle(double a, double b);
    }
}