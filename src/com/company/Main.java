package com.company;

public class Main {

    public static void main(String[] args) {


        Journal p1 = new Journal("DVD");
        p1.use();
        p1.store();
        p1.borrowItem();
        p1.read();
    }
}
