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
public class ReverseInt {

    public static void main(String[] args) {

        int inNumber;   // to be input
        int inDigit;    // each digit

        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        inNumber = in.nextInt();
        // Extract and drop the "last" digit repeatably using a while-loop with modulus/divide operations
        System.out.println("The reverse is: ");
        while (inNumber > 0) {
            inDigit = inNumber % 10; // extract the "last" digit
            // Print this digit (which is extracted in reverse order)
            inNumber /= 10;          // drop "last" digit and repeat
          System.out.print(inDigit);
        
        }
       
      

      

    }

}
