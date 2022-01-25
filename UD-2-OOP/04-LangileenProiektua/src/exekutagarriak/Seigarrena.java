/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;
import model.Langilea;

/**
 *
 * @author otero.haritz
 */
public class Seigarrena {

    public static void main(String[] args) {
        Langilea[] array = Langilea.nireHamarLagunLangile();

        System.out.printf(" %-8s %15s %15s %15s  \n", "ID", "Izena", "ABIZENA", "SOLDATA");
        System.out.println("==========================================================");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %-8s %15s %15s %15s  \n", array[i].getId(), array[i].getIzena(), array[i].getAbizena(), array[i].getSoldata());
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu langile baten izena: ");
        String izena = in.next();

        if (Langilea.bilatu(izena, array) == null) {
            System.out.println("Langile hori ez dago listan. ");
        } else {
            Langilea aurkitutakoak = Langilea.bilatu(izena, array);
            System.out.println(aurkitutakoak);

            System.out.println("Zenbat igo nahi diozu soladata portzentaian? ");
            int portzentaia = in.nextInt();
            aurkitutakoak.soldataIgo(portzentaia);

            System.out.printf(" %-8s %15s %15s %15s  \n", "ID", "Izena", "ABIZENA", "SOLDATA");
            System.out.println("==========================================================");
            for (int i = 0; i < array.length; i++) {
                System.out.printf(" %-8s %15s %15s %15s  \n", array[i].getId(), array[i].getIzena(), array[i].getAbizena(), array[i].getSoldata());
            }
            double total = 0;
            for (int i = 0; i < array.length; i++) {
                total = total + array[i].getUrtekoSoldata();
            }
            System.out.println(total + "$ da urteko nominen batura.");
        }
        double handiena = array[0].getSoldata();
        Langilea soldHand = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSoldata() > handiena) {
                handiena = array[i].getSoldata();
                soldHand = array[i];
            }

        }
        System.out.println(soldHand + " Dira soldata handiena duen langilearen datuak. ");
    }
}
