package com.aurosaas.cicd.calculator;

import org.springframework.stereotype.Service;

@Service
public class OperationService {

    public double sum(double a, double b) {
        return a + b;
    }
}
