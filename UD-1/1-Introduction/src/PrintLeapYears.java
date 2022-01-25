/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class PrintLeapYears {
     public static void main(String[] args) {
      final int LOWERBOUND = 999;
      final int UPPERBOUND = 2010;
      
      int count = 0;
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            
         if ((number % 4 == 0 || number  % 400 == 0 )&&(number % 100 != 0 )) { 
             count = count + 1;
             
             System.out.println(number);
             
         }
             ++number;
            
      }
         
          
          System.out.println("The count between AD999 and AD2010 leap years is: ");
          System.out.println(count);
        }
     }

