package com.dd.potion;

import com.dd.cases.Cases;

public abstract class Potion extends Cases {
    private String name;
    private int hp;

    public Potion(){
        this.name = "Default";
        this.hp =  1;
    }

    public Potion(String name, int hp){
        this.name = name;
        this.hp =  hp;
    }

    public String getName(){
        return this.name;
    }

    public Integer getDamages(){
        return this.hp;
    }
}
