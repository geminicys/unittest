import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Junit5CalculatorTest {

    private Calculator calculator;

    @BeforeEach
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