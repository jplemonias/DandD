package com.dd.game;
import com.dd.heros.Magician;
import com.dd.heros.Warrior;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner sc;
    String Player;
    String Perso;
    public Game(){
        this.sc = new Scanner(System.in);
        this.Player = "";
        this.Perso = "";
    }
        // System.out.println("Username is : " + userName);

        // System.out.println("Vous voullez play ? 'Wawa' ou 'Mago'");
        // String userPerso = sc.nextLine();
        // while ( !(userPerso.equals("Wawa") || userPerso.equals("Mago")) ) {
        //     System.out.println("Choisissez : 'Wawa' ou 'Mago'");
        //     userPerso = sc.nextLine();
        // }
        // System.out.println("userPerso is : " + userPerso);
        // if ( userPerso == "Wawa") {
        //     Warrior perso = new Warrior(userPerso, nb1, nb1);
        //     System.out.println(perso.getPerso());
        // } else {
        //     Magician perso = new Magician(userPerso, nb2, nb3);
        //     System.out.println(perso.getPerso());
        // }
        // System.out.println(perso.getPerso());
        // Magician magician = new Magician("Mago", nb2, nb3);
        // Warrior warrior = new Warrior("Wawa", nb1, nb1);
        // System.out.println(magician.getPerso());
        // System.out.println("Magician : " + magician.getName() +" / "+ magician.getHp() +" / "+ magician.getDamages());
        // System.out.println(warrior.getPerso());
        // System.out.println("Warrior : " + warrior.getName() +" / "+ warrior.getHp() +" / "+ warrior.getDamages());

    public String getNewUserName(String name) {
        this.Player = name;
        return this.Player;
    }

    public String getUserName() {
        return this.Player;
    }
    public String getNewUserPerso(String perso) {
        this.Perso = perso;
        return this.Perso;
    }
    public Object getPerso() {
        return this.Perso;
    }

    public Object creatPerso(String userPseudo, String typePerso) {
        Random random1 = new Random();
        int nb1 = 5+random1.nextInt(15-5);
        Random random2 = new Random();
        int nb2 = 3+random2.nextInt(6-3);
        Random random3 = new Random();
        int nb3 = 8+random3.nextInt(15-8);

        if ( typePerso == "Wawa") {
            return new Warrior(userPseudo, nb1, nb1);
        } else {
            return new Magician(userPseudo, nb2, nb3);
        }
    }
}
