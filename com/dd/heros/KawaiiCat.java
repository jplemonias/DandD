package com.dd.heros;

public class KawaiiCat extends Hero {

    public KawaiiCat(){
        super("KawaiiCat", 9, 2, null);
    };

    public KawaiiCat(String name){
        super(name, 9, 2, null);
    };

    public KawaiiCat(String name, int hp, int damages){
        super(name, hp, damages, null);
    };
}
