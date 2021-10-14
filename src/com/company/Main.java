package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> totalLibraryCollection = new ArrayList<>();


        Paperback p1 = new Paperback("DVD","1");
        p1.use();
        p1.store();
        totalLibraryCollection.add(p1.returnItem(p1));
        p1.read();
        System.out.println(totalLibraryCollection);




        Paperback p2 = new Paperback("yep","2");
        totalLibraryCollection.add(p2.returnItem(p2));
        System.out.println(totalLibraryCollection);

    }
}
