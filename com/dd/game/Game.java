package com.dd.game;

import com.dd.heros.*;
import com.dd.attack.*;
import com.dd.menu.Menu;

import java.util.Random;

public class Game {
    String player;
    String typePerso;
    Hero hero;
    // BoardGame board;
    // Game game = new Game();
    Dice dice;
    BoardGame board;

    public Game(){
        this.player = "";
        this.typePerso = "";
        this.hero = null;
        // this.board = null;
        this.dice = new Dice();
        this.board = new BoardGame();
    }

    public void setNewUserName(String name) {
        this.player = name;
    }

    public void setNewHeroName(String name) {
        this.hero.setName(name);
    }

    public String getUserName() {
        return this.player;
    }

    public String getHero(){
        return this.hero.getPerso();
    }

    public String getTypePerso(){ return this.typePerso; }

    public String getHeroStuffed(){ return this.hero.getPersoStuffed(); }


    public void creatPerso(String userPseudo, String typePerso) {

        Random random1 = new Random();
        int nb1 = 5+random1.nextInt(15-5);
        Random random2 = new Random();
        int nb2 = 3+random2.nextInt(6-3);
        Random random3 = new Random();
        int nb3 = 8+random3.nextInt(15-8);


        if ( typePerso.equals("1") ) {
            this.typePerso = "1";
            this.hero = new Myers(userPseudo, nb1, nb1);
        } else {
            this.typePerso = "2";
            this.hero = new Voorhees(userPseudo, nb2, nb3);
        }
    }

    public void setWeapon(String weapon, String type){
        Weapon attack = null;
        switch (type) {
            case "1":
                switch (weapon) {
                    case "1":
                        attack = new KitchenKnife("kitchen knife", 5);
                        break;
                    case "2":
                        attack = new BaseballBat("baseball bat", 3);
                        break;
                }
                break;
            case "2":
                switch (weapon) {
                    case "1":
                        attack = new ChainSaw("chain saw", 7);
                        break;
                    case "2":
                        attack = new Axe("axe", 2);
                        break;
                }
                break;
        }
        // this.hero.setWeapon(attack);
        System.out.println(this.hero.getWeapon());
    }

    public void creatBoard(){
        this.board.creatBoardGame();
    }
    public int getPosition(){
        return this.board.getPosition();
    }

    public int launchDice(){
        this.dice.launchDice();
        return this.dice.getDice();
    }
}
