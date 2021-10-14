package com.company;

public class Paperback extends Book implements Borrow{


    Paperback(String name,String ISBN){
        super(name,ISBN);
    };


    public void store(){ System.out.println("Put this with the paperback books");}

}
