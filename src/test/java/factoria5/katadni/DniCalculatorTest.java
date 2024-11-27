package factoria5.katadni;

import factoria5.katadni.Model.DniCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DniCalculatorTest {

    private final DniCalculator calculator = new DniCalculator();

    @Test
    void testCalculateDniLetter() {
        // Проверка букв для различных чисел
        assertEquals('T', calculator.calculateDniLetter(0)); // Остаток 0 -> T
        assertEquals('R', calculator.calculateDniLetter(1)); // Остаток 1 -> R
        assertEquals('A', calculator.calculateDniLetter(3)); // Остаток 3 -> A
        assertEquals('R', calculator.calculateDniLetter(99999999)); // Остаток 4 -> R (не E)
    }

    @Test
    void testIsValidDni() {
        // Проверка на валидность номера DNI
        assertTrue(calculator.isValidDni("12345678"));
        assertFalse(calculator.isValidDni("123456789")); // Больше 8 цифр
        assertFalse(calculator.isValidDni("abcd")); // Некорректный ввод
        assertFalse(calculator.isValidDni("-123")); // Отрицательное число
    }
}
