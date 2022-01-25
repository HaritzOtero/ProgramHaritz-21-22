/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Langilea;

/**
 *
 * @author otero.haritz
 */
public class NiLangile {
    public static void main(String[] args) {
        Langilea ni = new Langilea(1,"Haritz", 600);
        System.out.println(ni.toString());
        ni.soldataIgo(50);
        System.out.println(ni.toString());
    }
    

    
}
