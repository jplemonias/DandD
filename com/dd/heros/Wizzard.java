package com.dd.heros;
// import com.dd.attack.Spell;

public class Wizzard extends Hero {

    public Wizzard(){
        super("Default", 5, 5);
    };

    public Wizzard(String name){
        super(name, 3, 8);
    };

    public Wizzard(String name, int hp, int damages){
        super(name, hp, damages);
    };
}