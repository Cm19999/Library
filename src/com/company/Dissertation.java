package com.company;

public class Dissertation extends Document implements Borrow{


        Dissertation(String name){
            super(name);
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

        public void returnItem(){};
}
