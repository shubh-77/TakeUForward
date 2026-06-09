package com.oops.basics.strings;

public class StringExample1 {
public static void main(String[] args) {
    
    String name = "John";
    String lastName="Doe";
    System.out.println(name.length());

    System.out.println(name.charAt(2));
    System.out.println(name.substring(0,2)); //0 to n-1


    System.out.println(name+" "+lastName);


    //Strings are immutable because everytime you create a string it will create a new object.


    System.out.println("hello".equals("Hello"));

}
}
