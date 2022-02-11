/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author otero.haritz
 */
public class Produktua {

    private char[] kodea;
    private String izena;
    private double prezioa;

    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = new char[kodea.length()];
        this.izena = izena;
        this.prezioa = prezioa;
        for (int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }

    }

    @Override
    public String toString() {
        return getStrKodea() + ", " + getIzena() + ", " + getPrezioa() ;
    }

    public char[] getKodea() {
        return kodea;
    }
    
    public String getStrKodea() {
        return String.valueOf(kodea);
    }

    public String getIzena() {
        return izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }

}
