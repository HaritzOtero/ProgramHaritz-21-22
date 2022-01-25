/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class CheckOddEven {
    
public static void main(String[] args) {  // Program entry point
      int number = 2;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if (number % 2 == 0 ) {
         System.out.println("it is a even number" );   // even number
      } else {
         System.out.println("it is a odd number" );   // odd number
      }
      System.out.println( "DONE" );
   }
}
