/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class SumAverageRunningInt {
    
public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      int count = 0;
      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
      
         count = count + 1;
      }
      
      
      // Compute average in double. Beware that int / int produces int!
      
      // Print sum and average
      System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
       
      average = (double) sum / count;  
      
       System.out.println("The average is: " + average );
    }
}
