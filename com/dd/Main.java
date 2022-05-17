package com.dd;

import com.dd.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.clearConsole();
        welcome();
        menu.nameChoice();
        menu.heroChoice();
        menu.confirmChoice();
        // menu.weaponChoice();
        menu.creatBoard();
        menu.gameStarted();
    }

    private static void welcome() {
        System.out.println("       \\");
        System.out.println("        \\");
        System.out.println("         \\\\");
        System.out.println("          \\\\");
        System.out.println("           >\\/7");
        System.out.println("       _.-(6'  \\     Bienvenu dans :");
        System.out.println("      (=___._/` \\\tNightmare");
        System.out.println("           )  \\ |\t    &");
        System.out.println("          /   / |\t Unicorn");
        System.out.println("         /    > /\t\t");
        System.out.println("        j    < _\\\t\t");
        System.out.println("    _.-' :      ``.\t\t");
        System.out.println("    \\ r=._\\        `.\t\t");
        System.out.println("   <`\\\\_  \\         .`-.\t");
        System.out.println("    \\ r-7  `-. ._  ' .  `\\\t");
        System.out.println("     \\`,      `-.`7  7)   )\t");
        System.out.println("      \\/         \\|  \\'  / `-._\t");
        System.out.println("                 ||    .'\t");
        System.out.println("                  \\\\  (\t\t");
        System.out.println("                   >\\  >\t");
        System.out.println("               ,.-' >.'\t\t");
        System.out.println("              <.'_.''\t\t");
        System.out.println("                <'\t\t");
    }
}
