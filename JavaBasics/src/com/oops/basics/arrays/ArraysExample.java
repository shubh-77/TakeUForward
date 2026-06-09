package com.oops.basics.arrays;

public class ArraysExample {
public static void main(String[] args) {
    

    int [] arr=new int[5];


    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
    System.out.println(arr[4]);
   // System.out.println(arr[5]); //runtime error


   for(int n:arr){
    System.out.println(n);
   }


   //2-D array

   int [][] multiArr= {{6,5},{5,6},{7,3}};

   System.out.println("Multi Dim Array");
   for(int i =0;i<multiArr.length;i++){
    for(int j=0;j<multiArr[i].length;j++){
        System.out.print(multiArr[i][j]+" ");
    }
    System.out.println();
   }


}
}
