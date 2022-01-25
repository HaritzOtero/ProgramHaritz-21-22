/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.util.Scanner;
/**
 *
 * @author otero.haritz
 */
public class Exponent {
    public static void main(String[] args) {
        
        // Declare variables
      int exp;    // exponent (non-negative integer)
      int base;   // base (integer)
      
      // Prompt and read exponent and base
      Scanner in = new Scanner(System.in);
            System.out.println("Enter the base: ");
             base = in.nextInt();
       System.out.println("Enter the exponent: ");
             exp = in.nextInt();
      
            

// Print result
      System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
   }

   // Returns "base" raised to the power "exp"
   public static int exponent(int base, int exp) {
      int product = 1;   // resulting product

      // Multiply product and base for exp number of times
      for (int i = 1;i<=exp;i++) {
         product *= base;
      }

      return product;
    }
}
