package task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Итоговая сумма на 10% меньше")
    void calculatingDiscount10() {
        double result = Calculator.calculatingDiscount(1000.0, 10);
        assertEquals(900, result);
    }
    @Test
    @DisplayName("Итоговая сумма на 50% меньше")
    void calculatingDiscount50() {
        double result = Calculator.calculatingDiscount(800.0, 50);
        assertEquals(400, result);
    }

    @Test
    @DisplayName("Отрицательная сумма")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.calculatingDiscount(-10, 100));
    }
}