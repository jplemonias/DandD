package com.dd.enemies;

public class Unicorn extends Enemies {

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
