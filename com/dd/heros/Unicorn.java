package com.dd.heros;

public class Unicorn extends Hero {

    public Unicorn(){
        super("Unicorn", 15, 4);
    };

    public Unicorn(String name){
        super(name, 15, 4);
    };

    public Unicorn(String name, int hp, int damages){
        super(name, hp, damages);
    };
}
