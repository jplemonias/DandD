package com.dd.heros;

import com.dd.attack.*;
import com.dd.cases.*;

public abstract class Hero extends com.dd.cases.Cases {
    private String name;
    private int hp;
    private int damages;

    private Cases attack;

    public Hero(){
        this("Default", 5, 10, new KitchenKnife());
    }

    public Hero(String name, int hp, int damages, Weapon weapon){
        this.name = name;
        this.hp = hp;
        this.damages = damages;
        this.attack = weapon;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public void setWeapon(Cases weapon){
        this.attack = weapon;
    }

    public Cases getWeapon(){
        return this.attack;
    }

    public String getName(){
        return this.name;
    }

    public Integer getHp(){
        return this.hp;
    }

    public Integer getDamages(){
        return this.damages;
    }

    public String getPerso(){
        String rtn = "~~~~~~~~~~ Ton perso ~~~~~~~~~\n";
        rtn += "Name : " + this.name + "\nHealth points : " + this.hp + "\nDamages : " + this.damages/* + " " + this.attack*/;
        return rtn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

//    public String getWeapon(){
//        return "ton arme est :\n"+this.attack.getWeaponType()+" (dmg +"+this.attack.getDamages()+")";
//    }

    public String getPersoStuffed(){
        String rtn = "~~~~~~~~~~ Ton perso ~~~~~~~~~\n";
        rtn += "Name : " + this.name + "\nHealth points : " + this.hp + "\nDamages : " + (this.damages+this.attack.getDamages())+"\n(dmg +"+this.attack.getDamages()+" "+this.attack.getName()+")";
        return rtn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}