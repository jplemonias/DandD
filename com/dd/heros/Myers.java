package com.dd.heros;
// import com.dd.attack.Weapon;

public class Myers extends Hero {

    public Myers(){
        super("Default", 5, 5);
    };

    public Myers(String name){
        super(name, 5, 6);
    };

    public Myers(String name, int hp, int damages){
        super(name, hp, damages);
    };
}
