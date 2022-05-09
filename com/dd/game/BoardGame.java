package com.dd.game;

import java.lang.reflect.Array;
import java.util.Random;

public class BoardGame {
    int arrSize;
    int position;
    int[] board;

    public BoardGame(){
        this.position = 0;
        this.arrSize = 65;
        this.board = (int[])Array.newInstance(int.class, arrSize);
    }

    public void creatBoardGame(){
        Array.setInt(this.board, 0, 0);
        System.out.println("Element 0 = " + Array.getInt(this.board, 0));
        Array.setInt(this.board, arrSize-1, 4);
        for (int i = 1; i < this.board.length-1; i++) {
            Random random1 = new Random();
            int result = random1.nextInt(3);
            Array.setInt(this.board, i, result+1);
            System.out.println("Element " + i + " = " + Array.getInt(this.board, i));
        }
        System.out.println("Element " + (arrSize-1) + " = " + Array.getInt(this.board, arrSize-1));
    }

    public void setNewPosition(int dice){
        if (this.position+dice > 64 ){
            this.position = 64;
        } else {
            this.position += dice;
        }
    }

    public Integer getPosition(){
        return this.position;
    }

    public Integer getInfoBoard() {
        return Array.getInt(this.board, this.position);
    }
}
