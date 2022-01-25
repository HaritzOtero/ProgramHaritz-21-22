/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Probak;

import model.Zatikia;



/**
 *
 * @author otero.haritz
 */
public class ProbSsinplifikatu {
    public static void main(String[] args) {
    Zatikia z1 = new Zatikia(3,3);
    Zatikia z2 = new Zatikia(2,1);
    
    Zatikia z3 = Zatikia.biderkatu(z1, z2);
    sinplifikatu(z3);
        System.out.println(z3);
    }

  

   
