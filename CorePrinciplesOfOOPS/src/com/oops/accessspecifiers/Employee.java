package com.oops.accessspecifiers;

class Employee{


    public String name;
    protected int employeeId;
    private double salary;

    public Employee(String name,int employeeId,double salary){
        this.name=name;
        this.employeeId=employeeId;
        setSalary(salary);
    }
    public void setSalary(double salary){
        if(salary<0){
            System.out.println("Invalid salary");
            this.salary=0;
        }else{
            this.salary=salary;
        }
    }


    public double getSalary(){
        return this.salary;
    }


    public void displayEmployeeDetails(){
        System.out.printf("Name : %s\n",this.name);
        System.out.printf("Employee Id : %d\n",this.employeeId);
        System.out.printf("Salary : %.2f",this.salary);

    }


