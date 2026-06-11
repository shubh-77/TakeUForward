package com.oops.basics.exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int num3 = 0;
        try {
            num3 = num1 / num2;
            System.out.println(num3);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("finally block execute whether exception occurs or not");
        }
    }
}
