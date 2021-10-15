package com.company;

public class Dissertation extends Document implements Borrow{

    private String objectType = "Dissertation";
        Dissertation(String name,String Author){
            super(name,Author);
        }

    @Override
    public String toString() {
        return "Dissertation{" +
                " Name= "+this.getName()+'\''+
                " Author= "+this.getAuthor()+'\''+
                '}';
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

        @Override
        public LibraryArtifact returnItem() {
            return (this);
    }
}
