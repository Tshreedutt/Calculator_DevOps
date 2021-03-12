import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class testCalculator {
    private static final double DELTA = 0.00000005;

    @Test
    public void pos_squareRoot(){
        assertEquals("Positive Test Case: squareRoot, ", 9, Calculator.getSquareRoot(81), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", 0, Calculator.getSquareRoot(0), DELTA);
        assertEquals("Positive Test Case: squareRoot, ",Double.NaN, Calculator.getSquareRoot(-7), DELTA);
    }

    @Test
    public void neg_squareRoot(){
        assertNotEquals("Negative Test Case: squareRoot, ", 8, Calculator.getSquareRoot(55), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 32, Calculator.getSquareRoot(-66), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 23, Calculator.getSquareRoot(89), DELTA);
    }

    @Test
    public void pos_factorial() {
        assertEquals("Positive Test Case: Factorial, ", 24, Calculator.getFactorial(4), DELTA);
        assertEquals("Positive Test Case: Factorial, ", 120, Calculator.getFactorial(5), DELTA);
        assertEquals("Positive Test Case: Factorial, ", Double.NaN, Calculator.getFactorial(-2), DELTA);
    }

    @Test
    public void neg_factorial() {
        assertNotEquals("Negative Test Case: Factorial,", 545, Calculator.getFactorial(4), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 454, Calculator.getFactorial(45), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 142, Calculator.getFactorial(-5), DELTA);
    }

    @Test
    public void pos_calPow() {
        assertEquals("Positive Test Case: Power, ", 36, Calculator.cal_pow(6, 2), DELTA);
        assertEquals("Positive Test Case: Power,", 0.25, Calculator.cal_pow(2, -2), DELTA);
        assertEquals("Positive Test Case: Power, ", Double.NaN, Calculator.cal_pow(0, 0), DELTA);
    }


    @Test
    public void neg_calPow() {
        assertNotEquals("Negative Test Case: Power, ", 34, Calculator.cal_pow(5, 7), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 454, Calculator.cal_pow(45, 6), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 45, Calculator.cal_pow(0, 0), DELTA);
    }

    @Test
    public void logPositive() {
        assertEquals("Positive Test Case: Log, ", 2.302585092994, Calculator.getLogarithm(10), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Calculator.getLogarithm(0), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NaN, Calculator.getLogarithm(-7), DELTA);
    }

    @Test
    public void logNegative(){
        assertNotEquals("Negative Test Case: Log, ", 23, Calculator.getLogarithm(67), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 23, Calculator.getLogarithm(9), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 12, Calculator.getLogarithm(-78), DELTA);
    }
}