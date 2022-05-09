package com.dd.heros;
// import com.dd.attack.Weapon;
// import com.dd.attack.Spell;

public class Hero {
    private String name;
    private int hp;
    private int damages;
    // private String attack;

    public Hero(){
        this.name = "Default";
        this.hp = 5;
        this.damages = 10;
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
}