package com.company;

public class Scorpion extends Character {

    public Scorpion() {
        super(new FireBehavior());
    }

    @Override
    public void info() {
        System.out.println("Scorpion is the owner of hell-fire");
    }
}

