/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import java.util.Scanner;

/**
 *
 * @author otero.haritz
 */
public class Izenak {

    public static void main(String[] args) {
        String izenak;
        String[] izena;
        boolean encontrar = false;
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Noren bila zabiltza? ");
        izenak = in.next();

        izena = new String[5];

        izena[0] = "Jon";
        izena[1] = "Jone";
        izena[2] = "June";
        izena[3] = "Julian";
        izena[4] = "Julen";

        while (encontrar == false && i < izena.length) {
            if (izena[i].equals(izenak)) {
                encontrar = true;
            } else {
                encontrar = false;
                i++;
            }
        }

        if (encontrar == true) {
            System.out.println(izenak + " zerrendako " + (i + 1)+ " da.");
        } else {
            System.out.println(izenak + " Ez dago zerrendan.");
        }
    }
}
