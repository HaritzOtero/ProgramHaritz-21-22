package ARRAYS;

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
public class GradesStatistics {
    public static void main(String[] args) {
    
    int sum = 0;
    final int numStudents;
    
    int maximum = 0;
    int minimum = 100;
    int[] marks;
    
      Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
             numStudents = in.nextInt();
             
      marks = new int[numStudents]; //agregar a array el numero de espacios introducidos por el usuario.
      
       if (marks.length > 0) { // para que 0 no entre
         
       for (int i = 0; i < marks.length; ++i) {  // printea en bucle los grados de los estudiantes desde el 1 hasta el num max de estudiantes.
        System.out.println("Enter the grade for student " + (i + 1) + ":");
       marks [i] = in.nextInt();
       }
       }
       for( int i = 0; i< numStudents; i++) { // formulas max, min sum average.
              sum = sum + marks[i];
        
            if (maximum < marks[i]){
                maximum = marks[i];
            }
            
            if (minimum > marks[i]) {
                minimum = marks[i];
            }
       }
    
          System.out.println("The average: " + (double)sum / (double)numStudents);
          System.out.println("The minimum is: " + minimum);
          System.out.println("The maximum is: " + maximum);
       
    }
       }

