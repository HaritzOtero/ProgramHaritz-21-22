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
public class Komikia extends Book {
    private boolean kolorea;

    public Komikia(boolean kolorea) {
        this.kolorea = kolorea;
    }

    public Komikia(String name, Author author, double price, int pages, boolean kolorea) {
        super(name, author, price, pages);
        this.kolorea = kolorea;
    }

    public void setKolorea(boolean kolorea) {
        this.kolorea = kolorea;
    }
    
    public boolean isKolorea(){
        return kolorea;        
    }
    
    @Override
    public String getNolakoa(){
        if(isKolorea() ==  false){
            return "zuri-beltza";
        }
        
        if(isKolorea() ==  false){
            return "koloretakoa";
        }
        return null;
    }

    @Override
    public String toString() {
        return "[Komikia]" + getName() +", " + getPrice() + ", " + getPages();
    }
}
