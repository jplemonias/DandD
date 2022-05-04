package com.dd.heros;
import com.dd.attack.Weapon;

public class Warrior {
    private String name;
    private int hp;
    private int damages;
    private String attack;
    public Warrior(){
        Weapon attack = new Weapon();
        this.name = "Toto";
        this.hp = 5;
        this.damages = 10;
        this.attack = attack.getName();
    }
    public Warrior(String name, int hp, int damages){
        Weapon attack = new Weapon();
        this.name = name;
        this.hp = hp;
        this.damages = damages;
        this.attack = attack.getName();
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
        return "Mon perso : " + this.name + " " + this.hp + " " + this.damages + " " + this.attack;
    }
}
