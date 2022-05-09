package com.dd.game;
import com.dd.heros.Wizzard;
import com.dd.heros.Warrior;
import com.dd.heros.Hero;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner sc;
    String player;
    String perso;
    Hero hero;

    public Game(){
        this.sc = new Scanner(System.in);
        this.player = "";
        this.perso = "";
        this.hero = null;
    }
        // System.out.println("Username is : " + userName);

        // System.out.println("Vous voullez play ? 'Wawa' ou 'Mago'");
        // String userperso = sc.nextLine();
        // while ( !(userperso.equals("Wawa") || userperso.equals("Mago")) ) {
        //     System.out.println("Choisissez : 'Wawa' ou 'Mago'");
        //     userperso = sc.nextLine();
        // }
        // System.out.println("userperso is : " + userperso);
        // if ( userperso == "Wawa") {
        //     Warrior perso = new Warrior(userperso, nb1, nb1);
        //     System.out.println(perso.getperso());
        // } else {
        //     Magician perso = new Magician(userperso, nb2, nb3);
        //     System.out.println(perso.getperso());
        // }
        // System.out.println(perso.getperso());
        // Magician magician = new Magician("Mago", nb2, nb3);
        // Warrior warrior = new Warrior("Wawa", nb1, nb1);
        // System.out.println(magician.getperso());
        // System.out.println("Magician : " + magician.getName() +" / "+ magician.getHp() +" / "+ magician.getDamages());
        // System.out.println(warrior.getperso());
        // System.out.println("Warrior : " + warrior.getName() +" / "+ warrior.getHp() +" / "+ warrior.getDamages());

    public String getNewUserName(String name) {
        this.player = name;
        return this.player;
    }

    public String getUserName() {
        return this.player;
    }
    public String getNewUserperso(String perso) {
        this.perso = perso;
        return this.perso;
    }
    public Object getperso() {
        return this.perso;
    }

    public Hero creatPerso(String userPseudo, String typePerso) {
        Random random1 = new Random();
        int nb1 = 5+random1.nextInt(15-5);
        Random random2 = new Random();
        int nb2 = 3+random2.nextInt(6-3);
        Random random3 = new Random();
        int nb3 = 8+random3.nextInt(15-8);

        if ( typePerso == "Wawa") {
            return new Warrior(userPseudo, nb1, nb1);
        } else {
            return new Wizzard(userPseudo, nb2, nb3);
        }
    }
}
