/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;
import java.util.Scanner;
/**
 *
 * @author otero.haritz
 */
public class ZenbakiaSailkatu {
    public static void main(String[] args) {
        int zenbakia;
         
        
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbaki oso positibo bat: ");
        zenbakia = in.nextInt();
        
        while (zenbakia <= 0){
        System.out.println("Zenbaki ezegokia");
        System.out.print("Sartu zenbaki oso positibo bat: ");
        zenbakia = in.nextInt();
        }
        
        if (zenbakia > 0 && zenbakia % 2 == 0  && zenbakia > 100) {
        System.out.println("Sartu duzun zenbaki handia bikoitia da.");
    }
        else if (zenbakia > 0 && zenbakia % 2 == 0 && zenbakia <= 100) {
        System.out.println("Sartu duzun zenbaki txikia bikoitia da.");
                }

        else if (zenbakia > 0 && zenbakia % 2 != 0 && zenbakia <= 100) {
        System.out.println("Sartu duxun zenbaki txikia bakoitia da");
        }
    
        else if (zenbakia > 0 && zenbakia % 2 != 0 && zenbakia > 100) {
        System.out.println("Sartu duxun zenbaki handia bakoitia da");
        }
    
    
    }   
        
    }
