package com.oops.inheritance;



class Employee{
    private String name;
    private int id;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
}


class Manager extends Employee{
    private int teamSize;

    public Manager(String name,int id,int teamSize){
        super(name,id);
        this.teamSize=teamSize;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : "+teamSize);
    }
}



class Engineer extends Employee{
    private String specialization;

    public Engineer(String name,int id,String specialization){
        super(name,id);
        this.specialization=specialization;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization : "+specialization);
    }


    public static void main(String[] args) {


        /*
        
        Manager Details
        Name : Jax
        Id : 101
        Team Size : 8

        Engineer Details
        Name : William
        Id : 202
        Specialization : Backend Developer
        
        
        */
    
        String M_name = "John Doe";
        String E_name = "Jane Smith";
        String E_specialization = "Software Engineering";
        int M_id = 1;
        int E_id = 2;
        int M_teamSize = 10;

        // Create Manager instance
        Manager manager = new Manager(M_name, M_id, M_teamSize);
        System.out.println("Manager Details");
        manager.displayDetails();

        // Create Engineer instance
        Engineer engineer = new Engineer(E_name, E_id, E_specialization);
        System.out.println("\nEngineer Details");
        engineer.displayDetails();
    }
}
