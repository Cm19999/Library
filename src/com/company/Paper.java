package com.company;

public abstract class Paper extends Physical{

    private String[] Author;
    private int pages;

    public void consume(){
        System.out.println("Flicks through pages...");
    }

}
