package com.company;

public class Skeleton extends Boss {
    private int arrow;

    public Skeleton(int health, int damage, Weapon weapon, int arrow) {
        super(health,damage, weapon);
        this.setArrow(arrow);
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    public String printInfo() {
        return super.printInfo() + " arrow:" + getArrow();
    }
}