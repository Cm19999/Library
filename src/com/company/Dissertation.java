package com.company;

public class Dissertation extends Document implements Borrow{

        private String objectType = "Dissertation";
        Dissertation(String name,String[]Author){
            super(name,Author);
        }

        public void read(){
            System.out.println("What an informative dissertation");
        }

        public void store(){
            System.out.println("Store this with the other dissertations");
        }

        public void borrowItem(){
            System.out.println("You have borrowed a dissertation");
        }

        public String returnItem(LibraryArtifact book) {
            return (objectType+" Name: \""+this.getName()+"\""+" ISBN: " +this.getAuthor());
    }
}
