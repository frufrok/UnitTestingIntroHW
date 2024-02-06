package Lesson3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SomeClassTest {
    static final SomeClass sm = new SomeClass();
    @ParameterizedTest
    @ValueSource(ints = {-5, -3, -1, 1, 3, 5, Integer.MAX_VALUE})
    @DisplayName("Odd value")
    void oddValueTest(int value) {
        assertFalse(sm.evenOddNumber(value));
    }
    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, -4, -2, 0, 2, 4})
    @DisplayName("Even value")
    void evenValueTest(int value) {
        assertTrue(sm.evenOddNumber(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, 25, 100, Integer.MAX_VALUE})
    @DisplayName("Number are not in range")
    void numberAreNotInRange(int value) {
        assertFalse(sm.numberInInterval(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 50, 99})
    @DisplayName("Number are in range")
    void numberAreInRange(int value) {
        assertTrue(sm.numberInInterval(value));
    }
}