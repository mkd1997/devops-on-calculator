package com.mkd.devopsdemo;

import com.mkd.devopsdemo.Models.CalculatorModel;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {

    @org.junit.jupiter.api.Test
    void addWithInverseShouldReturnZero() {
        CalculatorModel calcTest = new CalculatorModel();
        assertEquals(0, calcTest.add(-5, 5), "-5 + 5 should be 0");
    }

    @org.junit.jupiter.api.Test
    void subtractionOfEqualNumbersShouldBeZero() {
        CalculatorModel calcTest = new CalculatorModel();
        assertEquals(0, calcTest.subtract(5, 5), "5 - 5 should be 0");
    }
}