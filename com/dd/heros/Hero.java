package com.dd.heros;

import com.dd.attack.*;
import com.dd.cases.Cases;

public abstract class Hero extends Cases {
    private String name;
    private int hp;
    private int damages;

    private Weapon attack;

    public Hero(){
        this("Default", 5, 10);
        this.attack = new KitchenKnife();
    }

    public Hero(String name, int hp, int damages){
        this.name = name;
        this.hp = hp;
        this.damages = damages;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public void setWeapon(Weapon weapon){
        this.attack = weapon;
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

    public String getWeapon(){
        return "ton arme est :\n"+this.attack.getWeaponType()+" (dmg +"+this.attack.getDamages()+")";
    }

    public String getPersoStuffed(){
        String rtn = "~~~~~~~~~~ Ton perso ~~~~~~~~~\n";
        rtn += "Name : " + this.name + "\nHealth points : " + this.hp + "\nDamages : " + (this.damages+this.attack.getDamages())+"\n(dmg +"+this.attack.getDamages()+" "+this.attack.getName()+")";
        return rtn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}