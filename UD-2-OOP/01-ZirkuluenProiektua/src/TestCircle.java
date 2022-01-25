/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otero.haritz
 */
public class TestCircle {

    public static void main(String[] args) {   // Program entry point
        // Declare and Construct an instance of the Circle class called c1
        Circle c1 = new Circle(2.0, "blue");  // Use 3rd constructor
        System.out.println("The radius is: " + c1.getRadius());  // use dot operator to invoke member methods
        //The radius is: 2.0
        System.out.println("The color is: " + c1.getColor());
        //The color is: blue
        System.out.printf("The area is: %.2f%n", c1.getArea());
        //The area is: 12.57

        // Declare and Construct another instance of the Circle class called c2
        Circle c2 = new Circle(2.0);  // Use 2nd constructor
        System.out.println("The radius is: " + c2.getRadius());
        //The radius is: 2.0
        System.out.println("The color is: " + c2.getColor());
        //The color is: red
        System.out.printf("The area is: %.2f%n", c2.getArea());
        //The area is: 12.57

        // Declare and Construct yet another instance of the Circle class called c3
        Circle c3 = new Circle();  // Use 1st constructor
        System.out.println("The radius is: " + c3.getRadius());
        //The radius is: 1.0
        System.out.println("The color is: " + c3.getColor());
        //The color is: red
        System.out.printf("The area is: %.2f%n", c3.getArea());
        //The area is: 3.14

        Circle c4 = new Circle(5.00, "blue");
        System.out.println("The radius is: " + c4.getRadius());
        System.out.println("The color is: " + c4.getColor());
        System.out.println("The area is: " + c4.getArea());

        System.out.println("");
        System.out.println("Zirkulua   Erradioa    Kolorea    Azalera\n"
                + "==========================================\n"
                + "     c1     " + c1.getRadius() + "       " + c1.getColor() + "   " + c1.getArea() + "\n"
                + "     c2     " + c2.getRadius() + "       " + c2.getColor() + "    " + c2.getArea() + "\n"
                + "     c3     " + c3.getRadius() + "       " + c3.getColor() + "    " + c3.getArea() + "\n"
                + "     c4     " + c4.getRadius() + "       " + c4.getColor() + "   " + c4.getArea() + "");
        System.out.println("");
        System.out.println("Circle c1[Radius=" + c1.getRadius() + ", Color=" + c1.getColor() + "]");
        System.out.println("Circle c2[Radius=" + c2.getRadius() + ", Color=" + c2.getColor() + "]");
        System.out.println("Circle c3[Radius=" + c3.getRadius() + ", Color=" + c3.getColor() + "]");
        System.out.println("Circle c4[Radius=" + c4.getRadius() + ", Color=" + c4.getColor() + "]");
        System.out.println("");

        //10 aldiz  c1  handitu => inprimatu. Seigarrenean kolorea aldatu.
        for (int i = 1; i <= 10; i++) {
            c1.setRadius(c1.getRadius() + 1);
            System.out.println(c1);
            if (i == 3) {
                c1.setColor("magenta");
            }
        }

    }

}
