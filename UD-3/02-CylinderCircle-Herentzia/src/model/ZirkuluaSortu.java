/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author otero.haritz
 */
public class ZirkuluaSortu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zirkulu arrunta edo zilindroa sortu nahi duzu? (a/z) ");
        char erantzuna;
        erantzuna = in.next().charAt(0);

        switch (erantzuna) {
            case 'a':
                Zirkulua();
                break;
            case 'z':
                Zilindroa();

        }

    }

    public static void Zirkulua() {
        Scanner in = new Scanner(System.in);
        double erradioa;
        String kolorea;

        System.out.println("Zein izango da bere erradioa? ");
        erradioa = in.nextInt();
        System.out.println("Zein izango da bere kolorea? ");
        kolorea = in.next();

        Circle ci1 = new Circle(erradioa, kolorea);
        System.out.println("Erradioa: " + ci1.getRadius());
        System.out.println("Kolorea: " + ci1.getColor());
        System.out.println("Azalera: " + ci1.getArea());
        
    }
            

    

    public static void Zilindroa() {
        Scanner in = new Scanner(System.in);
        double erradioa, altuera;
        String kolorea;
        
        System.out.println("Zein izango da bere erradioa? ");
        erradioa = in.nextInt();
        System.out.println("Zein izango da bere kolorea? ");
        kolorea = in.next();
        System.out.println("Zein izango da bere altuera? ");
        altuera = in.nextInt();
        
        Cylinder c1 = new Cylinder(altuera,erradioa,kolorea);
        System.out.println("Erradioa: " + c1.getRadius());
        System.out.println("Kolorea: " + c1.getColor());
        System.out.println("Altuera: " + c1.getHeight());
        System.out.println("Azalera: " + c1.getArea());
        System.out.println("Bolumena: " + c1.getVolume());
        
        
    }
}
