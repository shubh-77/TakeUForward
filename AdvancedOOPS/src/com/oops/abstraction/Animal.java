package com.oops.abstraction;

abstract class Animal{
    protected String name;
    public abstract void makeSound();

    public Animal(String name){
        this.name=name;
    }
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("The dog "+super.name+" says : Woof!");
    }

}
class Cat extends Animal{

    public Cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("The cat "+super.name+" says : Meow!");
    }

}