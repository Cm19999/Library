package com.company;

public abstract class LibraryArtifact {

    private String name;
    private boolean borrowable;

    public LibraryArtifact(String name,boolean borrowable){};


    public LibraryArtifact(String name){this.name = name};


    public abstract void store();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }
}
