package com.company;

public abstract class Book extends Paper implements Borrow{

    private String ISBN;






    public void read(){
        System.out.println("Wow this is a good book");
    }




    public String[] getAuthor() {
        return Author;
    }

    public void setAuthor(String[] author) {
        Author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
