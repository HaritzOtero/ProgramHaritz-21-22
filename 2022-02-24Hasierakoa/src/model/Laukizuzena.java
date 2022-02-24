/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    public Puntua getErpinBat() {
        return erpinBat;
    }

    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }

    @Override
    public String toString() {

        return Arrays.toString(getLauErpinenArrayLista());

    }

    @Override
    public void marraztu() {

    }

    public Puntua[] getLauErpinenArrayLista() {
        Puntua[] erpinak = new Puntua[4];

        Puntua erpina1 = new Puntua(erpinBat.getX(), erpinBat.getY());
        Puntua erpina2 = new Puntua(erpinBat.getY(), erpinBat.getX());
        Puntua erpina3 = new Puntua(kontrakoErpina.getX(), kontrakoErpina.getY());
        Puntua erpina4 = new Puntua(kontrakoErpina.getY(), kontrakoErpina.getX());

        erpina1 = erpinak[0];
        erpina2 = erpinak[1];
        erpina3 = erpinak[2];
        erpina4 = erpinak[3];
        
        return erpinak;
    }

}
