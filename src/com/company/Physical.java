package com.company;

public abstract class Physical extends LibraryArtifact implements Borrow{


    public Physical(String name) {
        super(name);
    }

    public abstract void consume();


    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }
}
