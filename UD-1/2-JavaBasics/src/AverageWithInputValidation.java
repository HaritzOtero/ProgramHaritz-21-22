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
public class AverageWithInputValidation {

    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;

        // Declare variables
        int numberIn;
        boolean isValid;   // boolean flag to control the input validation loop
        int sum = 0;
        double average;
        isValid = true;

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            // Prompt user for mark with input validation

            isValid = false;   // reset assuming input is not valid
            do {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the mark (0-100) of student" +studentNo+ ": ");
                numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                }
                else {
                    System.out.println("Invalid input, try again...");
                    isValid = false;
                }

            } while (!isValid);

            sum += numberIn;
        }
        average = sum / 3;

        System.out.println("Average is: " + average );
    }
}
