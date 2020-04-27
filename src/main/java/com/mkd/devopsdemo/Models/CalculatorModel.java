package com.mkd.devopsdemo.Models;

/**
 * Caculator
 */
public class CalculatorModel {
    public int add(int x, int y) {
        return (x + y);
    }

    public int subtract(int x, int y) {
        return (x - y);
    }

    public int multiply(int x, int y) {
        return (x * y);
    }

    public double divide(int x, int y) {
        double quotient;
        try {
            quotient = x / y;
        } catch (Exception e) {
            quotient = Double.MAX_VALUE;
        }
        return quotient;
    }

    public int modulus(int x, int y) {
        return (x % y);
    }
}