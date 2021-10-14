package com.company;

public class Hardback extends Book{


    Hardback(String name,String ISBN){
        super(name,ISBN);
    };

    public void store(){ System.out.println("Put this with the hardback books");}

}
