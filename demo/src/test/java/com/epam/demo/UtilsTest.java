package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void returnsTrueWhenAllPositive() {
        assertTrue(Utils.isAllPositiveNumbers(List.of("1", "2", "3")));
    }

    @Test
    void returnsFalseWhenZero() {
        assertFalse(Utils.isAllPositiveNumbers(List.of("0", "1", "2")));
    }

    @Test
    void returnsFalseWhenNegative() {
        assertFalse(Utils.isAllPositiveNumbers(List.of("1", "3", "-1")));
    }

}