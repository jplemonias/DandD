package com.dd;

import com.dd.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.clearConsole();
        menu.nameChoice();
        menu.heroChoice();
        menu.confirmChoice();
        menu.gameStarted();
    }
}
