
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parra.raul
 */
public class SquarePattern {

        public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
               System.out.print("Enter the size: ");
               size=in.nextInt();
         // Outer loop to print each of the rows
            // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
            System.out.print( "#" );   // Use print() without newline inside the inner loop
         }
         // Print a newline after printing all the columns
         System.out.println();
      }
    }

}
