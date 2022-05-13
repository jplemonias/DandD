package com.dd.game;

import com.dd.attack.*;
import com.dd.cases.Cases;
import com.dd.heros.Flower;
import com.dd.heros.KawaiiCat;
import com.dd.heros.Unicorn;
import com.dd.potion.*;

import java.lang.reflect.Array;

public class BoardGame {
    int arrSize;
    int position;
    // int[] board;
    Cases[] borad;

    public BoardGame(){
        this.position = 0;
        this.arrSize = 65;
        // this.board = (int[])Array.newInstance(int.class, arrSize);
        this.borad = (Cases[])Array.newInstance(Cases.class, arrSize);
    }

//    public void creatBoardGame(){
////        Array.setInt(this.board, 0, 0);
////        System.out.println("Element 0 = " + Array.getInt(this.board, 0));
////        Array.setInt(this.board, arrSize-1, 4);
////        Random random1 = new Random();
////        int result = random1.nextInt(3);
////        Array.setInt(this.board, i, result+1);
//        for (int i = 0; i < this.board.length-1; i++) {
//            creatCase(i);
//            // Case case = new Case();
//            // System.out.println("Element " + i + " = " + Array.getInt(this.board, i));
//        }
//        // System.out.println("Element " + (arrSize-1) + " = " + Array.getInt(this.board, arrSize-1));
//    }

    public void creatBoardGame(){
//        Array.setInt(this.board, 0, 0);
//        System.out.println("Element 0 = " + Array.getInt(this.board, 0));
//        Array.setInt(this.board, arrSize-1, 4);
//        Random random1 = new Random();
//        int result = random1.nextInt(3);
//        Array.setInt(this.board, i, result+1);
        for (int i = 0; i < this.borad.length-1; i++) {
            creatCase(i);
            // Case case = new Case();
            //System.out.println("Element " + i + " = " + Array.get(this.boradTest, i));
        }
        // System.out.println("Element " + (arrSize-1) + " = " + Array.getInt(this.board, arrSize-1));
    }

    public void setNewPosition(int dice){
        if (this.position+dice > 64 ){
            this.position = 64;
        } else {
            this.position += dice;
        }
    }
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
        /* Dégueu...
        if ( i == 45 || i == 52 || i == 65 || i == 62 ){
            Array.setInt(this.board, i, 3); // Unicorn / Dragon
        } else if ( i == 10 || i == 20 || i == 25 || i == 32 || i == 35 || i == 36 || i == 37 || i == 40 || i == 44 || i == 47 ){
            Array.setInt(this.board, i, 2); // KawaiiCat / Sorcier
        } else if ( i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18 || i == 21 || i == 24 || i == 27 || i == 30 ){
            Array.setInt(this.board, i, 1); // Flower / Gobelin
        } else if ( i == 2 || i == 11 || i == 5 || i == 22 || i == 38 ){
            Array.setInt(this.board, i, 5); // baseball bat / Massue
        } else if ( i == 19 || i == 26 || i == 42 || i == 53 ){
            Array.setInt(this.board, i, 6);// Kitchen knife / Epée
        } else if ( i == 1 || i == 4 || i == 8 || i == 17 || i == 23 ){
            Array.setInt(this.board, i, 4);// Chain saw / Spell éclair
        } else if ( i == 48 || i == 49 ){
            Array.setInt(this.board, i, 7);// Axe / Spell boule de feu
        } else if ( i == 7 || i == 13 || i == 31 || i == 33 || i == 39 || i == 43 ){
            Array.setInt(this.board, i, 8);// Popo
        } else if ( i == 28 || i == 41 ) {
            Array.setInt(this.board, i, 9);// Grande Popo
        } else {
            Array.setInt(this.board, i, 0);// vide
        }*/
    }

    public Integer getPosition(){
        return this.position;
    }

    // public Integer getInfoBoard() {
        // return Array.getInt(this.board, this.position);
    // }
    public Cases wathsInsideCell(){
        return (Cases)Array.get(this.borad, this.position);
    }
}
