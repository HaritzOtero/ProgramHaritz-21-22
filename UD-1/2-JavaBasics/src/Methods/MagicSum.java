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
public class MagicSum {

    public static void main(String[] args) {

        final int SENTINEL = -1;  // Terminating input
        int number;
        int magicSum = 0;
// Read first input to "seed" the while loop
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {  // Repeat until input is -1
            // Read next input. Repeat if the input is not the SENTINEL 
            // Take note that you need to repeat these codes!
            if (rep(number)){
                magicSum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();

        }
        System.out.println("The magic sum is: " + magicSum); 
    }

    

    public static boolean rep(int number) {
        boolean ochoSi = false;
        while (number > 0 && ochoSi == false) {

            if (number % 10 == 8) {
                ochoSi = true;
            } else {
                ochoSi = false;
            }

            number = number / 10;
        }
        return ochoSi;
    }
}
