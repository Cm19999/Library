package com.company;

public class Dissertation extends Document{


        Dissertation(String name){
            super(name);
        }

        public void read(){
            System.out.println("What an informative dissertation");
        }

        public void store(){
            System.out.println("Store this with the other dissertations");
        }

}
