package com.company;

public abstract class Paper extends Physical{

    private String[] Author;
    private int pages;

    public Paper(String name) {
        super(name);
    }



    public void consume(){
        System.out.println("Flicks through pages...");
    }


    public String[] getAuthor() {
        return Author;
    }

    public void setAuthor(String[] author) {
        Author = author;
    }

    public int getPages() {return pages;}

    public void setPages(int pages) {this.pages = pages;}
}
