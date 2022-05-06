package com.dd.heros;
import com.dd.attack.Weapon;

public class Warrior extends Hero {
    private String name;
    private int hp;
    private int damages;
    private String attack;

    public void Hero(String name, int hp, int damages){
        creatWarrior(name, hp, damages);
    };

    public String getPerso(){
        return "Mon perso : " + this.name + " " + this.hp + " " + this.damages + " " + this.attack;
    }

    public void creatWarrior(String name, int hp, int damages){
        Weapon attack = new Weapon();
        this.name = name;
        this.hp = hp;
        this.damages = damages;
        this.attack = attack.getName();
    };
}
