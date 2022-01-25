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
public class Langilea {

    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    private Zatikia lanaldia = new  Zatikia(1,1);

    public Langilea(int id, String izena, String abizena, double soldata) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
    }

    public Zatikia getLanaldia() {
        return lanaldia;
    }

    public void setLanaldia(Zatikia lanaldia) {
        if(lanaldia.hamartarBaliokidea()>0 && lanaldia.hamartarBaliokidea()<1){
            this.lanaldia = lanaldia;
        }
        
    }
    

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getIzenOsoa() {
        return izena + abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public double getUrtekoSoldata() {
        return soldata * 12;
    }

    public void getSoldata(double soldata) {

    }

    public double soldataIgo(int portzentaia) {
        soldata = (soldata * portzentaia / 100) + soldata;
        return soldata;
    }

    @Override
    public String toString() {
        return "Langilea[Id=" + id + ", " + " Izena= " + izena + " " + abizena + ", Soldata= " + soldata + "]";

    }

    public static Langilea[] nireHamarLagunLangile() {
        Langilea[] lagunak = new Langilea[10];
        lagunak[0] = new Langilea(1, "Raul", "Parra", 1);
        lagunak[1] = new Langilea(2, "Ander", "Gallastegui", 2100);
        lagunak[2] = new Langilea(3, "Rosa", "Melano", 1900);
        lagunak[3] = new Langilea(4, "Elver", "Galarga", 1850);
        lagunak[4] = new Langilea(5, "Unama", "Madita", 1970);
        lagunak[5] = new Langilea(6, "Tomas", "Turbado", 2500);
        lagunak[6] = new Langilea(7, "Elena", "Nito", 2200);
        lagunak[7] = new Langilea(8, "Lucas", "Carmela", 1050);
        lagunak[8] = new Langilea(9, "Pepe", "Roni", 5000);
        lagunak[9] = new Langilea(10, "Ana", "Botieso", 3000);
        return lagunak;
    }

    public static Langilea bilatu(String izena, Langilea[] lagunak) {
       // boolean bilatuta = false;

        int i = 0;

        while ( i < lagunak.length) {
            if (lagunak[i].getIzena().equals(izena)) {
                return  lagunak[i];
            } else {
                i++;
            }
        }
        return null;
        

    }
}
