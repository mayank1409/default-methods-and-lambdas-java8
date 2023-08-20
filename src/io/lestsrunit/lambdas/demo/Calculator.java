package io.lestsrunit.lambdas.demo;

@FunctionalInterface
public interface Calculator<T> {
    T calc(T t1, T t2);
}
