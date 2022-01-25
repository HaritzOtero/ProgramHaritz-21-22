
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
public class NumberPattern {
    public static void main(String[] args) {
        int size;
        
        Scanner in = new Scanner(System.in);
               System.out.print("Enter the size: ");
               size=in.nextInt();
        
         for (int alt = 1; alt <= size; alt++){
            
             for (int zab = 1; zab <= alt; zab++){
                 System.out.print(zab);
             }
             
             System.out.println();
           }
    }
}
    


