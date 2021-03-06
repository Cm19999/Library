package com.company;

import java.util.ArrayList;

public class Paperback extends Book implements Borrow{

    private String objectType = "Paperback";


    public Paperback(String name,String Author,String ISBN){
        super(name,Author,ISBN);
    }


    @Override
    public String toString() {
        return "Paperback{" +
                " Name= "+this.getName()+'\''+
                " Author= "+this.getAuthor()+'\''+
                " ISBN='" + this.getISBN() + '\'' +
                '}';
    }

    public String store(){ return "Put this with the paperback books";}


    public String borrowItem()  {
        return "You have borrowed a paperback";

    }
    public LibraryArtifact returnItem() {
        return (this);
    }



}
