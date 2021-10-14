package com.company;

public class Laptop extends Computer implements Borrow{


    Laptop(String name){
        super(name);
    }

    public void store(){
        System.out.println("Put this back with the laptops");
    }

    public void borrowItem(){
        System.out.println("You have borrowed a laptop");
    }
}

