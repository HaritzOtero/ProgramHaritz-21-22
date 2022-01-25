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
public class UltimoDigitoFactorial {
   public static Scanner in;
    
    
public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for(int i = 0; i<numCasos;i++) {
            casoDePrueba();
        }
    }    

public static int faktoriala(int n){
    int faktorial = 1;
    int respuestaFinal = 0;
    for(int i = n; i > 1; i--){
       faktorial = faktorial * i;
       respuestaFinal = faktorial%10;
    }
    while(n > 5){
        respuestaFinal = 0;
    }
    
return respuestaFinal;
}

public static void casoDePrueba() {
    int n;
    
    n = in.nextInt();
    if(n>=5){
        System.out.println(0);
    }
    else{
    System.out.println(faktoriala(n) % 10);
    }                                                                                                                       



}
}
