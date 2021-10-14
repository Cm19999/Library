package com.company;

public abstract class LibraryArtifact {

    private String name;

    public LibraryArtifact(String name){this.name = name;}


    public abstract void store();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
