package com.dd;

import com.dd.menu.Menu;
// import com.dd.db.Req;

public class Main {
    public static void main(String[] args) {
//        Req req = new Req();
//        req.addEnnemyInEnnemies("Test_1", 1, 2);
//        req.addEnnemyInEnnemies("Test_2", 1, 2);
//        req.deleteEnnemyByName("Test_1");
//        req.getAllEnnemies();
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
