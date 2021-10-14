package com.company;

public abstract class Optical extends LibraryArtifact implements Borrow{

    private int ageMinimum;
    private double length;

    Optical(String name){
        super(name);
    }

    public abstract void store();

    public void borrowItem(){
        System.out.println("You have borrowed a disc");
    }

    public void returnItem(){
        System.out.println("You have returned a disc");
    }

    public int getAgeMinimum() {
        return ageMinimum;
    }

    public void setAgeMinimum(int ageMinimum) {
        this.ageMinimum = ageMinimum;
    }
}
