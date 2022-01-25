package STRING;


import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class ReverseString {
    public static void main(String[] args) {
        

    
// Define variables
      String inStr;        // input String
      int inStrLen;        // length of the input String
      int charIdx;

      // Prompt and read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      inStr = in.next();   // use next() to read a String
      inStrLen = inStr.length();
   
      // Use inStr.charAt(index) in a loop to extract each character
      // The String's index begins at 0 from the left.
      // Process the String from the right
      for (charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
            // charIdx = inStrLen-1, inStrLen-2, ... ,0
          inStr.charAt(charIdx);
          
          System.out.print(inStr.charAt(charIdx) );
          
 
          }
      }
}
 
      