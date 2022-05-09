package com.dd.heros;
// import com.dd.attack.Spell;

public class Voorhees extends Hero {

    public Voorhees(){
        super("Default", 5, 5);
    };

    public Voorhees(String name){
        super(name, 3, 8);
    };

    public Voorhees(String name, int hp, int damages){
        super(name, hp, damages);
    };
}