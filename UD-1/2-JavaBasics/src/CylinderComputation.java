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
public class CylinderComputation {
   
    public static void main(String[] args) {
       
    
// Declare variables
      double radius, height, baseArea, surfaceArea, volume;  // 
      

      // Prompt and read inputs as "double"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double
      System.out.println("Enter the height: ");
      height = in.nextDouble();
      // Compute in "double"
     baseArea = Math.PI * radius * radius;
    surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
    volume = baseArea * height;
      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("Base area is: %.2f%n", baseArea);
      System.out.printf("Surface area is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);

    }
}

