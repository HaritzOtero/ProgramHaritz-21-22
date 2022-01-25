/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class RunningNumberProduct {
    
public static void main(String[] args) {
      final int LOWERBOUND = 1;  //numero del 1    
      final int UPPERBOUND = 10; // al 10
      int product = 1;// ctr + R para cambiar todas las variables "product"   
                     
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
        
         product = product * number;  
         number = number + 1;            
      }
     
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
   }
}
