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



    public String use(){
        return "What an informative journal";
    }


    public String borrowItem(){
        return "You have borrowed a journal";
    }


    public LibraryArtifact returnItem() {
        return (this);
    }
}
