package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class IntsCalculatorTest {

    @ParameterizedTest
    @CsvSource({"1,7", "2,6", "3,5", "4,4"})
    void shouldReturnSum(int a, int b) {
        Ints calc = new IntsCalculator();

        int expected = 8;
        int actual = calc.sum(a, b);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"1,18", "2,9", "3,6"})
    void shouldReturnMult(int a, int b) {
        Ints calc = new IntsCalculator();

        int expected = 18;
        int actual = calc.mult(a, b);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"81,2", "9,4", "3,8"})
    void shouldReturnPow(int a, int b) {
        Ints calc = new IntsCalculator();

        int expected = 6_561;
        int actual = calc.pow(a, b);

        assertEquals(expected, actual);
    }
}