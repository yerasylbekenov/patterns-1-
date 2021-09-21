package com.company;

public abstract class Character {
    private SpecialBehavior weaponBehavior;

    public abstract void info();

    public Character(SpecialBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }


    public void performWeapon() {
        weaponBehavior.useSpecialBehavior();
    }

    public void setWeaponBehavior(SpecialBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
