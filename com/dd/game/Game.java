package com.dd.game;

import com.dd.cases.Cases;
import com.dd.enemies.*;
import com.dd.heros.*;
import com.dd.attack.*;
import com.dd.potion.*;

import java.util.Random;
import java.util.ArrayList;

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
        // this.typePerso = "";
        this.hero = null;
        // this.board = null;
        this.dice = new Dice();
        this.board = new BoardGame();
    }

    public void setNewUserName(String name) {
       this.player = name;
    }

    public String getUserName() { return this.player; }

    public void setNewHeroName(String name) {
        this.hero.setName(name);
    }

    public String getHero(){ return this.hero.getPerso(); }

    public String getTypePerso(){ return this.typePerso; }

    public String getHeroStuffed(){ return this.hero.getPersoStuffed(); }


    public void creatPerso(String userPseudo, String typePerso) {
        Random random = new Random();
        if ( typePerso.equals("1") ) {
            int nb1 = 5+random.nextInt(15-5);
            int nb2 = 5+random.nextInt(15-5);
            // this.typePerso = "1";
            this.hero = new Myers(userPseudo, nb1, nb2);
        } else {
            int nb1 = 3+random.nextInt(6-3);
            int nb2 = 8+random.nextInt(15-8);
            // this.typePerso = "2";
            this.hero = new Voorhees(userPseudo, nb1, nb2);
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
        if ( inCell instanceof Weapon) {
            System.out.println("\nTu as trouvé un.e : ");
            System.out.println("~~ "+((Cases) inCell).getName()+" ~~");
            System.out.println("Ta puissane d'attaque : ");
            System.out.println("~~ augmente de +"+((Weapon) inCell).getDamages()+" ~~");
            return "Weapon";
        }
        if ( inCell instanceof Enemies) {
            System.out.println("\nTu es tombé sur un.e : ");
            System.out.println("~~ "+((Cases) inCell).getName()+" ~~");
            System.out.println("Sa puissane d'attaque : ");
            System.out.println("~~ est de "+((Enemies) inCell).getDamages()+" ~~");
            return "Hero";
        }
        if ( inCell instanceof Potion) {
            System.out.println("\nTu as trouvé sur une : ");
            System.out.println("~~ "+((Cases) inCell).getName()+" ~~");
            System.out.println("Elle te soigne : ");
            System.out.println("~~ "+((Potion) inCell).getHeal()+" points de vie ~~");
            return "Potion";
        }
        return "null";
    }

    public void equipWeapoun(){
        Weapon weapon = this.hero.getWeapon();
        Weapon inCell = (Weapon)board.wathsInsideCell();
        if ( weapon == null){
            System.out.println("GG tu as trouvé ta première arme");
            System.out.println(board.wathsInsideCell().getName());
            this.hero.setWeapon(inCell, this.hero);
            if (this.hero.getWeapon() == null) {
                System.out.println("Hoo tu ne peux pas l'équiper... sry");
            } else  {
                System.out.println("Tu es maintenant équiper d'une nouvelle arme");
            }
        } else {
            if (inCell.getDamages() > this.hero.getWeaponDamages()) {
                this.hero.setWeapon(inCell, this.hero);
            } else {
                System.out.println("Tu es déjà équipé d'une arme plus puissante");
            }
        }
    }

    public void heal(){
        // System.out.println(this.typePerso);
        Potion heal = (Potion)board.wathsInsideCell();
        this.hero.setHp(this.hero.getHp()+heal.getHeal());
    }

    public void progressFight(){
        boolean firstPlayer = whoIsFirstPlayer();
        ArrayList<Integer> fighters = new ArrayList<Integer>();
        System.out.println("FIGHTTTTTTTTT");
        fighters = firstRoundOfPlay(firstPlayer, fighters);
        fight(fighters);
    }

    private ArrayList<Integer> firstRoundOfPlay(boolean firstPlayer, ArrayList<Integer> fighters) {
        if (firstPlayer) {
            fighters.add(1);
            fighters.add(0);
        } else {
            fighters.add(0);
            fighters.add(1);
        }
        return fighters;
    }

    private ArrayList<Integer> reversRound(ArrayList<Integer> fighters) {
        if (fighters.get(0) == 1) {
            fighters.set(1, 1);
            fighters.set(0, 0);
        } else {
            fighters.set(0, 1);
            fighters.set(1, 0);
        }
        return fighters;
    }

    private void fight(ArrayList<Integer> fighters) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int player = fighters.indexOf(1);
        Enemies ennemi = (Enemies)board.wathsInsideCell();
        
        if (player == 0) {
            
            // palyer fight
            System.out.println("Tu attaques l'énnemi,");
            if (ennemi.getHp()-this.hero.getDamages() < 1) {
                ennemi.setHp(0);
                System.out.println("il lui reste zero HP tu Win!!!");
            } else {
                ennemi.setHp(ennemi.getHp()-this.hero.getDamages());
                System.out.println("il lui reste "+ennemi.getHp()+" HP.");
                reversRound(fighters);
                fight(fighters);
            }
            // System.out.println("Tour player");
        } else {
            // palyer fight
            System.out.println("L'énnemi t'attaque,");
            if (this.hero.getHp() - ennemi.getDamages() < 1) {
                this.hero.setHp(0);
                System.out.println("Tu es Mooooooort");
                //gameOver();
                // GAME OVER
            } else {
                this.hero.setHp(this.hero.getHp()-ennemi.getDamages());
                System.out.println("il te reste "+this.hero.getHp()+" HP.");
                reversRound(fighters);
                fight(fighters);
            }
            // System.out.println("Tour ennemi");
        }
    }

    public boolean whoIsFirstPlayer() {
        Random random = new Random();
        if (random.nextInt(2) == 1) {
            return true;
        }
        return false;
    }

    public boolean gameOver() {
        if (this.hero.getHp() < 1) {
            System.out.println("GAME OVER");
            return true;
        }
        return false;
    }
}
