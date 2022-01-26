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
public class TestEquals {
    public static void main(String[] args) {
        Circle c1 = new Circle( 5, "beltza");
        Circle c2 = new Circle(5, "beltza");
        
        System.out.println(c1.equals(c2));
        
    }
    
    
    
    
}
