package com.company;

public class Journal extends Document implements Borrow{

    private String objectType = "Journal";
    Journal(String name, String Author){
        super(name,Author);
    }

    public void store(){
            System.out.println("Store this with the other journals");
        }



    public void read(){
        System.out.println("What an informative journal");
    }


    public void borrowItem(){
        System.out.println("You have borrowed a journal");
    }


    public String returnItem(LibraryArtifact book) {
        return (objectType+" Name: \""+this.getName()+"\""+" ISBN: " +this.getAuthor());
    }
}
