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
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    /**
     * Laukizuzenaren konstruktorea.
     * @param topLeft
     * @param bottomRight 
     */
    public MyRectangle (MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
        /**
         * Laukizuzenaren azalera kalkulatu.
         */
    public double getAzalera() {
        
        double zabalera = bottomRight.getX()- topLeft.getX();
        double altuera = topLeft.getY() - bottomRight.getY();
        return altuera * zabalera;

}
    /**
     * Laukizuzenaren perimetroa kalkulatu.
     * @return 
     */
    public double getPerimetroa() {
         double zabalera = bottomRight.getX()- topLeft.getX();
         double altuera = topLeft.getY() - bottomRight.getY();
         
         double perimetroa = altuera * 2 + zabalera * 2;
         
         return perimetroa;
    }

    
}
