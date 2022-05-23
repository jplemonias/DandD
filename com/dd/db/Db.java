package com.dd.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    String BDD;
    String url;
    String user;
    String passwd;
    public Db(){
        this.BDD = "dd";
        this.url = "jdbc:mysql://localhost:3306/" + BDD;
        this.user = "DandD";
        this.passwd = "UnicornPowa";
    }
    public Connection runDataBase(){
        Connection connect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(this.url, this.user, this.passwd);
            System.out.println("Connected to : " + this.BDD + " data base");
        } catch(SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
        return connect;
    }
}
