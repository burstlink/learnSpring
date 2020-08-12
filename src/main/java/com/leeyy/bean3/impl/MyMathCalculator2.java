package com.leeyy.bean3.impl;

import com.leeyy.bean3.inter.Calculator;
import org.springframework.stereotype.Service;

@Service
public class MyMathCalculator2 {

    public double add(double x, double y) {
        double res = x + y;
        return res;
    }

    public double sub(double x, double y) {
        double res = x - y;
        return res;
    }

    public double mul(double x, double y) {
        double res = x * y;
        return res;
    }

    public double div(double x, double y) {
        double res = x / y;
        return res;
    }
}
