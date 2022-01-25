/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class RectangleComputation {

    public static void main(String[] args) {

        double length, width, area, perimeter;

        length = 2;
        width = 1;
        perimeter = (length * 2) + (width * 2);
        area = length * width;

        System.out.println("The area of the rectangle is:");
        System.out.println(area);
        System.out.println("The perimeter of the rectangle is:");
        System.out.println(perimeter);

    }

}
