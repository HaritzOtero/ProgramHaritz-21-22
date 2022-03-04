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
public class Test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        Kutxa[] kutxaSorta = new Kutxa[10];
        
        for (int i = 0; i < kutxaSorta.length; i++) {
            System.out.print("Sartu lehenengo erpinaren koordenatuak(z1 z2): ");
            Puntua erpina = new Puntua(in.nextInt(),in.nextInt());
            System.out.print("Sartu kontrako erpinaren koordenatuak(z1 z2): ");
            Puntua kontrakoErpina = new Puntua(in.nextInt(),in.nextInt());
            System.out.print("Sartu altuera: ");
            int altuera = in.nextInt();
            
            kutxaSorta[i] = new Kutxa(erpina,kontrakoErpina,altuera);
        }
        
        System.out.printf("%15s %15s %16s %15s %15s", "KUTXA","ERPINA" , "KONTR. ERPINA", "ALTUERA", "BOLUMENA");
        System.out.printf("\n----------------------------------------------------------------------------------");
        for (int i = 0; i < kutxaSorta.length; i++) {
            System.out.printf("\n%15d %15s %15s %15d %15d", (i+1),kutxaSorta[i].getErpinBat() , kutxaSorta[i].getKontrakoErpina(), kutxaSorta[i].getAltuera(), kutxaSorta[i].getBolumena());
        }
        System.out.println("");
    }
    }
    

