/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class CylinderComputation {
    public static void main(String[] args) {
        double radius, heigth, surfaceArea, baseArea, volume;
        radius = 3;
        heigth = 1;
        final double PI = 3.1415;
        baseArea = (PI * radius * radius);
        surfaceArea = (radius * heigth) + (baseArea * 2);
        volume = baseArea * heigth;
        
        System.out.println("The surface area is:");
        System.out.println(surfaceArea);
        System.out.println("the base area is:");
        System.out.println(baseArea);
        System.out.println("The volume is:");
        System.out.println(volume);
        
        
       
         
    }
}
