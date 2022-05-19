package com.dd.heros;

import com.dd.attack.*;
import com.dd.inter.Inter;

public abstract class Hero implements Inter {
    private String name;
    private int hp;
    private int damages;

    private Weapon attack;

    public Hero(){
        this("Default");
    }
    public Hero(String name){
        this(name, 5, 10, null);
    }

    public Hero(String name, int hp, int damages, Weapon weapon){
        this.name = name;
        this.hp = hp;
        this.damages = damages;
        this.attack = weapon;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        if (hp > 15) {
            System.out.println("HP au max.");
            this.hp = 15;
        } else {
            this.hp = hp;
        }
    }

    public void setWeapon(Weapon weapon, Hero hero){
        if (hero instanceof Myers) {
            if (weapon instanceof KitchenKnife || weapon instanceof BaseballBat ) {
                this.attack = weapon;
            }
        }
        if (hero instanceof Voorhees) {
            if (weapon instanceof ChainSaw || weapon instanceof Axe ) {
                this.attack = weapon;
            }
        }
    }

    public Weapon getWeapon(){
        return this.attack;
    }

    public int getWeaponDamages(){
        return this.attack.getDamages();
    }

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    @Override
    public int getDamages(){
        if (this.attack == null) {
            return this.damages;
        }
        return this.damages+this.attack.getDamages();
    }

    public String infoPerso(){
        String rtn = "~~~~~~~~~~ Ton perso ~~~~~~~~~\n";
        rtn += "Name : " + this.name + "\nHealth points : " + this.hp + "\nDamages : " + this.damages;
        return rtn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

    //    public String getWeapon(){
    //        return "ton arme est :\n"+this.attack.getWeaponType()+" (dmg +"+this.attack.getDamages()+")";
    //    }

    public String infoPersoStuffed(){
        String rtn = "~~~~~~~~~~ Ton perso ~~~~~~~~~\n";
        rtn += "Name : " + this.name + "\nHealth points : " + this.hp + "\nDamages : "+(this.damages+this.attack.getDamages());
        rtn += "\n(dmg +"+this.attack.getDamages()+" "+this.attack.getName()+")";
        return rtn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}