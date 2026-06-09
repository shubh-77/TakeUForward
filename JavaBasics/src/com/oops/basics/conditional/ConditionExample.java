package com.oops.basics.conditional;

import java.util.Scanner;

public class ConditionExample {
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    // System.out.println("Enter age");
    // int age=s.nextInt();
    // if(age>=18){
    //     System.out.println("Adult");
    // }
    // else{
    //     System.out.println("Teen");
    // }



    // int marks=s.nextInt();
    // if(marks>=90){
    //     System.out.println("Grade A");
    // }else if(marks>=70){
    //             System.out.println("Grade B");

    // }else if(marks>=50){
    //             System.out.println("Grade C");

    // }else if(marks>=35){
    //             System.out.println("Grade D");

    // }else{
    //     System.out.println("Fail");
    // }

    //to find greatest among 3


    int num1=s.nextInt();
    int num2=s.nextInt();
    int num3=s.nextInt();




    if(num1>num2 && num1>num3){
        System.out.println("Num1 is greatest:"+num1);
    }
    else if(num2>num1 && num2>num3){
        System.out.println("Num2 is greatest:"+num2);
    } else if(num3>num2 && num3>num1){
        System.out.println("Num3 is greatest:"+num3);
    }else{
        System.out.println("no one is greatest");
    }


    s.close();

}
}
