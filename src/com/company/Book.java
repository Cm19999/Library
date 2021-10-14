package com.company;

public abstract class Book extends Paper implements Borrow{


    private String ISBN;
    private String genre;


    public Book(String name,String ISBN) {
        super(name);
    }


    public void read(){
        System.out.println("Wow this is a good book");
    }

    public abstract void store();


    public String getISBN() {return ISBN;}

    public void setISBN(String ISBN) {this.ISBN = ISBN;}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}
}
