/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class RunningNumberSquareSum {
    
public static void main(String[] args) {
      final int LOWERBOUND = 1;      
      final int UPPERBOUND = 100;   
      int sum = 0;   
                     
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
        
         sum = sum + number * number;  
         number = number + 1;            
      }
     
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }
}

