package io.lestsrunit.lambdas.demo;

public class CalculatorImpl<T> implements AddInterf<T>, SubstractInterf<T>, MultiplyInterf<T>, DivideInterf<T> {

    @Override
    public T add(T t1, T t2) {
        return AddInterf.super.doAdd(t1, t2);
    }

    @Override
    public T sub(T t1, T t2) {
        return SubstractInterf.super.doSub(t1, t2);
    }

    @Override
    public T mult(T t1, T t2) {
        return MultiplyInterf.super.doMult(t1, t2);
    }

    @Override
    public T divide(T t1, T t2) {
        return DivideInterf.super.doDivide(t1, t2);
    }
}
