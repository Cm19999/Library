package com.company;

public class Bluray extends Optical{

    Bluray(String name) {
        super(name);
    }

    public String use(){
        return "Wow that is a really good quality picture";
    }

    public void store(){
        System.out.println("Put this with the other Blurays");
    }




}
