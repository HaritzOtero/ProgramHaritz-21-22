/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author otero.haritz
 */
public class Partida {
    private LocalDate data;
    private String aurkaria;
    private ArrayList<Futbolista> txartelak;

    public Partida(LocalDate data, String aurkaria, ArrayList<Futbolista> txartelak) {
        this.data = data;
        this.aurkaria = aurkaria;
        this.txartelak = txartelak;
    }

    public LocalDate getData() {
        return data;
    }

    public String getAurkaria() {
        return aurkaria;
    }

    public ArrayList<Futbolista> getTxartelak() {
        return txartelak;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }

    public void setTxartelak(ArrayList<Futbolista> txartelak) {
        this.txartelak = txartelak;
    }
    public void txartelaJarri(Futbolista f){
        txartelak.add(f);
    }
}
