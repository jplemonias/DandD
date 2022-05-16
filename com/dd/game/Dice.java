package com.dd.game;

import java.util.Random;

public class Dice {
    private int dice;

    public Dice(){
        this.dice = 0;
    }
    /**
    * Récupère le résultat du lancé de dé.
    * null / Weapon / Hero / Potion
    * @param dice résultat du lancé de dé.
    */
    public void setDice(int dice){
        this.dice = dice;
    }
    /**
    * Récupère la valeur du dé.
    * @return La valeur du dé.
    */
    public int getDice(){
        return this.dice;
    }
    /**
    * Attribu 1...6 au lancé de dé.
    * Créé un random de 1 à 6 qui sera la nouvelle valeur du dé.
    * @see #setDice(int)
    */
    public void launchDice(){
        Random random = new Random();
        int result = 1+random.nextInt(7 - 1);
        setDice(result);
    }
}
