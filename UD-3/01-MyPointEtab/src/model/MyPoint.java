package model;

import java.lang.Math;


/**
 *
 * @author otero.haritz
 */
public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }
    
    /**
     * Distantzia kalkulatu
     * @return 
     */
    public double distance() {
         double distancia;
        
        distancia = Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2));
        
        return distancia;
        
    }
    public double distance(MyPoint another){
       double distancia;
        
       
        
        distancia = Math.sqrt(Math.pow((x - another.getX()), 2) + Math.pow((y - another.getY()), 2));
      
        
        return distancia;
        
    }
    /**
     * Distantzia hartu.
     * @param y
     * @param x
     * @return 
     */
    public double getDistance(int y, int x){
        double distancia;
        x = this.x;
        y = this.y;
        distancia = Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2));
        
        return distancia;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int[]getXY() {
        int[]xy = {x , y};
        return xy;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int y,int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "MyPoint{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
