/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class SumOfSquares {
    
public static void main(String[] args) {

        int sum = 0;          // The accumulated sum, init to 0
        int average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int count = 0;
        int number = LOWERBOUND;

        for (number = LOWERBOUND; number <= UPPERBOUND; number++) {
            ++count;
        sum = sum + number * number;
        }
        
        
        
        
        System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);

        average = sum / count;

        System.out.println("The average is: " + average);
    }
}
