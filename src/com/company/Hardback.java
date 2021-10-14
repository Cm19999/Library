package com.company;

public class Hardback extends Book{

    private String objectType = "Hardback";
    Hardback(String name,String Author,String ISBN){
        super(name,Author,ISBN);
    };

    public void store(){ System.out.println("Put this with the hardback books");}


    public void borrowItem()  {

    }
    public String returnItem(LibraryArtifact book) {
        return (objectType+" Name: \""+this.getName()+"\""+" ISBN: " +this.getISBN());
    }

}
