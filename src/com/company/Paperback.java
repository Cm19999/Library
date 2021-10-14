package com.company;

import java.util.ArrayList;

public class Paperback extends Book implements Borrow{

    private String objectType = "Paperback";

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

    public String returnItem(LibraryArtifact book) {
        System.out.println(this.getName()+this.getISBN());
        return (objectType+" Name: \""+this.getName()+"\""+" ISBN: " +this.getISBN());
    }



}
