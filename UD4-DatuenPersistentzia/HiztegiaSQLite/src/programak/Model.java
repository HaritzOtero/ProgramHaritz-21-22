/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author otero.haritz
 */
public class Model {
   //    public static void connect() {
//        Connection conn = null;
//        try {
//            // db parameters
//            String url = "jdbc:sqlite:E:\\Curso 21-22\\GIT-HUB\\program21-22\\UD4-DatuenPersistentzia\\HiztegiaSQLite\\src\\db\\Hiztegia.db";
//            // create a connection to the database
//            conn = DriverManager.getConnection(url);
//            
//            System.out.println("Connection to SQLite has been established.");
//            
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:\\Users\\otero.haritz\\Desktop\\Haritz DAM\\PROGRAMAZIOA\\GitHub\\Net Beans\\ProgramHaritz-21-22\\UD4-DatuenPersistentzia\\HiztegiaSQLite\\src\\db\\Hiztegia.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

     public void selectAll(){
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("euskaraz") + "\t" +
                                   rs.getString("gazteleraz"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
     public void insert(String euskaraz, String gazteleraz) {
        String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, euskaraz);
            pstmt.setString(2, gazteleraz);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void delete(int id) {
        String sql = "DELETE FROM Terminoak WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     
} 
}
