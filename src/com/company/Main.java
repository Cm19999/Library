package com.company;

public class Main {

    public static void main(String[] args) {

        Paperback p1 = new Paperback("book","1");
        p1.consume();
        p1.read();
        p1.store();
        p1.borrowItem();
    }
}
