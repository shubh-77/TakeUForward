package com.oops.basics.loops;

import java.util.Scanner;

public class LoopExample3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        do {
            System.out.println("Enter number");
            num = sc.nextInt();
            System.out.print(num + " ");
        } while (num != 10);

        sc.close();
    }
}
