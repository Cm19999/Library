package com.company;

public abstract class Physical extends LibraryArtifact{


    public abstract void consume();

    public abstract void store(){
        System.out.println("Put this with the books at "+ISBN);
    }
}
