package com.dd.enemies;

import com.dd.cases.Cases;

public class Enemies extends Cases {
    private String name;
    private int hp;
    private int damages;


    public Enemies(){
        this("Default", 5, 10 );
    }

    public Enemies(String name, int hp, int damages){
        this.name = name;
        this.hp = hp;
        this.damages = damages;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public int getDamages(){ return this.damages; }
}
