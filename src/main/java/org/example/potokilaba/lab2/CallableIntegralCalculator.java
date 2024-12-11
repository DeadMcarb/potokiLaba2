package org.example.potokilaba.lab2;

import java.util.concurrent.Callable;
import java.util.function.DoubleUnaryOperator;
import org.example.potokilaba.Function;

public class IntegralCalculator implements Callable<Double> {

    private final Function function;

    public IntegralCalculator(double start, double end, int nSteps, DoubleUnaryOperator f) {
        function = new Function(start, end, nSteps, f);
    }

    @Override
    public Double call() {
        return function.calculate();
    }
}
