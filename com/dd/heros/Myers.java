package com.dd.heros;

import com.dd.attack.*;

public class Myers extends Hero {

    public Myers(){
//        this("default");
        super("Default", 5, 5, null );
    };

    public Myers(String name){
        super(name, 5, 6, null);
    };

    public Myers(String name, int hp, int damages){
        super(name, hp, damages, null);
    };
}
