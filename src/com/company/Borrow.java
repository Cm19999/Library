package com.company;

public interface Borrow {

    void borrowItem();

    void returnItem() throws ClassNotFoundException, InstantiationException, IllegalAccessException;
}
