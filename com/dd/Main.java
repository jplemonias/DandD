package com.dd;

import com.dd.game.Game;
import com.dd.menu.Menu;
import com.dd.heros.Hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.nameChoice();
        menu.heroChoice();
        menu.confirmChoice();
        System.out.println(Hero.getPerso());
    }
}
