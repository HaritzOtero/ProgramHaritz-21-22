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
public class SphereComputation {
    public static void main(String[] args) {
       
    
// Declare variables
      double radius, diameter, surfaceArea, volume;  // 
      

      // Prompt and read inputs as "double"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double

      // Compute in "double"
      surfaceArea = 4 * Math.PI * radius * radius;
     
      volume = 4 /3 * Math.PI * radius * radius * radius;

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
     
      System.out.printf("Surface area is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);

    }
}
