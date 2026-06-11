package com.oops.basics.exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int num3;
        try {
            num3 = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
