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
        assertEquals(1, Calculator.calculatingDiscount(1, 0));
    }

    @Test
    @DisplayName("Discount = 100")
    void discountEqualsHundred() {
        assertEquals(0, Calculator.calculatingDiscount(1, 100));
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
        assertEquals(0, Calculator.calculatingDiscount(0, 1));
    }

}