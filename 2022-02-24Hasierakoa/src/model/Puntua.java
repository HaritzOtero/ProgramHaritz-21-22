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
public class Puntua implements Marrazgarria{

    private int x;
    private int y;
    private static int sortutakoPuntuak;

    public Puntua(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Puntua() {
        sortutakoPuntuak++;
    }

   

    
    

    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getSortutakoPuntuak() {
        return sortutakoPuntuak;
    }

    public static void setSortutakoPuntuak(int sortutakoPuntuak) {
        Puntua.sortutakoPuntuak = sortutakoPuntuak;
    }

    public boolean isEzkerreragoThan(Puntua bestePuntuBat) {
        
        if(bestePuntuBat.getX() > x){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puntua other = (Puntua) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    public void marraztu() {
        System.out.println("(" + getX() + ", " + getY() + ") Puntua GUI baten marraztua izan da.");
        sortutakoPuntuak++;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    
}