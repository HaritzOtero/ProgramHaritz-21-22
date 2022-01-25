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
public class Hitza {
    private String hitza;
    private String kategoria;
    private int erabilitakoAldiak;
    private char[] asmatutakoa;

public Hitza(){
    hitzBatAukeratu();
    
    asmatutakoa = new char[hitza.length()];
    for (int i = 0; i < asmatutakoa.length; i++) {
        asmatutakoa[i]='-';
    }
}   
    public String getHitza() {
        return hitza;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getErabilitakoAldiak() {
        return erabilitakoAldiak;
    }

    public void setHitza(String hitza) {
        this.hitza = hitza;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public void setAsmatutakoa(char[] asmatutakoa) {
        this.asmatutakoa = asmatutakoa;
    }

    public char[] getAsmatutakoa() {
        return asmatutakoa;
    }
    
    public String getStrAsmatutakoa() {
        return new String(asmatutakoa);
    }
    
    public boolean egiaztatu(char hizkia){
        boolean aurkitua = false;
        
        for(int i = 0; i < hitza.length(); i++) {
            if(hitza.charAt(i) == hizkia){
            aurkitua = true;
            asmatutakoa[i] = hizkia;    
            
            }
        }
        return aurkitua;
    }
    /**
     * Hitza atributoari balio bat emango dio, gordeta dauzkagun hitzen zerrendatik bat ausaz hartuta. 
     */
    public void hitzBatAukeratu(){
        String[]hitzak = {"WATERPOLOA", "BIDEOJOKOAK", "IGERIKETA", "NEGUA", "GABONAK", "DORAEMON", "CAILLOU"};
        int posizioa = (int) (Math.random() * hitzak.length);
        hitza = hitzak[posizioa];
        
    }
}
