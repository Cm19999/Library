package com.company;

public class Audiobook extends Digital{

    Audiobook(String name){
        super(name);
    }

    public void use(){
        System.out.println("Wow that sounds very interesting!");
    }
}
