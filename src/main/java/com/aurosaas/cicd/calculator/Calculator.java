package com.aurosaas.cicd.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }
}
