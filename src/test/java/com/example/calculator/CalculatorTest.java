package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testBasicOperations() {
        assertEquals(5, calculator.calculate(Operation.ADD, 2, 3));
        assertEquals(1, calculator.calculate(Operation.SUBTRACT, 2, 3));
        assertEquals(6, calculator.calculate(Operation.MULTIPLY, 2, 3));
        assertEquals(0.67, calculator.calculate(Operation.DIVIDE, 2, 3), 0.01);
    }

    @Test
    public void testChainingOperations() {
        assertEquals(10, calculator.chainOperations(5, Operation.ADD, 3, Operation.MULTIPLY, 2));
    }

    @Test
    public void testUnsupportedOperation() {
        try {
            calculator.calculate(Operation.valueOf("MODULO"), 2, 3);
        } catch (UnsupportedOperationException e) {
            assertEquals("Unsupported operation: MODULO", e.getMessage());
        }
    }
}