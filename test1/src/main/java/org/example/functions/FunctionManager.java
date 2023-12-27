package org.example.functions;

import java.util.function.DoubleBinaryOperator;

public class FunctionManager {
    private static final DoubleBinaryOperator add = Double::sum;
    private static final DoubleBinaryOperator multiply = (a, b) -> a * b;

    public DoubleBinaryOperator getFunction(String name) {
        switch (name) {
            case "add":
                return add;
            case "multiply":
                return multiply;
            default:
                return null;
        }
    }

    public double calculate(String name, double a, double b) {
        return getFunction(name).applyAsDouble(a, b);
    }
}
