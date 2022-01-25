package pkg02.laukienproiektua;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class HiruLaukiSortu {

    private static int LAUKI_KOP = 3;
    private static int sortutakoak;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (sortutakoak <= 3) {
            System.out.println("LAUKIAREN DATUAK: ");
            System.out.print("Zabalera: ");
            int zab = in.nextInt();
            System.out.print("Altuera: ");
            int alt = in.nextInt();

            laukiak[sortutakoak] = new Laukia(zab, alt);
            sortutakoak++;
        }
    }
}
