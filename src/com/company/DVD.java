package com.company;

public class DVD extends Optical{


    DVD(String name){
        super(name);
    }

    public void use(){
        System.out.println("The picture quality could definitely be better");
    }

    public void store(){
        System.out.println("You put this with the other DVDs");
    }


}
