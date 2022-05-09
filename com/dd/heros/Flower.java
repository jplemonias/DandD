package com.dd.heros;

public class Flower extends Hero {

    public Flower(){
        super("Flower", 6, 1);
    };

    public Flower(String name){ super(name, 6, 1); };

    public Flower(String name, int hp, int damages){ super(name, hp, damages); };
}
