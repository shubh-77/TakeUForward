package com.oops.basics.loops;

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit");
        int limit = sc.nextInt();
        int arr[] = new int[limit];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);

        int i = 1;
        while (i <= limit) {

            System.out.println("Printing while loop:" + i);
            i++;
        }

        sc.close();
    }
}
