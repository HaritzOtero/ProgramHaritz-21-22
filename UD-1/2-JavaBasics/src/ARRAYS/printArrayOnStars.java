package ARRAYS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author otero.haritz
 */
public class printArrayOnStars {
    public static void main(String[] args) {
        
     final int NUM_ITEMS;
      int[] items ;  // Declare array name, to be allocated after NUM_ITEMS is known
    
        Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of items: ");
             NUM_ITEMS = in.nextInt();
           
           

      // Allocate the array
      items = new int[NUM_ITEMS];

      // Prompt and read the items into the "int" array, if array length > 0
      if (items.length > 0) {
          System.out.println("Enter the value of all items (separated by space): ");
         for (int i = 0; i < items.length; ++i) {  // Read all items
           items [i] = in.nextInt();
         }
      }

      


// Print array in "index: number of stars" using a nested-loop
      // Take note that rows are the array indexes and columns are the value in that index
      for (int idx = 0; idx < items.length; ++idx) {  // row
         System.out.print(idx + ": ");
         // Print value as the number of stars
         for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
            System.out.print("*");
         }
          System.out.print("(" + items [idx] + ")"); 
         System.out.println("");
                 
      }
    }
}
      
        
       


    
          

           
    
     
            
            
     
    
 
        
            

