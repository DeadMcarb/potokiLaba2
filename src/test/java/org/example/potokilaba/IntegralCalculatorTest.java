package org.example.labapotoki1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegralCalculatorTest {

    @Test
    void test00() {
        Function f = new Function();
        var result = f.calculate(Math.PI/4);
        Assertions.assertEquals(1, result, 1e-15);
    }

    @Test
    void test01() {
        Function f = new Function();
        var result = f.calculate(Math.PI/6);
        Assertions.assertEquals(1.33333333333333333, result, 1e-15);
    }

    @Test
    void test1() {
        Function f = new Function();
        IntegralCalculator ic = new IntegralCalculator(10);
        double result = ic.calculate(Math.PI/6, Math.PI/4, 100000, f);
        Assertions.assertEquals(0.2886751389581343, result, 1e-6);
    }

    @Test
    void test2() {
        Function f = new Function();
        IntegralCalculator ic = new IntegralCalculator(8);
        double result = ic.calculate(0, Math.PI/3, 100000000, f);
        Assertions.assertEquals(1.0 / 0.0, result, 1e-15);
    }



}
