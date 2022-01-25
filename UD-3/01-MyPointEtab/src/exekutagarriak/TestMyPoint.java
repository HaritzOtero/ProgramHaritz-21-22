/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.MyPoint;
import java.util.ArrayList;

/**
 *
 * @author otero.haritz
 */
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1;
        
        p1 = new MyPoint();
        p1.setXY(2, 1);
        
        MyPoint p0;
        
        p0 = new MyPoint();
        p0.setXY(0, 0);
        
        MyPoint p3;
        
        p3 = new MyPoint();
        p3.setXY(4, 0);
        
        System.out.println("a) Distantziak jatorriraino");
        System.out.println("P1 koordenatu jatorrirako distantzia: " + p1.getDistance(0, 0));
        System.out.println("P1 koordenatu jatorrirako distantzia: " + p0.getDistance(0, 0));
        System.out.println("P1 koordenatu jatorrirako distantzia: " + p3.getDistance(0, 0));
        
        System.out.println("b) Distantziak euren artean");
        System.out.println("p0tik p1ra: " + p0.distance(p1));
        System.out.println("p0tik p2ra: "+ p0.distance(p3));
        System.out.println("p1tik p2ra: "+ p1.distance(p3));
        
        System.out.println("c) Puntuen arraya: ");
        
        
        
        System.out.println("d) Puntuen arraya automatikoki: ");
       MyPoint [] puntuak = new MyPoint [10];
         for (int i = 0; i<10; i++) {
            puntuak[i] = new MyPoint (i +1 , i + 1);
        }
        System.out.println(puntuak);
        
       System.out.println("e) 100 puntuko ArrayLista");
       ArrayList <MyPoint> puntos = new ArrayList <MyPoint>();
       for (int i = 0;  i < 100; i++){
           puntos.add(new MyPoint (i , i));
       }
        System.out.println(puntos);
        
        System.out.println(" f) Sortu ausazko 5 puntuko sorta (0-9 tartean). java.util.Random klasearen .nextInt() metodoa erabili dezakezu.");
        
        ArrayList <MyPoint> punto = new ArrayList <MyPoint>();
        for (int i = 0; i < 5; i++){
            punto.add(new MyPoint ((int)(Math.random()* 10),(int)(Math.random()*10)));
        }
        
        System.out.println(punto);
         
        
      
       
        
        
        
        
    }
}
