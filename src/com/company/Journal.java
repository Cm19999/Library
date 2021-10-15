package com.company;

public class Journal extends Document implements Borrow{

    private String objectType = "Journal";
    Journal(String name, String Author){
        super(name,Author);
    }


    @Override
    public String toString() {
        return "Journal{" +
                " Name= "+this.getName()+'\''+
                " Author= "+this.getAuthor()+'\''+
                '}';
    }

    public String store(){
            return "Store this with the other journals";
        }



    public void read(){
        System.out.println("What an informative journal");
    }


    public void borrowItem(){
        System.out.println("You have borrowed a journal");
    }


    public LibraryArtifact returnItem() {
        return (this);
    }
}
