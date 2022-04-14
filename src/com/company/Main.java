package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(100, 20, new Weapon(TypeOf.FIREARMS, NameOfThe.BAZOOKA));
        System.out.println("boss:" + boss.printInfo());

        Skeleton skeleton1 = new Skeleton(100, 15, new Weapon(TypeOf.THROWING, NameOfThe.GRENADE), 13);
        System.out.println("skeleton:1" + skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton(40, 20, new Weapon(TypeOf.MAGICAL, NameOfThe.MAGIC_STAFF), 11);
        System.out.println("skeleton2:" + skeleton2.printInfo());

    }
}
