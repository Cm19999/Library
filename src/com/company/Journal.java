package com.company;

public class Journal extends Document{

    Journal(String name){
        super(name);
    }

    public void store(){
            System.out.println("Store this with the other journals");
        }

    

    public void read(){
        System.out.println("What an informative journal");
    }

}
