package com.dd.game;

import com.dd.cases.Cases;
import com.dd.heros.*;
import com.dd.attack.*;
import com.dd.potion.Potion;

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

//    public void setWeapon(String weapon, String type){
//        Cases attack = null;
//        switch (type) {
//            case "1":
//                switch (weapon) {
//                    case "1":
//                        attack = new KitchenKnife("kitchen knife", 5);
//                        break;
//                    case "2":
//                        attack = new BaseballBat("baseball bat", 3);
//                        break;
//                }
//                break;
//            case "2":
//                switch (weapon) {
//                    case "1":
//                        attack = new ChainSaw("chain saw", 7);
//                        break;
//                    case "2":
//                        attack = new Axe("axe", 2);
//                        break;
//                }
//                break;
//        }
//        // this.hero.setWeapon(attack);
//        System.out.println(this.hero.getWeapon());
//    }

    public void creatBoard(){
        this.board.creatBoardGame();
    }
    public void setPosition(int dice){
        this.board.setNewPosition(dice);
    }
    public int getPosition(){
        return this.board.getPosition();
    }

    public int launchDice(){
        this.dice.launchDice();
        return this.dice.getDice();
    }

    public String infoCase(){
        Object inCell = this.board.wathsInsideCell();
        if ( inCell instanceof Cases) {
            System.out.println("\nTu as trouvé un.e : ");
            System.out.println("~~ "+((Cases) inCell).getName()+" ~~");
            System.out.println("Ta puissane d'attaque : ");
            System.out.println("~~ augmente de +"+((Cases) inCell).getDamages()+" ~~");
            return "Weapon";
        }
        if ( inCell instanceof Hero) {
            System.out.println("\nTu es tombé sur un.e : ");
            System.out.println("~~ "+((Hero) inCell).getName()+" ~~");
            System.out.println("Sa puissane d'attaque : ");
            System.out.println("~~ est de "+((Hero) inCell).getDamages()+" ~~");
            return "Hero";
        }
        if ( inCell instanceof Potion) {
            System.out.println("\nTu as trouvé sur une : ");
            System.out.println("~~ "+((Potion) inCell).getName()+" ~~");
            System.out.println("Elle te soigne : ");
            System.out.println("~~ "+((Potion) inCell).getDamages()+" points de vie ~~");
            return "Potion";
        }
        return "null";
    }

    public void equipWeapoun(){
        if ( this.hero.getWeapon() == null){
            hero.setWeapon(board.wathsInsideCell());
            System.out.println("TESTEUUUUUUU : "+ hero.getWeapon());
        } else {

        }
    }

    public void fight(){

    }

    public void heal(){

    }
}
