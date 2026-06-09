package com.oops.basics.inputandoutput;

import java.util.Scanner;

public class InputOutputEg1 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n= sc.nextInt();
    String s = sc.nextLine();
    System.out.println("output:"+n);
    System.out.println(s);
    sc.close();

    //We can also use BufferedReader but we don't use because it does does not have in-built functions for reading int,float,double
    //but buffered read is faster when you have large number of inputs
}
}
