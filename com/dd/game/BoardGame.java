package com.dd.game;

import com.dd.attack.*;
import com.dd.cases.Cases;
import com.dd.enemies.*;
import com.dd.potion.*;

import java.lang.reflect.Array;

public class BoardGame {
    int arrSize;
    int position;
    // int[] board;
    Cases[] borad;
    /**
    * Constructeur #BoardGame()
    */
    public BoardGame(){
        this.position = 0;
        this.arrSize = 65;
        // this.board = (int[])Array.newInstance(int.class, arrSize);
        this.borad = (Cases[])Array.newInstance(Cases.class, arrSize);
    }
    /**
    * Boucle sur la longueur du tableau.
    * A chaque case du plateau de jeu appel la methode qi va remplir la case ou non.
    * @see #creatCase(int)
    */
    public void creatBoardGame(){;
        for (int i = 0; i < this.borad.length-1; i++) {
            creatCase(i);
            System.out.println(Array.get(this.borad, i));
        }
    }
    /**
    * Cré le contenu dune case.
    * null / Weapon / Hero / Potion
    * @param i numéro de la case
    */
    public void creatCase(int i){
        Cases newCase;
        switch (i) {
            case 45, 52, 65, 62->{
                // Unicorn / Dragon
                newCase = new Unicorn();
                Array.set(this.borad, i, newCase);
            }
            case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47->{
                // KawaiiCat / Sorcier
                newCase = new KawaiiCat();
                Array.set(this.borad, i, newCase);
            }
            case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30->{
                // Flower / Gobelin
                newCase = new Flower();
                Array.set(this.borad, i, newCase);
            }
            case 2, 11, 5, 22, 38->{
                // baseball bat / Massue
                newCase = new BaseballBat();
                Array.set(this.borad, i, newCase);
            }
            case 19, 26, 42, 53->{
                // Kitchen knife / Epée
                newCase = new KitchenKnife();
                Array.set(this.borad, i, newCase);
            }
            case 1, 4, 8, 17, 23->{
                // Chain saw / Spell éclair
                newCase = new ChainSaw();
                Array.set(this.borad, i, newCase);
            }
            case 48, 49->{
                // Axe / Spell boule de feu
                newCase = new Axe();
                Array.set(this.borad, i, newCase);
            }
            case 7, 13, 31, 33, 39, 43->{
                // Popo
                newCase = new LittlePopo();
                Array.set(this.borad, i, newCase);
            }
            case 28, 41->{
                // Grande Popo
                newCase = new MiddlePopo();
                Array.set(this.borad, i, newCase);
            }
            default ->{
                // vide
                newCase = null;
                Array.set(this.borad, i, newCase);
            }
        }
    }
    /**
    * Edite la nouvelle position du joueur.
    * Tan que la valeur de la nouvelle position est infèrieur à 64
    * la nouvelle position est égale à l'ancienne position plus la valeur du dé
    * si non le joueur arrive sur la case final.
    * @param dice valeur du dés
    */
    public void setNewPosition(int dice){
        if (this.position+dice > 64 ){
            this.position = 64;
        } else {
            this.position += dice;
        }
    }
    /**
    * Récupère la position du joueur.
    * @return La position du joueur.
    */
    public Integer getPosition(){
        return this.position;
    }
    /**
    * Récupère ce qu'il y a dans la case.
    * @return null / Weapon / Hero / Potion
    */
    public Cases wathsInsideCell(){
        return (Cases)Array.get(this.borad, this.position);
    }
}
