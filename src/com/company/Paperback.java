package com.company;

import java.util.ArrayList;

public class Paperback extends Book implements Borrow{

    private String objectType = "Paperback";


    Paperback(String name,String Author,String ISBN){
        super(name,Author,ISBN);
    }



    public void store(){ System.out.println("Put this with the paperback books");}


    public void borrowItem()  {

    }
    public String returnItem(LibraryArtifact book) {
        return (objectType+" Name: \""+this.getName()+"\" "+"Author: "+this.getAuthor()+" ISBN: " +this.getISBN());
    }



}
