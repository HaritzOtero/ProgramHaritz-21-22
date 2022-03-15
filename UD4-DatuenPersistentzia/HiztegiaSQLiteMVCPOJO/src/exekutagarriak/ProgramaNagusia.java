/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import pkg1.SQLiteaKudeatu;

/**
 *
 * @author parra.raul
 */
public class ProgramaNagusia {

    public static void main(String[] args) {
//        connect();
        SQLiteaKudeatu app = new SQLiteaKudeatu();
        app.selectAll();

        app.insert("Platanoa", "Platano");
        app.selectAll();

    }
}
