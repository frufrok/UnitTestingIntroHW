package Lesson1;
import jdk.jfr.Name;
import org.junit.jupiter.api.*;

import  static  org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Discount < 0")
    void DiscountLessThanZero() {
        assertThrowsExactly(IllegalArgumentException.class,
                () -> Calculator.calculatingDiscount(1, -1));
    }

    @Test
    @DisplayName("Discount = 0")
    void DiscountEqualsZero() {
        assertEquals(Calculator.calculatingDiscount(1, 0), 1);
    }

    @Test
    @DisplayName("Discount = 100")
    void DiscountEqualsHundred() {
        assertEquals(Calculator.calculatingDiscount(1, 100), 0);
    }

    @Test
    @DisplayName("Discount > 100")
    void DiscountGreaterThanHundred() {
        assertThrowsExactly(IllegalArgumentException.class,
                () -> Calculator.calculatingDiscount(1, 101));
    }

    @Test
    @DisplayName("Purchase < 0")
    void PurchaseLessThanZero() {
        assertThrowsExactly(IllegalArgumentException.class,
                () -> Calculator.calculatingDiscount(-1, 1));
    }

    @Test
    @DisplayName("Purchase = 0")
    void PurchaseEqualsZero() {
        assertEquals(Calculator.calculatingDiscount(0, 1), 0);
    }

}