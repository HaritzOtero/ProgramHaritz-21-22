/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class PrintDayInWord {
    public static void main(String[] args) {
        
    int dayNumber = 8;  // Set the value of "number" here!
 
     
      if ( dayNumber == 1) 
         System.out.println("MONDAY");
      else if ( dayNumber == 2 ) {
         System.out.println("TUESDAY");
      }  else if (dayNumber == 3 ) {
          System.out.println("WEDNESDAY"); 
      }
         else if (dayNumber == 4 ) {
          System.out.println("THURSDAY");
      }
      
          else if (dayNumber == 5 ) {
          System.out.println("FRIDAY");
          }
      
          else if (dayNumber == 6 ) {
          System.out.println("SATURDAY");
          }
          
          else if (dayNumber == 7 ) {
          System.out.println("SUNDAY");
          }
          else {
              System.out.println("Not a valid day number");
          }
    }
}
