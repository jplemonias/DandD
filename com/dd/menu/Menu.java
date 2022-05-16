package com.dd.menu;

import com.dd.game.*;
import com.dd.Main;
import com.dd.exceptions.*;

import java.util.Scanner;

public class Menu {
    private String choice;
    private Scanner sc = new Scanner(System.in);
    private Game game = new Game();
//    Dice dice = new Dice();
//    BoardGame board = new BoardGame();

    private Boolean persoOk = false;
    private Boolean firstStartGame = true;
    private Boolean inMenu = false;
    private Boolean gameStarted = false;

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
    }

    public void nameChoice() {
        if ( persoOk ) {
            System.out.print("Entre ton nouveau nom : ");
        } else {
            System.out.println("\n\t     Quel sera le nom de ton personnage ?");
            System.out.print( "Saisi le nom de ton hero : " );
        }
        choice = sc.nextLine();
        try {
            ExceptionsMenu.controle(choice);
        } catch (ExceptionsMenu e) {
            this.clearConsole();
            System.out.println(e.getMessage());
            this.nameChoice();
        }
        game.setNewUserName(choice);

        this.clearConsole();
    }

    public void heroChoice() {
        System.out.println("Tu veux play ? \n1 - Michael Myers\nDmg : 5-15 HP : 5-15\nAttack :\nun couteau de cuisine +5\nune batte de baseball +3\n\n2 - Jason Voorhess\nDmg : 3-6 HP : 8-15\nAttack :\nune tronçonneuse +7\nune hache +2");
        System.out.print( "Choisi ton type de hero : " );
        choice = sc.nextLine();
        switch (choice){
            case "1", "2":
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

    // public void weaponChoice() {
    //     System.out.println("Quel arme veux-tu utiliser ?");
    //     if ( this.game.getTypePerso().equals("1") ) {
    //         System.out.println("1 - un couteau de cuisine\nDmg : +5\n\n2 - une batte de baseball\nDmg : +3");
    //     } else if ( this.game.getTypePerso().equals("2") ) {
    //         System.out.println("1 - une tronçonneuse\nDmg : +7\n\n2 - une hache\nDmg : +2");
    //     } else {
    //         System.out.println("Choix incorrect");
    //         weaponChoice();
    //     }
    //     // this.game.setWeapon(sc.nextLine(), this.game.getTypePerso());
    //     this.menuPrincipal();
    // }

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
                System.out.println( "\"S\" : restart game \n\"P\" : voir le hero\n\"E\" : edit hero\n\"Q\" : quiter le jeu\n\n\"C\" : fermer ce menu" );
            } else {
                System.out.println( "\"S\" : start game \n\"P\" : voir le hero\n\"E\" : edit hero\n\"Q\" : quiter le jeu\n\n\"C\" : fermer ce menu" );
            }
            String choice = sc.nextLine();
            switch (choice){
                case "S":
                    if ( gameStarted ) {
                        System.out.println( "\"y\" : restart \n\"N\" : continu" );
                        String restarting = sc.nextLine();
                        if (restarting == "y"){
                            restart();
                        }
                    } else {
                        restart();
                    }
                    break;
    
                    case "P":
                    try {
                        System.out.println(game.getHeroStuffed());
                    } catch (Exception e) {
                        try {
                            System.out.println(game.getHero());
                        } catch (Exception f) {
                            System.out.println("Pas de hero créé");
                        }
                    }
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
                        // this.weaponChoice();
                        System.out.println( "Fait... mais pas utilisé pour l'instant." );
                    } else {
                        System.out.println( "Erreur dans les choix, retour au menu précédent." );
                    }
                    break;
    
                case "Q":
                    System.out.println("Pffff espèce de peureux!!!");
                    System.exit(0);
                    break;
    
                case "C":
                    this.inMenu = false;
                    this.gameStarted();
                    break;
    
                default:
                    this.clearConsole();
                    System.out.println("Choix incorrect");
                    break;
            };
        }
        this.clearConsole();
    }

    public void restart() {
        this.inMenu = false;
        this.gameStarted = false;
        this.persoOk = false;
        this.firstStartGame = true;
        
        Main.main(null);
    }

    public void gameStarted() {
        boolean gameOver = this.game.gameOver();;
        if (!gameOver) {
            int position = game.getPosition();
            if (position == 0 ){
                System.out.println( "Tu es maintenant en jeu" );
                System.out.println( "\"1\" - lancer le dé\n\"M\" - Menu principal" );
            } else if (position > 63){
                System.out.println( "Tu es sur la dernière case" );
                System.out.println( "\"M\" - Menu principal" );
            } else {
                System.out.println( "Tu continues d'avancer ?" );
                System.out.println( "\"1\" - lancer le dé\n\"M\" - Menu principal" );
            }
            choice = sc.nextLine();
            this.clearConsole();
            switch (choice){
                case "1":
                    if (position > 63){
                        this.menuPrincipal();
                    }
                    int dice = game.launchDice();
                    System.out.println("Resultat du dé : "+dice);
                    game.setPosition(dice);
                    System.out.println("Tu est maintenant à l'étage : "+game.getPosition());
                    this.eventCell(game.infoCase());
                    if (position < 63) {
                        this.gameStarted();
                    }
                    break;
    
                case "M":
                    this.menuPrincipal();
                    break;
    
                default:
                    this.clearConsole();
                    System.out.println("Choix incorrect");
                    this.gameStarted();
                    break;
            };
        }
    }
    public void eventCell(String info){
        // System.out.println(info);
        switch (info){
            case "Weapon":
                game.equipWeapoun();
                break;

            case "Hero":
                game.progressFight();
                break;

            case "Potion":
                game.heal();
                break;

            default:
                if (game.getPosition() < 64) {
                    System.out.println("Tu as de la chance...\nOu pas case vide :P");
                } else {
                    System.out.println("WouHouuu tu as gagné...");
                    this.gameStarted = false;
                    this.persoOk = false;
                }
                break;
        }
    };

    public void creatBoard() {
        game.creatBoard();
    }

    // public void controle(String chaine) throws ExceptionsMenu {
    //     String err = "Saisie erronee : ";
    //     if (chaine.equals("")){
    //         throw new ExceptionsMenu(err+"pas de pseudo saisi.");
    //     }
    //     if (chaine.length() > 15){
    //         throw new ExceptionsMenu(err+"nom trop long (15 car max).");
    //     }
    //     if (!Pattern.compile("\\w+").matcher(chaine).matches()){
    //         throw new ExceptionsMenu(err+"Saisie non autorisée (car spé)\ncaractères autorisés : a-z A-Z 0-9.");
    //     }
    // }
}
