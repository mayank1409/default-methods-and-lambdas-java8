package io.lestsrunit.lambdas.demo;

public class Main {

    public static void main(String[] args) {
        CalculatorImpl<Integer> integerCalculatorImpl = new CalculatorImpl<>();
        Integer addResult = integerCalculatorImpl.add(10, 20);
        System.out.println(addResult);

        Integer subResult = integerCalculatorImpl.sub(10, 20);
        System.out.println(subResult);

        Integer mulResult = integerCalculatorImpl.mult(10, 20);
        System.out.println(mulResult);

        Integer divResult = integerCalculatorImpl.divide(10, 0);
        System.out.println(divResult);
    }

}
