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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
/**
 * Triangeluaren konstruktorea
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 * @param x3
 * @param y3 
 */
public MyTriangle (int x1, int y1,int x2, int y2, int x3, int y3){
    this.v1 = new MyPoint(x1, y1);
    this.v2 = new MyPoint(x2, y2);
    this.v3 = new MyPoint(x3, y3);
}
/**
 *  Triangeluaren konstruktorea
 * @param v1
 * @param v2
 * @param v3 
 */
public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3){
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
}
/**
 * String moduan adierazi.
 * @return 
 */
@Override
public String toString() {
    return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
}
/**
 * Triangeluaren perimetroa kalkulatu.
 * @return 
 */
public double getPerimeter (){
    
    double perimetro = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    return perimetro;
}
/**
 * Triangelu mota adierazi
 * @return 
 */
public String getType (){

    String mota = null;
    
    if(v2.distance(v1) == v2.distance(v3) && v2.distance(v1) == v3.distance(v1)){
        mota = "ALDEKIDEA";
    }
    
    if(v2.distance(v1) != v2.distance(v3) || v2.distance(v1) != v3.distance(v1) || v3.distance(v1) != v2.distance(v3)){
        mota = "ESKALENOA";
    }
    
    if(v2.distance(v1) == v2.distance(v3) || v2.distance(v1) == v3.distance(v1) || v3.distance(v1) == v2.distance(v3)){
        mota = "ISOZELEA";
    }
    
    return mota;
}
/**
 * Lehen bertizea hartu
 * @return 
 */
    public MyPoint getV1() {
        return v1;
    }
/**
 * Bigarren bertizea hartu.
 * @return 
 */
    public MyPoint getV2() {
        return v2;
    }
/**
 * Hirugarren bertizea hartu.
 * @return 
 */
    public MyPoint getV3() {
        return v3;
    }
/**
 * Lehen bertizea finkatu.
 * @param v1 
 */
    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }
/**
 * Bigarren bertizea finkatu
 * @param v2 
 */
    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }
/**
 *  Hirugarren bertizea finkatu.
 * @param v3 
 */
    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }


}
