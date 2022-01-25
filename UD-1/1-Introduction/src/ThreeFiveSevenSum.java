/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class ThreeFiveSevenSum {

    public static void main(String[] args) {
        final int LOWERBOUND = 1; // numero minimo
        final int UPPERBOUND = 1000; //numero mas alto
        int sumEven = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {

            if ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0) && (number % 15 != 0 || number % 21 != 0 || number % 35 != 0 || number % 105 != 0)) { 
                sumEven = sumEven + number; 
            }
             ++number;
             
        }
        System.out.println();   
        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);

    }
}
