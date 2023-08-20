package io.lestsrunit.lambdas.demo;

public interface DivideInterf<T> {

    T divide(T t1, T t2);

    default T doDivide(T t1, T t2) {
        if (t1 instanceof Integer) {
            Calculator<Integer> addInts = (a, b) -> (b != 0) ? a / b : Integer.MIN_VALUE;
            return (T) addInts.calc((Integer) t1, (Integer) t2);
        } else if (t1 instanceof Double) {
            Calculator<Double> addDoubles = (a, b) -> (b != 0) ? a / b : Double.MIN_VALUE;
            return (T) addDoubles.calc((Double) t1, (Double) t2);
        }
        throw new IllegalArgumentException("Illegal Argument received " + t1.toString() + ", " + t2.toString());
    }
}
