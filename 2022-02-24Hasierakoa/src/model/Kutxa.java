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
public class Kutxa extends Laukizuzena {
    private int altuera;

    public Kutxa(int altuera, Puntua erpina, Puntua kontrakoErpina) {
        super(erpina, kontrakoErpina);
        this.altuera = altuera;
    }

    public int getAltuera() {
        return altuera;
    }
    
    public boolean isHandiagoa (Kutxa besteKutxaBat){
        double kutxa1Vol;
        double kutxa2Vol;
        
        kutxa1Vol = ((getErpinBat().getX() - getKontrakoErpina().getX())* (getErpinBat().getY()- getKontrakoErpina().getY()))* altuera;
        kutxa2Vol =((besteKutxaBat.getErpinBat().getX() - besteKutxaBat.getKontrakoErpina().getX())*(besteKutxaBat.getErpinBat().getY()-besteKutxaBat.getKontrakoErpina().getY())*besteKutxaBat.getAltuera());
        
        if(kutxa1Vol > kutxa2Vol){
            return true;
        }else{
            return false;
        }
    } 
    
    @Override
    public void marraztu() {
        
    }
}
