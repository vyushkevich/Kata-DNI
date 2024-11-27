package factoria5.katadni;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DniCalculatorTest {

    private final DniCalculator calculator = new DniCalculator();

    @Test
    void testCalculateDniLetter() {
        assertEquals('T', calculator.calculateDniLetter(0));
        assertEquals('R', calculator.calculateDniLetter(1));
        assertEquals('A', calculator.calculateDniLetter(3));
        assertEquals('E', calculator.calculateDniLetter(99999999));
    }

    @Test
    void testIsValidDni() {
        assertTrue(calculator.isValidDni("12345678"));
        assertFalse(calculator.isValidDni("123456789")); // More than 8 digits
        assertFalse(calculator.isValidDni("abcd")); // Non-numeric input
        assertFalse(calculator.isValidDni("-123")); // Negative number
    }
}
