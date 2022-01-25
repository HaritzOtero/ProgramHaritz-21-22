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
public class OddEvenTest {

    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = in.nextInt();

        if (isOdd(number) == true) {
            System.out.println(number + " 5is odd");
        } else {
            System.out.println(number + " is even");
        }
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

}
