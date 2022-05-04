package com.dd.menu;

import com.dd.game.Game;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        Boolean persoOk = false;


        System.out.println("Quel sera le Nom de ton personnage ?");
        choice = sc.nextLine();
        game.getNewUserName(choice);

        System.out.println("Vous voullez play ? 'Wawa' ou 'Mago'");
        choice = sc.nextLine();
        switch (choice){
            case "Wawa":
                System.out.println("Wawa");
                break;

            case "Mago":
                System.out.println("Mago");
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        };

        System.out.println(game.getPerso());
        while (!persoOk) {
            String yesNo;
            System.out.println("Ce Personnage vous convient il ? ( y/N )");
            yesNo = sc.nextLine();
            System.out.println(yesNo);
            if (yesNo.equals("N")) {
                game.creatPerso(choice, game.getUserName());
            } else if (yesNo.equals("y")) {
                persoOk = true;
            }
        }

    }
}
