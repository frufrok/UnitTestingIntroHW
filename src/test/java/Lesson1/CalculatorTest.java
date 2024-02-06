package Lesson1;
import org.junit.jupiter.api.*;
import  static  org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Discount < 0")
    void discountLessThanZero() {
        assertThrowsExactly(IllegalArgumentException.class,
                () -> Calculator.calculatingDiscount(1, -1));
    }

    @Test
    @DisplayName("Discount = 0")
    void discountEqualsZero() {
        assertEquals(Calculator.calculatingDiscount(1, 0), 1);
    }

    @Test
    @DisplayName("Discount = 100")
    void discountEqualsHundred() {
        assertEquals(Calculator.calculatingDiscount(1, 100), 0);
    }

    @Test
    @DisplayName("Discount > 100")
    void discountGreaterThanHundred() {
        assertThrowsExactly(IllegalArgumentException.class,
                () -> Calculator.calculatingDiscount(1, 101));
    }

    @Test
    @DisplayName("Purchase < 0")
    void purchaseLessThanZero() {
        assertThrowsExactly(IllegalArgumentException.class,
                () -> Calculator.calculatingDiscount(-1, 1));
    }

    @Test
    @DisplayName("Purchase = 0")
    void purchaseEqualsZero() {
        assertEquals(Calculator.calculatingDiscount(0, 1), 0);
    }

}