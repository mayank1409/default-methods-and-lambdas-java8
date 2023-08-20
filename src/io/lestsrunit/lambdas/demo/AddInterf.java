package io.lestsrunit.lambdas.demo;

@FunctionalInterface
public interface AddInterf<T> {

    T add(T x, T y);

    default T doAdd(T t1, T t2) {
        if (t1 instanceof Integer) {
            Calculator<Integer> addInts = Integer::sum;
            return (T) addInts.calc((Integer) t1, (Integer) t2);
        } else if (t1 instanceof Double) {
            Calculator<Double> addDoubles = Double::sum;
            return (T) addDoubles.calc((Double) t1, (Double) t2);
        } else if (t1 instanceof String && t2 instanceof String) {
            Calculator<String> addStr = String::concat;
            return (T) addStr.calc((String) t1, (String) t2);
        }
        throw new IllegalArgumentException("Illegal Argument received " + t1.toString() + ", " + t2.toString());
    }

}
