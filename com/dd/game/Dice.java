package com.dd.game;

import java.util.Random;

public class Dice {
    private int dice;

    public Dice(){
        this.dice = 0;
    }

    public void launchDice(){
        Random random = new Random();
        int result = 1+random.nextInt(7 - 1);
        this.dice = result;
    }

    public Integer getDice(){
        return this.dice;
    }

}
