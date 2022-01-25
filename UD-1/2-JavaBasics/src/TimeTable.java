
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
public class TimeTable {
    
public static void main(String[] args) {
        int tableSize = 9;
        Scanner in = new Scanner(System.in);
               System.out.print("Enter the size: ");
               tableSize=in.nextInt();
        printMultiplicationTable(tableSize);
    }
     
    public static void printMultiplicationTable(int tableSize) {
        // first print the top header row
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("   *  ------------------------------------------");
         
        for(int i = 1 ;i<=tableSize;i++) {
            // print left most column first
            System.out.format("%4d |",i);
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
     
}
