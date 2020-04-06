package com.mkd.devopsdemo;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void addWithInverseShouldReturnZero() {
        Calculator calcTest = new Calculator();
        assertEquals(0, calcTest.add(-5, 5), "-5 + 5 should be 0");
    }

    @org.junit.jupiter.api.Test
    void subtractionOfEqualNumbersShouldBeZero() {
        Calculator calcTest = new Calculator();
        assertEquals(0, calcTest.subtract(5, 5), "5 - 5 should be 0");
    }
}