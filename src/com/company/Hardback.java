package com.company;

public class Hardback extends Book{

    private String objectType = "Hardback";
    Hardback(String name,String Author,String ISBN){
        super(name,Author,ISBN);
    };


    @Override
    public String toString() {
        return "Hardback{" +
                " Name= "+this.getName()+'\''+
                " Author= "+this.getAuthor()+'\''+
                " ISBN='" + this.getISBN() + '\'' +
                '}';
    }
    public String store(){ return "Put this with the hardback books";}


    public String borrowItem()  {
        return "You have borrowed a hardback book";

    }
    public Hardback returnItem() {
        return (this);
    }

}
