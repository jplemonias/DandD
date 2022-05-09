package com.dd.heros;
import com.dd.attack.Spell;

public class Wizzard extends Hero {
    private String name;
    private int hp;
    private int damages;
    private String attack;
    
//    public void Hero(String name, int hp, int damages){
//        creatWizzard(name, hp, damages);
//    };

    public Wizzard(String name, int hp, int damages){
        Spell attack = new Spell();
        this.name = name;
        this.hp = hp;
        this.damages = damages;
        this.attack = attack.getName();
    };

    public String getPerso(){
        return "Mon perso : " + this.name + " " + this.hp + " " + this.damages + " " + this.attack;
    };
}
