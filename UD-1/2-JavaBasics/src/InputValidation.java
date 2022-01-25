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
public class InputValidation {

    public static void main(String[] args) {

        int numberIn;      // to be input
        boolean isValid;   // boolean flag to control the loop
        isValid = false;
        
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number between 0-10 or 90-100: ");
            numberIn = in.nextInt();
            // Validate input by setting the boolean flag accordingly
            if (numberIn >= 0 &&  numberIn<=10 || numberIn >= 90 &&  numberIn <= 100) {
                isValid = true;
                
            } else {
                System.out.println("Invalid input, try again...");  // Print error message and repeat
            }
            } while (!isValid);
         System.out.println("You have entered number: " + numberIn);;


               }

}
