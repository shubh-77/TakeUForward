package com.oops.polymorphism;


class ShapeCalculator{

    // private int base1;
    // private int base2;
    // private int height;
    // private int length;
    // private int radius;
    // private int width;

    public void area(int radius){

        int area = (int)(3.14 * radius * radius);
        System.out.printf("Area of Circle : %d\n",area);


    }

    public void area(int length, int width){
     
     int area =length*width;
     System.out.printf("Area of Rectangle : %d\n",area);

    }
     public void area(int base1, int base2,int height){
     
     int area = (int)(0.5*(base1+base2)*height);
     System.out.printf("Area of Trapezoid : %d\n",area);

    }



}

