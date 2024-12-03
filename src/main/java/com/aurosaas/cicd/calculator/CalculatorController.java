package com.aurosaas.cicd.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/calculators")
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @GetMapping(path = "sum")
    public ResponseEntity<Map<String, Double>> sum(
            @RequestParam(name = "a") double a,
            @RequestParam(name = "b") double b) {
        double summed = calculator.sum(a, b);

        return ResponseEntity.status(200).body(Map.of("result", summed ));
    }
}
