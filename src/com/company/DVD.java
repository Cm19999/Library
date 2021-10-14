package com.company;

public class DVD extends LibraryArtifact{

    DVD(String name){
        super(name);
    }

    public void use(){
        System.out.println("The picture quality could definitely be better");
    }

    public void store(){
        System.out.println("Put this with the other DVDs");
    }
}
