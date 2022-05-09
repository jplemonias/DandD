package com.dd.menu;

import com.dd.game.*;

import java.util.Scanner;

public class Menu {
    String choice;
    Scanner sc = new Scanner(System.in);
    Game game = new Game();
    Dice dice = new Dice();
    BoardGame board = new BoardGame();

    Boolean persoOk = false;
    Boolean firstStartGame = true;
    Boolean inMenu = false;
    Boolean gameStarted = false;

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
    }

    public void nameChoice() {
        if ( persoOk ) {
            System.out.println("Entre ton nouveau nom :");
        } else {
            System.out.println("Quel sera le nom de ton personnage ?");
        }
        choice = sc.nextLine();
        game.setNewUserName(choice);
        this.clearConsole();
    }

    public void heroChoice() {
        System.out.println("Tu veux play ? \n1 - Wawa\nDmg : 5-15 HP : 5-15\nAttack :\nSword +5\nMace +3\n\n2 - Mago\nDmg : 3-6 HP : 8-15\nAttack :\nSpell Fire +7\nSpell Flash +2");
        choice = sc.nextLine();
        switch (choice){
            case "1":
                game.creatPerso(game.getUserName(), choice);
                break;

            case "2":
                game.creatPerso(game.getUserName(), choice);
                break;

            case "M":
                this.menuPrincipal();
                break;

            default:
                System.out.println("Choix incorrect");
                heroChoice();
                break;
        };
        this.clearConsole();
    }

    public void confirmChoice() {
        while (!persoOk) {
            String yesNo;
            System.out.println( game.getHero() );
            System.out.println("Ce Personnage vous convient il ?\n( Oui : y Non : N )");

            yesNo = sc.nextLine();
            if (yesNo.equals("N")) {
                game.creatPerso(game.getUserName(), choice);
            } else if (yesNo.equals("y")) {
                persoOk = true;
            } else {
                System.out.println("Trop difficile y ou N ?");
            }
        }
        this.clearConsole();
        this.menuPrincipal();
    }

    public void menuPrincipal() {
        inMenu = true;
        while (inMenu) {
            if ( firstStartGame ) {
               System.out.println( "Tu as maintenant un Personnage pour commncer ton aventure" );
               System.out.println( "Tu peux faire apparaitre ce menu à tout moment en Rentrant \"M\" dans tes choix" );
               this.firstStartGame = false;
            }
            if ( gameStarted ) {
                System.out.println( "\"S\" : restart game \n\"P\" : voir le hero\n\"E\" : edit hero\n\"Q\" : quiter le jeu\n\n\"R\" : fermer ce menu" );
            } else {
                System.out.println( "\"S\" : start game \n\"P\" : voir le hero\n\"E\" : edit hero\n\"Q\" : quiter le jeu\n\n\"R\" : fermer ce menu" );
            }
            String choice = sc.nextLine();
            switch (choice){
                case "S":
                    if ( gameStarted ) {
                        System.out.println( "\"y\" : restart \n\"N\" : continu" );
                        String restarting = sc.nextLine();
                        if (restarting == "y"){
                            this.inMenu = false;
                            this.gameStarted = true;
                            game.startGame();
                        }
                    } else {
                        this.inMenu = false;
                        this.gameStarted = true;
                        game.startGame();
                    }
                    break;
    
                    case "P":
                    System.out.println(game.getHero());
                    break;
    
                
                    case "E":
                    System.out.println( "\"1\" : Nom \n\"2\" : Attack" );
                    String edit = sc.nextLine();
                    if ( edit.equals("1") ){
                        System.out.println( "Entre ton nouveau nom :" );
                        edit = sc.nextLine();
                        this.game.setNewUserName(edit);
                        this.game.setNewHeroName(edit);
                    } else if ( edit.equals("2") ){
                        System.out.println( "En cours de création => retour au menu précédent." );
                    } else {
                        System.out.println( "Erreur dans les choix, retour au menu précédent." );
                    }
                    break;
    
                case "Q":
                    System.out.println("Pffff espèce de fiotte!!!");
                    System.exit(0);
                    break;
    
                case "R":
                    this.inMenu = false;
                    break;
    
                default:
                    this.clearConsole();
                    System.out.println("Choix incorrect");
                    break;
            };
        }
        this.clearConsole();
    }
    
    public void gameStarted() {
        int position = board.getPosition();
        if (position == 0){
            System.out.println( "Tu es maintenant en jeu" );
        } else {
            System.out.println( "Tu continues d'avancer ?" );
        }
        System.out.println( "\"1\" - lacer le dé\n\"M\" - Menu principal" );
        choice = sc.nextLine();
        this.clearConsole();
        switch (choice){
            case "1":
                dice.launchDice();
                System.out.println("Resultat du dé : "+this.dice.getDice());
                board.setNewPosition(this.dice.getDice());
                System.out.println("Tu est maintenant à l'étage : "+board.getPosition());
                System.out.println("Info case : "+board.getInfo());
                this.gameStarted();
                break;

            case "M":
                this.menuPrincipal();
                break;

            default:
                this.clearConsole();
                System.out.println("Choix incorrect");
                gameStarted();
                break;
        };
    } 
}
