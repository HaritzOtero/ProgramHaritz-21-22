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
public class Zatikia {

    private int zenbakitzailea;
    private int izendatzailea;
   

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }

    public int getZenbakitzailea() {
        return zenbakitzailea;
    }

    public int getIzendatzailea() {
        return izendatzailea;
    }

    public void setZenbakitzailea(int zenba) {
        this.zenbakitzailea = zenbakitzailea;
    }

    public void setIzendatzailea(int izenda) {
        this.zenbakitzailea = izendatzailea;
    }

    @Override
    public String toString() {
        return " Zat{" + "zenbakitzailea" + zenbakitzailea + "izendatzailea" + izendatzailea + "}";
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        //return new Zatikia (zat1.zenbakitzailea*zat2.zenbakitzailea, zat1.izendatzailea*zat2.izendatzailea);
        Zatikia zat3 = new Zatikia(1, 1);
        zat3.zenbakitzailea = zat1.zenbakitzailea * zat2.zenbakitzailea;
        zat3.izendatzailea = zat1.izendatzailea * zat2.izendatzailea;
        zat3.sinplifikatu();
        return zat3;
    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {

        Zatikia zat3 = new Zatikia(1, 1);

        zat3.zenbakitzailea = (zat1.zenbakitzailea * zat2.izendatzailea) + (zat1.izendatzailea * zat2.zenbakitzailea);
        zat3.izendatzailea = (zat1.izendatzailea * zat2.izendatzailea);
        zat3.sinplifikatu();
        return zat3;
    }

    public void batu(Zatikia besteZatBat) {

        int besteZenbakitzailea = zenbakitzailea;
        int besteIzendatzailea = izendatzailea;

        zenbakitzailea = besteZenbakitzailea * besteZatBat.izendatzailea + besteZatBat.zenbakitzailea * besteIzendatzailea;
        System.out.println(zenbakitzailea);
        izendatzailea = besteIzendatzailea * besteZatBat.zenbakitzailea + besteZatBat.izendatzailea * besteZenbakitzailea;
        System.out.println(izendatzailea);

    }

    public void sinplifikatu() {

        int aux = izendatzailea;

        while ((aux <= izendatzailea) && (aux <= zenbakitzailea) && (aux > 0)) {
            if (izendatzailea % aux == 0 && zenbakitzailea % aux == 0) {
                setIzendatzailea(izendatzailea / aux);
                setZenbakitzailea(zenbakitzailea / aux);
            } else {
                aux--;
            }
        }

    }

    public double hamartarBaliokidea() {
        return (double) this.zenbakitzailea / this.izendatzailea;

    }

    public double isBiggerThan(Zatikia besteZatikiBat) {
        double batZatiki = (double) zenbakitzailea / izendatzailea;
        double biZatiki = (double) besteZatikiBat.getZenbakitzailea() / besteZatikiBat.getIzendatzailea();

        if (batZatiki > biZatiki) {
            return batZatiki;
        } else {
            return biZatiki;
        }

    }

    public String Zatikia(String zatIdatzia) {
       return null;
       
    }

   

    public boolean isBaliokidea(Zatikia besteZatikiBat) {
        
        double lehenengoZat = (double) zenbakitzailea / izendatzailea;
        double bigarrenZat = (double) besteZatikiBat.getZenbakitzailea() / besteZatikiBat.getIzendatzailea();
       if(lehenengoZat == bigarrenZat) {
           return true;
       }
       else{
           return false;
       }
    }}
                

    

