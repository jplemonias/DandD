package com.dd.attack;

import com.dd.cases.Cases;
import com.dd.inter.Inter;

public class Weapon extends Cases implements Inter {
    private String name;
    private int damages;

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

    @Override
    public int getDamages(){
        return this.damages;
    }

//    public String getWeaponType(){
//        return this.name;
//    }
}
