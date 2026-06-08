package com.oops.basics.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // &&, ||, !

        boolean first = true;
        boolean second = false;

        boolean result = first && second;
        System.out.println(result);// false

        result = first || second;
        System.out.println(result);// true

    }
}
