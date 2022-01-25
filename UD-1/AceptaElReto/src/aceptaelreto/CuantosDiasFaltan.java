/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;
import java.util.Scanner;
/**
 *
 * @author otero.haritz
 */
public class CuantosDiasFaltan {
      public static Scanner in;
    public static void main(String[] args) {
       
        int numCasos;
        int dia;
        int mes;
        int diasquefaltan;
        int diasrestantes = 0;
        final int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        dia = in.nextInt();
        mes = in.nextInt();
        diasrestantes = (meses[mes - 1] - dia);
   
        for(int i = mes; i<meses.length;i++){
          
                
    }
    }
}
