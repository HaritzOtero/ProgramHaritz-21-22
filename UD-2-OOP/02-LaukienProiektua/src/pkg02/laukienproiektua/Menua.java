package pkg02.laukienproiektua;


import java.util.Scanner;
import pkg02.laukienproiektua.Laukia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author otero.haritz
 */
public class Menua {

 /**
 * Programaren menua.
 */
    private static int LAUKI_KOP = 10;
    private static int sortutakoak;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];

    public static void main(String[] args) {
        System.out.println("LAUKIAK");
        System.out.println("====================================");
        System.out.println("1.- Lauki berria sortu");
        System.out.println("2.- Laukien taula ikusi");
        System.out.println("3.- Lauki bat marraztu");
        System.out.println("4.- Lauki handiena bilatu");
        System.out.println("5.- Irten");

        Scanner in = new Scanner(System.in);
        System.out.print("Aukeratu zenbaki  bat: ");
        int ariketa = in.nextInt();

        while (ariketa != 5) {
            if (ariketa == 1) {
                sortu();
            }
            if (ariketa == 2) {
                inprimatu();
            }
            if (ariketa == 3) {
                marraztu();
            }
            if (ariketa == 4) {
                handiena();
            }
            System.out.println("Aukeratu zenbaki bat: ");
            ariketa = in.nextInt();
        }
        System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
    }
/**
 * Laukiak sortzeko kodea.
 */
    public static void sortu() {

        Scanner in = new Scanner(System.in);

        System.out.println("LAUKIAREN DATUAK: ");
        System.out.print("Zabalera: ");
        int zab = in.nextInt();
        System.out.print("Altuera: ");
        int alt = in.nextInt();

        laukiak[sortutakoak] = new Laukia(zab, alt);
        sortutakoak++;

        if (sortutakoak == LAUKI_KOP) {
            System.out.println("Ezin dituzu lauki gehiago sortu.");
        }

    }

   /**
    * Sortuutako laukiak taula modian agertzeko era.
    */ 
    public static void inprimatu() {
        System.out.println("Laukia   Zabalera   Altuera   Azalera   Perimetroa   Mota \n"
                + "============================================================");
        for (int i = 0; i < sortutakoak; i++) {
            System.out.println((i + 1) + "               " + (laukiak[i].getZabalera()) + "         " + (laukiak[i].getAltuera()) + "         " + (laukiak[i].getAzalera()) + "         " + (laukiak[i].getPerimetroa()) + "    " + laukiak[i].getMota());
            // ;

        }
    }
/**
 * Laukiak betetak eta hutsik marrazteko kodea zabalera eta altueraren arabera.
 */
    public static void marraztu() {
        int zab;
        int alt;

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu laukiaren zabalera: ");
        zab = in.nextInt();
        System.out.println("Sartu laukiaren altuera: ");
        alt = in.nextInt();
        Laukia l1 = new Laukia(zab, alt);

        System.out.println("Laukia beteta: ");
        l1.marraztuBeteta();

        System.out.println("Laukia hutsik");
        l1.marraztuHutsik();

    }
/**
 * Lauki handiena lortzko kodea.
 */
    public static void handiena() {
         
    }
    public static void arrayaBete() {
       for(int i = 0; i < LAUKI_KOP; i++) {
           laukiak[i] = new Laukia ((int) (Math.random() * 10) + 1, (int) (Math.random()*10)+1);
           sortutakoak++;
       }
    }
}
