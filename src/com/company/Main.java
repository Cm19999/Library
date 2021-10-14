package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryArtifact> libraryCollection = new ArrayList<>();
        

        Paperback p1 = new Paperback("DVD","1");
        p1.use();
        p1.store();
        p1.returnItem(p1);
        p1.read();

        Paperback p2 = new Paperback("yep","2");
        p2.returnItem(p2);

    }
}
