package sample.nuesmart.com.testotherconnection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ROG on 29/01/2018.
 */

public class CalculatorUnitTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(4, calculator.subtract(6, 2));
    }

    @Test
    public void multiplication_isCorrect() throws Exception {
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void division_isCorrect() throws Exception {
        assertEquals(4, calculator.divide(8, 2));
    }
}
