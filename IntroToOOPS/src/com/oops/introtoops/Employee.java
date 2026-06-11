package com.oops.introtoops;
public class Employee {


    private String name;
    private double salary;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }


    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public static void main(String[] args) {
        
        Employee obj1 = new Employee();
        obj1.setName("Raj");
        obj1.setSalary(10000);


        Employee obj2 = new Employee();
        obj2.setName("Rahul");
        obj2.setSalary(20000);

        System.out.println( obj1.getName()+" "+obj1.getSalary());
        System.out.println( obj2.getName()+" "+obj2.getSalary());


    }

}
