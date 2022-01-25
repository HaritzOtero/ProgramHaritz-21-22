/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Arrays;
import model.Langilea;

/**
 *
 * @author otero.haritz
 */
public class Zortzigarrena {
    public static void main(String[] args) {
        Langilea[]arraya = Langilea.nireHamarLagunLangile();
        
        
        
        
        
        
        System.out.printf(" %-8s %15s %15s %15s  \n", "ID", "Izena", "ABIZENA", "SOLDATA");
            System.out.println("==========================================================");
            for (int i = 0; i < arraya.length; i++) {
                System.out.printf(" %-8s %15s %15s %15s  \n", arraya[i].getId(), arraya[i].getIzena(), arraya[i].getAbizena(), arraya[i].getSoldata());
            }
    }
}
