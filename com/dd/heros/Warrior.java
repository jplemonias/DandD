package com.dd.heros;
// import com.dd.attack.Weapon;

public class Warrior extends Hero {

    public Warrior(){
        super("Default", 5, 5);
    };

    public Warrior(String name){
        super(name, 5, 6);
    };

    public Warrior(String name, int hp, int damages){
        super(name, hp, damages);
    };
}
