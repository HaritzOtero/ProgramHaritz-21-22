/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author otero.haritz
 */
public class Kutxa extends Laukizuzena {
    private int altuera;

    public Kutxa(Puntua erpina, Puntua kontrakoErpina,int altuera) {
        super(erpina, kontrakoErpina);
        this.altuera = altuera;
    }

    public int getAltuera() {
        return altuera;
    }
    
public boolean isHandiagoa(Kutxa besteKutxaBat){
       int Bolumena = (getErpinBat().getX()-getKontrakoErpina().getX()) * (getErpinBat().getX() - getKontrakoErpina().getY()) * altuera;
       int besteBolumena = (besteKutxaBat.getErpinBat().getX() - besteKutxaBat.getKontrakoErpina().getX()) *(besteKutxaBat.getErpinBat().getY() - besteKutxaBat.getKontrakoErpina().getY()) * besteKutxaBat.altuera;
       
       return Bolumena > besteBolumena;
    }
    
    public int getBolumena(){
        int Bolumena = (getErpinBat().getX() -getKontrakoErpina().getX()) * (getErpinBat().getX()  - getKontrakoErpina().getY()) * altuera;
        return Bolumena;
    }
    
    @Override
    public void marraztu() {
        System.out.println(this + "dituen kutxa GUI batean marraztu da.");
    }
    
    @Override
    public String toString(){
        return "Oinarria: " + super.toString() + " eta altuera: " + altuera;
    }
    
    public String getErtzenLuzera() {
        int ertza1;
        int ertza2;
        int ertza3;
        
        ertza1 = getKontrakoErpina().getX() - getErpinBat().getX();
        ertza2 = getKontrakoErpina().getY() - getErpinBat().getY();
        ertza3 = altuera;
        
        return "Lehenengo ertzaren luzera: " + ertza1 + "u Bigarren ertzaren luzera: " + ertza2 + "u Hirugarren ertzaren luzera: " + ertza3 + "u";
               
        
        
    }
    
    public static Kutxa handiena(Kutxa[] kutxak){
        Kutxa handiena = kutxak[0];
        for (int i = 0; i < kutxak.length; i++) {
            if(handiena.getBolumena() < kutxak[i].getBolumena()){
                handiena = kutxak[i];
            }
        }
        return handiena;
    }
    
    
    public void Marraztu(Graphics2D g){
        
    }
}
