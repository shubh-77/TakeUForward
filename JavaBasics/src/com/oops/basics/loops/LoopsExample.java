package com.oops.basics.loops;

import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
