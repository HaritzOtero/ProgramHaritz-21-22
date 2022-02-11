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
public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList <Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.bezeroa = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public void setProduktuak(ArrayList<Produktua> produktuak) {
        this.produktuak = produktuak;
    }

    public void setUnitateak(ArrayList<Integer> unitateak) {
        this.unitateak = unitateak;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }
    
    public String getKodea() {
        return String.valueOf(kodea);
    }

    public LocalDate getData() {
        return data;
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public ArrayList<Produktua> getProduktuak() {
        return produktuak;
    }

    public ArrayList<Integer> getUnitateak() {
        return unitateak;
    }

    public double getGuztira() {
        return guztira;
    }
    
    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + getStrKodea() + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }

    public String toStringLuzea(){
        return "EROSKETA \n"
                + "     Kodea: " + getKodea() + "\n"
                + "     Bezeroa: " + getBezeroa() + "\n"
                + "     Izena: " + bezeroa.getIzena() + "\n"
                + "     Helbidea: " + bezeroa.getHelbidea() + "\n"
                + "     1.produktua: " + getProduktuak() + "\n"
                + "             GUZTIRA: " + getGuztira();
    }
    
    public boolean guztiraEgiaztatu(){
        return false;
        
    }
    
    public String getStrKodea() {
        return String.valueOf(kodea);
    }
}
