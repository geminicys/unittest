import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Junit4Test {

    private Calculator calculator;

    @Before
    public void calculator() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        int x = 1;
        int y = 2;
        assertEquals(3, calculator.add(x, y));
    }
}