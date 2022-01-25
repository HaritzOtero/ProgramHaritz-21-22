/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class Product1ToN {

    public static void main(String[] args) {
        int number;
        int product = 1;      // The accumulated product, init to 1
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        int sum = 0;
        for (number = LOWERBOUND; number <= UPPERBOUND; number++) {
            
        product = number * product;    
         
        }
        
        System.out.println("The product of 1 to 10 is " + product);
    
    
    }
}




