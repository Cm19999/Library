package com.company;

public abstract class Book extends Paper implements Borrow{

    private String ISBN;

    public Book(String name) {
        super(name);
    }


    public void read(){
        System.out.println("Wow this is a good book");
    }

    public void store(){
        System.out.println("Put this with the books at "+ISBN);
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
