package com.dd.game;
import com.dd.heros.*;

import java.util.Random;

public class Game {
    String player;
    String perso;
    Hero hero;

    public Game(){
        this.player = "";
        this.perso = "";
        this.hero = null;
    }

    public String setNewUserName(String name) {
        this.player = name;
        return this.player;
    }

    public Hero setNewHeroName(String name) {
        this.hero.setName(name);
        return this.hero;
    }

    public String getUserName() {
        return this.player;
    }
    public String getNewUserperso(String perso) {
        this.perso = perso;
        return this.perso;
    }

    public String getHero(){
        return  this.hero.getPerso();
    }

    public void creatPerso(String userPseudo, String typePerso) {
        Random random1 = new Random();
        int nb1 = 5+random1.nextInt(15-5);
        Random random2 = new Random();
        int nb2 = 3+random2.nextInt(6-3);
        Random random3 = new Random();
        int nb3 = 8+random3.nextInt(15-8);

        if ( typePerso.equals("1") ) {
            this.hero = new Warrior(userPseudo, nb1, nb1);
        } else {
            this.hero = new Wizzard(userPseudo, nb2, nb3);
        }
    }

    public void startGame () {
        BoardGame board = new BoardGame();
        board.creatBoardGame();
    }
}
