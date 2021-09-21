package com.company;

public class Subzero extends Character {

    public Subzero() {
        super(new IceBehavior());
    }

    @Override
    public void info() {
        System.out.println("Subzero is one of the best fighters in Mortal Combat");
    }
}
