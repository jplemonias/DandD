package com.dd.potion;

import com.dd.cases.Cases;

public abstract class Potion extends Cases {
    private String name;
    private int hp;

    public Potion(){
        this("Default", 1);
    }

    public Potion(String name, int hp){
        this.name = name;
        this.hp =  hp;
    }

    public String getName(){
        return this.name;
    }

    public int getHeal(){
        return this.hp;
    }
}
