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
public class LaukiBatSortu {
    /**
     * Lauki bat sortzeko main-a.
     * @param args 
     */
    
    public static void main(String[] args) {
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
}
