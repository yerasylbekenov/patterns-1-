package com.company;

public class Main {

    public static void main(String[] args) {
        Character character = new Scorpion();
        character.info();
        character.setWeaponBehavior(new FireBehavior());
        character.performWeapon();
        System.out.println("-------------------------");
        Character character2 = new Subzero();
        character2.info();
        character2.setWeaponBehavior(new IceBehavior());
        character2.performWeapon();
    }
}
