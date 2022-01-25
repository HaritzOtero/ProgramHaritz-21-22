/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class SumOfOddAndEvenNumbers {

    public static void main(String[] args) {
        // Define variables

        final int UPPERBOUND = 100;
        final int LOWERBOUND = 1;

        int sumOdd = 0;   // Accumulating sum of odd numbers
        int sumEven = 0;   // Accumulating sum of even numbers
        int absDiff;       // Absolute difference between the two sums

        // Compute sums
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 != 0) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        // Compute Absolute Difference
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
            System.out.println("The abs.diff is:");
            System.out.println(absDiff);
        } else {
            absDiff = sumEven - sumOdd;
            System.out.println("The abs.diff is:");
            System.out.println(absDiff);

        }

        System.out.println("The sum off odd number is:");
        System.out.println(sumOdd);
        System.out.println("The sum of even number is:");
        System.out.println(sumEven);

    }
}
