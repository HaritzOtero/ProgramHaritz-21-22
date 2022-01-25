package ARRAYS;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class PrintArray {
    public static void main(String[] args) {
        
        
 
            


// Declare variables
      final int NUM_ITEMS;
      int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known
      

      // Prompt for for the number of items and read the input as "int"
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

      // Print array contents, need to handle first item and subsequent items differently
        System.out.print("[");
      for (int i = 0; i < items.length; ++i) {
         if (i == 0) {
             System.out.print(items [i]);
           
         } else {
            // Print the subsequent items with a leading commas
             System.out.print("," + items [i]);
         }
         // or, using a one liner
         //System.out.print((i == 0) ? ...... : ......);
      }
        System.out.print("]");
    }
    
}
