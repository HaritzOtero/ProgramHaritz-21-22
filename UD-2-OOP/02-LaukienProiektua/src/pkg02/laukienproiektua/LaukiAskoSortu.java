/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.laukienproiektua;

import java.util.Scanner;

/**
 *
 * @author otero.haritz
 */
public class LaukiAskoSortu {
/**
 * Laukiak sortzeko main-a.
 * @param args 
 * 
 */
    public static void main(String[] args) {
        int laukiKop;
        Laukia[] laukiak;

        Scanner in = new Scanner(System.in);
        System.out.print("Zenbat lauki sortu nahi dituzu? ");
        laukiKop = in.nextInt();

        laukiak = new Laukia[laukiKop]; //para crear laukiak segun la cantidad que introduzka el usuario en array.

        for (int i = 0; i < laukiKop; i++) {
            System.out.println(i + 1 + ". LAUKIAREN DATUAK: ");
            System.out.print("Zabalera: ");
            int zab = in.nextInt();
            System.out.print("Altuera: ");
            int alt = in.nextInt();
            laukiak[i] = new Laukia(zab, alt);
        }
        System.out.println("Laukia   Zabalera   Altuera   Azalera   Perimetroa   Mota \n"
                + "============================================================");
        for (int i = 0; i < laukiKop; i++) {
            System.out.println((i + 1) + "               "+ (laukiak[i].getZabalera())+"         "+(laukiak[i].getAltuera()) +"         "+(laukiak[i].getAzalera())+"         "+(laukiak[i].getPerimetroa())+"    "+laukiak[i].getMota()  );
                    // ;

        }
    }

}
