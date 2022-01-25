/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.laukienproiektua;

/**
 *
 * @author otero.haritz
 */
public class Dado {
    public static void main(String[] args) {
int min = 1;
int max = 6;


int n = (int) (Math.random() * (max - min)) + min;
        System.out.println(n);
    }
}
