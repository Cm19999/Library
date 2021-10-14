package com.company;

public abstract class Computer extends Physical{

    Computer(String name){
        super(name);
    }


    public void use(){
        System.out.println("The internet is cool");
    }
}
