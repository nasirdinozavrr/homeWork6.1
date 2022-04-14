package com.company;

public class Weapon {
    private TypeOf gun;
    private NameOfThe name;

    public Weapon(TypeOf gun, NameOfThe name) {
        this.setGun(gun);
        this.setName(name);
    }

    public TypeOf getGun() {
        return gun;
    }

    public void setGun(TypeOf gun) {
        this.gun = gun;
    }

    public NameOfThe getName() {
        return name;
    }

    public void setName(NameOfThe name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Weapon {" +
                " gun='" + getGun() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
