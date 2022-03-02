/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import model.Puntua;

/**
 *
 * @author otero.haritz
 */
public class Laukizuzena implements Marrazgarria {

    private Puntua erpinBat;
    private Puntua kontrakoErpina;

    public Laukizuzena(Puntua erpina, Puntua kontrakoErpina) {
        this.erpinBat = erpina;
        this.kontrakoErpina = kontrakoErpina;
    }
    
    public Laukizuzena() {
        
    }

    public Laukizuzena(int x1, int y1, int x2, int y2) {
        this.erpinBat = new Puntua(x1,y1);
        this.kontrakoErpina = new Puntua(x2,y2);
    }

    public Puntua getErpinBat() {
        return erpinBat;
    }

    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }

    @Override
    public String toString() {

        return Arrays.toString(getLauErpinenArraya());

    }

    @Override
    public void marraztu() {
           
    }

    public Puntua[] getLauErpinenArraya() {
        Puntua[] erpinak = new Puntua[4];

        
        
        Puntua erpina3 = new Puntua(kontrakoErpina.getX(), erpinBat.getY());
        Puntua erpina4 = new Puntua(erpinBat.getX(), kontrakoErpina.getY());

        erpinak[0] = erpinBat;
        erpinak[1] = erpina3;
        erpinak[2] = kontrakoErpina;
        erpinak[3] = erpina4; 
        
        
        
        return erpinak;
    }
    
    public ArrayList<Puntua> getLauErpinenArrayLista(){
    
        ArrayList<Puntua> puntuak =new ArrayList<>();
        Puntua p1 = new Puntua(erpinBat.getX(),erpinBat.getY());
        Puntua p2 = new Puntua(kontrakoErpina.getX(),erpinBat.getY());
        Puntua p3 = new Puntua(kontrakoErpina.getX(),kontrakoErpina.getY());
        Puntua p4 = new Puntua(erpinBat.getX(),kontrakoErpina.getY());
        
        puntuak.add(p1);
        puntuak.add(p2);
        puntuak.add(p3);
        puntuak.add(p4);
        
        return puntuak;
    }

}
