package com.oops.basics;

public class DatatypeExample {
    public static void main(String[] args) {

        // 8 bits -128 to 127
        byte a = 10;

        // 16 bits -32,768 to 32,767
        short b = 20;

        // 32 bits -2^31 to 2^31 -1
        int c = 20;

        // 64 bits -2^63 to 2^63 -1
        long d = 227326723693210l;

        // 32 bits(6-7 digits of precision)
        float num = 5.6f;
        System.out.println(num);

        // 64 bits(15-16 digits of precision)
        double num2 = 5.0;
        System.out.println(num2);

        char ch = 'A';
        System.out.println(ch);

        boolean isJavaFun = true;
        System.out.println("Is Java Fun:" + isJavaFun);

    }
}
