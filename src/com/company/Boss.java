package com.company;

public class Boss extends GameEntity{
    Weapon weapon= new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int health, int damage  ) {
        super(health, damage);

    }
    public String info(){
        return getHealth()+ " "+getDamage()+" "+ weapon.getNameWeapon()+" "+ weapon.getTypeWeapon();
    }
}
