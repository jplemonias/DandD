package com.dd.attack;

public class Weapon {
    private String name;
    private Integer damages;

    public Weapon(){
        this.name = "Default";
        this.damages =  1;
    }

    public Weapon(String weapon, Integer damages ){
        this.name = weapon;
        this.damages = damages;
    }

    public String getName(){
        return this.name;
    }

    public Integer getDamages(){
        return this.damages;
    }

    public String getWeaponType(){
        return this.name;
    }
}
