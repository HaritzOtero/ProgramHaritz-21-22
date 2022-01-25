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
public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    
    /**
     * Zirkuluaren konstruktorea.
     * @param x
     * @param y
     * @param radius 
     */
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    /**
     * Zirkuluen arteko distantzia kalkulatzeko.
     * @param another
     * @return 
     */
    public double distance(MyCircle another) {
        
        return this.center.distance(another.center);
    }
/**
 * Puntu bat zirkulu baten barruan dagoen ala ez ateratzen du
 * @param puntua
 * @return 
 */
    public boolean isInside(MyPoint puntua) {
        
        if (center.distance(puntua) > radius) {
            return false;
        } else {

            return true;
        }
    }
    /**
     * Zirkuluaren azalera.
     * @return 
     */
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
    /**
     * Zirkuluaren zentroa.
     * @return 
     */
    public MyPoint getCenter() {
        return center;
    }
    /**
     * Zirkuluaren zentroa X
     * @return 
     */
    public int getCenterX() {
        return this.center.getX();
    }
    /**
     * Zirkuluaren zentroaren XY
     * @return 
     */
    public int[] getCenterXY() {
        int[] xy = {center.getX(), center.getY()};
        return xy;
    }
    /**
     * Zirkuluaren zirkunferentzia kalkulatu.
     * @return 
     */
    public double getCircumference() {
        double circumference = 2 * Math.PI * radius * radius;
        return circumference;
    }
    /**
     * Zirkuluaren erradioa lortu.
     * @return 
     */
    public int getRadius() {
        return radius;
    }
/**
 * Zirkuluaren erradioa finkatu
 * @param radius 
 */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    /**
     * Zirkuluaren zentroa finkatu.
     * @param center 
     */
    public void setCenter(MyPoint center) {
        this.center = center;

    }
    /**
     * Zirkuluaren zentroaren X
     * @param x 
     */
    public void setCenterX(int x) {
        this.center.setX(x);
    }

 /**
  * Zirkuluaren zentroaren x eta y finkatu
  * @param x
  * @param y 
  */
    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.setCenterY(y);
    }
    /**
     * Set zentroaren Y
     * @param y 
     */
    public void setCenterY(int y) {
        this.setCenterY(y);
    }
    /**
     * Stringera bihirtu.
     * @return 
     */
    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }

    
}
