package com.company;

import java.util.ArrayList;

public class Paperback extends Book implements Borrow{



    Paperback(String name,String ISBN){
        super(name,ISBN);
    }


    Paperback(String name, ArrayList<LibraryArtifact> libraryCollection) {
        super(name);
        this.libraryCollection=this.getLibraryCollection();
    }



    public void store(){ System.out.println("Put this with the paperback books");}

    public void borrowItem()  {

    }

    public void returnItem(LibraryArtifact book) {
        //System.out.println(this.getClass());
        System.out.println(libraryCollection);
        libraryCollection.add(book);
        System.out.println(libraryCollection);

    }



}
