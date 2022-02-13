package com.company;

public class Skeleton extends Boss{
    private int arrow;

    public Skeleton(int health, int damage, int arrow) {
        super(health, damage);
        this.arrow = arrow ;
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow ) {
        this.arrow = arrow;
    }
    public String info() {
        return super.info() + " "+ arrow;
    }
}
