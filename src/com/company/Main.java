package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss=new Boss(350,70);
        boss.weapon.setNameWeapon("AK -");
        boss.weapon.setTypeWeapon("47");
        System.out.println(boss.info());
        Skeleton skeleton= new Skeleton(200,35,25);
        skeleton.weapon.setNameWeapon("Fair");
        skeleton.weapon.setTypeWeapon("Arrow" );
        System.out.println(skeleton.info());
        Skeleton skeleton1=new Skeleton(220,30,30);
        skeleton1.weapon.setNameWeapon("Green");
        skeleton1.weapon.setTypeWeapon("Arrow");
        System.out.println(skeleton1.info());

    }
}
