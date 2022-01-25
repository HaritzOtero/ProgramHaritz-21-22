/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nireTableroa;

import java.util.Scanner;
    
/**
 *
 * @author otero.haritz
 */
public class Main {
    private static Board board;
    private static Scanner in = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("Eman tableroaren neurriak: ");
        int rowKop = in.nextInt();
        int colKop = in.nextInt();
       
        board = new Board(rowKop, colKop);
        board.paint();
        
    }
}
