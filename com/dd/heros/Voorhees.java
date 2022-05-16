package com.dd.heros;
// import com.dd.Case.attack.Spell;

public class Voorhees extends Hero {

    public Voorhees(){
        super("Default", 5, 5, null);
    };

    /**
     * @param name
     */
    public Voorhees(String name){
        super(name, 3, 8, null);
    };

    /**
     * @param name
     * @param hp
     * @param damages
     */
    public Voorhees(String name, int hp, int damages){
        super(name, hp, damages, null);
    };
}