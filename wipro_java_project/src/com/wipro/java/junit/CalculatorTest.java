package com.wipro.java.junit;

import org.junit.jupiter.api.Test;

// Test class for Calculator
public class CalculatorTest {

    private final Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        int result = calculator.add1(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.add1(-3, -2);
        assertEquals(-5, result);
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        int result = calculator.subtract(-3, -2);
        assertEquals(-1, result);
    }

	private void assertEquals(int i, int result) {
		// TODO Auto-generated method stub
		
	}
}
