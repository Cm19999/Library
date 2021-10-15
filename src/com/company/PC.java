package com.company;

public class PC extends Computer{

    PC(String name){
        super(name);
    }

    public void borrowItem(){};

    public LibraryArtifact returnItem(){
        return (this);
    }
}
