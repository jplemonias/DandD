package com.dd.db;

import java.sql.*;

public class Req {
    private Connection db = new Db().runDataBase();
    private String query;

    public void addEnnemyInEnnemies(String name, int hp, int dmg){
        this.query = "INSERT INTO ennemies (name, hp, damages) VALUES (?,?,?)";
        try {
            PreparedStatement stmt = db.prepareStatement(this.query);
            stmt.setString(1, name);
            stmt.setInt(2, hp);
            stmt.setInt(3, dmg);
            stmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public void deleteEnnemyByName(String name){
        this.query = "DELETE FROM ennemies WHERE name = ?";
        // ResultSet results;
        try {
            PreparedStatement stmt = db.prepareStatement(this.query);
            stmt.setString(1, name);
            stmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public void getAllEnnemies(){
        this.query = "SELECT * FROM ennemies";
        ResultSet results;
        try {
            Statement stmt = db.createStatement();
            results = stmt.executeQuery(this.query);

            System.out.println("Name      Hp     damages");
            while (results.next()) {
                String Name = results.getString("name");
                int hp = results.getInt("hp");
                int damages = results.getInt("damages");
                System.out.println(Name + "     " + hp + "     " + damages);
            }

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
