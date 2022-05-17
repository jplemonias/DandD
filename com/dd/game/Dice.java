package com.dd.game;

import java.util.Random;
/**
 * <b>dice action</b>
 */
public class Dice {
    private int dice;
    public Dice(){
        this.dice = 0;
    }
    /**
    * Set the value of the dice roll.
    * Retrieves the result of the dice roll in param and set this to dice attributs.
    * @param dice the value of the dice roll.
    */
    public void setDice(int dice){
        this.dice = dice;
    }
    /**
    * Get the value of the dice.
    * @return the value of the dice.
    */
    public int getDice(){
        return this.dice;
    }
    /**
    * random from 1 to 6.
    * Creates a random and attribute new dice value.
    * @see #setDice(int)
    */
    public void launchDice(){
        Random random = new Random();
        int result = 1+random.nextInt(7 - 1);
        setDice(result);
    }
}
