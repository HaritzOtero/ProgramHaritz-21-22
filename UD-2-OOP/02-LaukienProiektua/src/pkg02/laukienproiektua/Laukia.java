/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.laukienproiektua;

/**
 *
 * @author otero.haritz
 */
public class Laukia {

    private int zabalera = 5;
    private int altuera = 5;

    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zab, int alt) {
        zabalera = zab;
        altuera = alt;
    }
/**
 * Laukiaren zabalera finkatu.
 * @return altuera.
 */
    public int getZabalera() {
        return zabalera;
    }
/**
 * Laukiaren altuera finkatu.
 * @return altuera.
 */
    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        return altuera * zabalera;

    }

    public int getPerimetroa() {
        return altuera * 2 + zabalera * 2;
    }

    public void setZabalera(int zabaleraBerria) {
        this.zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {
        this.altuera = altueraBerria;
    }

    @Override
    public String toString() {
        return "Laukia[Altuera= " + altuera + ", Zabalera " + zabalera + "]";
    }

    public String getMota() {
        if (altuera > zabalera) {
            return "Bertikala";
        } else if (altuera < zabalera) {
            return "Horizontala";
        } else {
            return "Karratua";
        }
    }
/**
 * Laukiak marraztu egiten da, beteta.
 */
    public void marraztuBeteta() {
        for (int i = 1; i <= altuera; i++) {
            for (int j = 1; j <= zabalera; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
/**
 * Laukiak marraztu egiten da, hutsik.
 */
    public void marraztuHutsik() {

        for (int col = 1; col <= altuera; col++) {
            for (int row = 1; row <= zabalera; row++) {
                if (col == 1 || col == altuera) {
                    System.out.print("* ");
                } else if (row == 1 || row == zabalera) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
/**
 * 
 * @param l
 * @return Laukiak konparatu egiten ditu azaleraren arabera.
 */
    public boolean isBiggerThan(Laukia l) {
        if (getAzalera() > zabalera * altuera) {
            return true;
        } else {
            return false;
        }

    }
/**
 * 
 * @param lk 
 * @return lauki handiena.
 */
    public static Laukia getTheBiggest(Laukia[] lk) {
       return null;
                
     }    
        
   

}
