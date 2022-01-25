/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nireTableroa;

import console.oop.Seed;
import static java.lang.Integer.parseInt;

/**
 *
 * @author otero.haritz
 */
public class Board {  // save as Board.java
   // Named-constants for the dimensions
   public static  int ROWS;
   public static  int COLS;
 
   // package access
   Cell[][] cells;  // a board composes of ROWS-by-COLS Cell instances
   int currentRow, currentCol;  // the current seed's row and column
 
   /** Constructor to initialize the game board
     * @param row
     * @param col */
   public Board(int rows,int cols) {
      cells = new Cell[rows][cols];  // allocate the array
      for (int row = 0; row < rows; ++row) {
         for (int col = 0; col < cols; ++col) {
            cells[row][col] = new Cell(row, col); // allocate element of the array
         }
      }
   }
 
   /** Initialize (or re-initialize) the contents of the game board */
   public void init() {
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            cells[row][col].clear();  // clear the cell content
         }
      }
   }
 
   /** Return true if it is a draw (i.e., no more EMPTY cell) */
   
 
   /** Return true if the player with "theSeed" has won after placing at
       (currentRow, currentCol) */
   
 
   /** Paint itself */
   public void paint() {
      for (int row = 0; row < cells.length; ++row) {
         for (int col = 0; col < cells.length; ++col) {
            cells[row][col].paint();   // each cell paints itself
            if (col < cells.length - 1) System.out.print("|");
         }
         System.out.println();
        for (int col=0;col<cells[row].length ;col++)
              System.out.print("---");
            }
         }
      }
   


