/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author otero.haritz
 */
public class Model {

    private final String fitxategia = "Hiztegia.csv";

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

    public void selectAll() {
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                System.out.println(t);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String imprimatuString() {
        String strTerminoak = "";
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                strTerminoak = strTerminoak + System.lineSeparator() + t;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return strTerminoak;

    }

    public String hiztegiaInprimatu() {
        String sql = "SELECT id, euskaraz, gazteleraz FROM Terminoak";
        ArrayList<Terminoa> terminoak = new ArrayList<>();
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                terminoak.add(t);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return terminoak.toString();
    }

    public void update(Terminoa t) {
        String sql = "UPDATE Terminoak SET euskaraz = ? , "
                + "gazteleraz = ? "
                + "WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, t.getEuskaraz());
            pstmt.setString(2, t.getGazteleraz());
            pstmt.setInt(3, t.getId());
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(Terminoa t) {
        String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, t.getEuskaraz());
            pstmt.setString(2, t.getGazteleraz());
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


    public void terminoakGorde(String areakoTestua) {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileWriter("gordetakoTerminoak.txt"));
            outputStream.print(areakoTestua);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static void terminoakInprimatu() {
        
    }

        public String terminoakJaso() throws IOException {
        String Resultadoterminos = "";
        String[] terminoBanaketa = new String[3];
        Terminoa tx = new Terminoa();
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("terminoak.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                terminoBanaketa = l.split(",");
                tx = new Terminoa(Integer.parseInt(terminoBanaketa[0]), terminoBanaketa[1], terminoBanaketa[2]);
                if (Resultadoterminos.equals("")) {
                    Resultadoterminos = tx.toString();
                } else {
                    Resultadoterminos = Resultadoterminos + "\n" + tx.toString();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return Resultadoterminos;
    }
}
