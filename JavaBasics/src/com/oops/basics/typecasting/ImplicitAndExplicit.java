package com.oops.basics.typecasting;

public class ImplicitAndExplicit {

    public static void main(String[] args) {
        

      int x =10;
      
      double y =x;

      System.out.println(y);//implicit casting




      int x1 = (int)y; //explict casting since there is loss


      System.out.println(x1);
    }
}
