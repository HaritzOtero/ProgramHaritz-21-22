/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exekutagarriak;

/**
 *
 * @author otero.haritz
 */
public class GastatuTaGastatu {
    public static void main(String[] args) {
         Account acc1 = new Account("3124-43", "Haritz", 1000);
         
         
         int ateratakoDirua = 0;
         int ateratzeak = 0;
         int reminder = 0;
         
         while(acc1.getBalance() >= 150){
              acc1.debit(150);
              ateratzeak++;
              ateratakoDirua = 150 * ateratzeak;
         }
         reminder = acc1.getBalance();
         
         System.out.println("Triste nago; " + "150 euro atera dut" + " " + ateratzeak + " alditan" + " eta orain "+ reminder +" euro besterik ez zait geratzen kontuan. :-(");
    }
    
}
