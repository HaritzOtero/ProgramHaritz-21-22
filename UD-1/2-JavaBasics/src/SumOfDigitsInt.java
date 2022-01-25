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
public class SumOfDigitsInt {
    public static void main(String[] args) {
        
      int inNumber;   // to be input
      int inDigit;   
      int sum = 0;
       
      
    Scanner in = new Scanner(System.in);
     System.out.println("Enter a positive integer: ");
     inNumber = in.nextInt();
     System.out.println("The sum of all integers is: ");
      while (inNumber > 0) {
            inDigit = inNumber % 10;
            inNumber /= 10; 
          sum = sum + inDigit;
        
      
      }
      
       
        System.out.println(sum);
      
             
        
        
        
    }
  
}
