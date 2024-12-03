package com.aurosaas.cicd.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static  org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    private Calculator calculator =  new Calculator();

    @Test
    public void sumSuccess() {
        assertEquals(7, calculator.sum(3, 4));
    }
}
