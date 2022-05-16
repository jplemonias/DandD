package com.dd.enemies;

public class KawaiiCat extends Enemies {

    public KawaiiCat(){
        super("KawaiiCat", 9, 2);
    };

    public KawaiiCat(String name){
        super(name, 9, 2);
    };

    public KawaiiCat(String name, int hp, int damages){
        super(name, hp, damages);
    };
}
