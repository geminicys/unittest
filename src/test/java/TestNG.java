import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestNG {
    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int x = 1;
        int y = 2;
        assertEquals(3, calculator.add(x, y));
    }
}