package com.company;

import java.util.ArrayList;

public abstract class Physical extends LibraryArtifact implements Borrow{




    public Physical(String name,ArrayList<LibraryArtifact> libraryCollection) {
        super(name);
        this.libraryCollection=this.getLibraryCollection();
    }

    public Physical(String name) {
        super(name);
    }

    public abstract String use();

    public abstract void borrowItem();

    //public void returnItem(){
     //   libraryCollection.add(LibraryArtifact<this.Physical>)
    //};
}
