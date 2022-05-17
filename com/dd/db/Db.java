package com.dd.db;

import com.dd.game.BoardGame;
import com.dd.game.Dice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
    String BDD;
    String url;
    String user;
    String passwd;
    public void Db(){
        this.BDD = "DD";
        this.url = "jdbc:mysql://localhost:3306/" + BDD;
        this.user = "DandD";
        this.passwd = "UnicornPowa";
    }
    public void runDataBase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, passwd);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
            System.out.println("Connected");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
