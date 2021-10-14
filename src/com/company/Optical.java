package com.company;

public abstract class Optical extends LibraryArtifact{

    Optical(String name){
        super(name);
    }

    public abstract void store();
}
