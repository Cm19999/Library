package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryArtifact> totalLibraryCollection = new ArrayList<>();


        Hardback p1 = new Hardback("DVD","Dave","1");
        p1.use();
        p1.store();
        totalLibraryCollection.add(p1.returnItem());
        p1.read();
        System.out.println(totalLibraryCollection);




        Paperback p2 = new Paperback("yep","Geoff","2");
        totalLibraryCollection.add(p2.returnItem());
        System.out.println(totalLibraryCollection);

    }
}
