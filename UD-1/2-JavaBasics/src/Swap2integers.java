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
public class Swap2integers {
    public static void main(String[] args) {
    int number1, number2, temp;
  
       
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        number1 = in.nextInt();
        System.out.println("Enter the second integer: ");
        number2 = in.nextInt();
        
        temp = number1;
        number1 = number2;
        number2 = temp;
    
        System.out.println("After the swap, first integer is: ");
        System.out.print(number1 + ",");
        System.out.print("second integer is: ");
        System.out.print(number2 + ".");
         
        
        
    }
}
