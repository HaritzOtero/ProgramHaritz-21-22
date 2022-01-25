/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;
import model.MyCircle;
import model.MyPoint;
import model.MyRectangle;
import model.MyTriangle;

/**
 *
 * @author otero.haritz
 */
public class MENUA {
 Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Zirkuluen azalaera konparatu");
            
            System.out.println("2.- Laukizuzenen azalerak konparatu");
            System.out.println("3.- Zirkuluen perimetroa konparatu");
            System.out.println("4.- Triangeluen perimetroa konparatu");
            System.out.println("5.- Laukizuzenen perimetroa konparatu");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("Bi zirkuluen azaleren konparaketa:");
                    ZirkuluaAzalera();
                    break;
                
                case 2:
                    System.out.println("Bi laukizuzenen azaleren konparaketa: ");
                    LaukizauzenaAzalera();
                    break;
                case 3:
                    System.out.println("Bi zirkuluen perimetroen konparaketa");
                    ZirkuluaPerimetroa();
                    break;
                case 4:
                    System.out.println("Bi triangeluen perimetroen konparaketa");
                    TriangeluaPerimetroa();
                    break;
                case 5:
                    System.out.println("Bi laukizuzenen perimetroen konparaketa");
                    LaukizauzenaPerimetroa();
                    break;
                
                default:
                    System.out.println("Aukera okerra, sartu zenbaki egokia.");
            }
            
        } while (aukera != 5);
    }
    
    public static void ZirkuluaAzalera(){
        Scanner in = new Scanner(System.in);
        int zirk1X = 0, zirk1Y = 0, zirk2X = 0, zirk2Y = 0, zirk1erradio = 0, zirk2erradio = 0;
        System.out.println("Sartu lehen zirkuluaren zentroaren X, y eta zirkuluaren erradioa orden egokian: ");
        zirk1X = in.nextInt();
        zirk1Y = in.nextInt();
        zirk1erradio = in.nextInt();
        
        System.out.println("Sartu bigarren zirkuluaren zentroaren X, y eta zirkuluaren erradioa orden egokian: ");
        zirk2X = in.nextInt();
        zirk2Y = in.nextInt();
        zirk2erradio = in.nextInt();
      
        MyCircle zirkulu2 = new MyCircle(zirk1X,zirk1Y,zirk1erradio);
        MyCircle zirkulu1 = new MyCircle(zirk2X,zirk2Y,zirk2erradio);
        
        if(zirkulu1.getArea()>zirkulu2.getArea()){
            System.out.println("Lehenengo zorkulua handiagoa da, lehen zirkuluaren azalera: " + zirkulu1.getArea() + " Bigarren zirkuluaren azalera: " + zirkulu2.getArea());
        }
        
        if(zirkulu1.getArea()<zirkulu2.getArea()){
            System.out.println("Bigarren zorkulua handiagoa da, lehen zirkuluaren azalera: " + zirkulu1.getArea() + " Bigarren zirkuluaren azalera: " + zirkulu2.getArea());
        }
        
        if(zirkulu1.getArea() == zirkulu2.getArea()){
            System.out.println("Biak azalera berdina dute: " + zirkulu1.getArea());
        }
    }
    
    public static void LaukizauzenaAzalera(){
        Scanner in = new Scanner(System.in);
        int L1point1X = 0, L1point1Y = 0, L1point2X = 0, L1point2Y = 0,L2point1X = 0, L2point1Y = 0, L2point2X = 0, L2point2Y = 0;
        System.out.println("Sartu lehen laukizuzenaren goi-ezkerreko puntuen X ");
        L1point1X = in.nextInt();
        System.out.println("Sartu lehen laukizuzenaren goi-ezkerreko puntuen Y ");
        L1point1Y = in.nextInt();
        System.out.println("Sartu bigarren laukizuzenaren behe-eskumako puntuaren X ");
        L1point1X = in.nextInt();
        System.out.println("Sartu bigarren laukizuzenaren behe-eskumako puntuaren Y ");
        L1point2Y = in.nextInt();
        
        MyRectangle rec1 = new MyRectangle(new MyPoint(L1point1X, L1point1Y), new MyPoint(L1point2X, L1point2Y));
        MyRectangle rec2 = new MyRectangle(new MyPoint(L2point1X, L2point1Y), new MyPoint(L2point2X, L2point2Y));
        
        if(rec1.getAzalera()>rec2.getAzalera()){
            System.out.println("Lehenengo laukizuzena handiagoa da, lehen laukizuzenaren azalera: " + rec1.getAzalera() + " Bigarren laukizuzenaren azalera: " + rec2.getAzalera());
        }
        
        if(rec1.getAzalera()<rec2.getAzalera()){
            System.out.println("Bigarren laukizuzena handiagoa da, lehen laukizuzenaren azalera: " + rec1.getAzalera() + " Bigarren zirkuluaren azalera: " + rec2.getAzalera());
        }
        
        if(rec1.getAzalera() == rec2.getAzalera()){
            System.out.println("Biak azalera berdina dute: " + rec1.getAzalera());
        }
        
    }
    
  
    
    public static void LaukizauzenaPerimetroa(){
    Scanner in = new Scanner(System.in);
    
    
        int L1point1X = 0, L1point1Y = 0, L1point2X = 0, L1point2Y = 0,L2point1X = 0, L2point1Y = 0, L2point2X = 0, L2point2Y = 0;
        System.out.println("Sartu lehen laukizuzenaren goi-ezkerreko puntuen X ");
        L1point1X = in.nextInt();
        System.out.println("Sartu lehen laukizuzenaren goi-ezkerreko puntuen Y ");
        L1point1Y = in.nextInt();
        System.out.println("Sartu bigarren laukizuzenaren behe-eskumako puntuaren X ");
        L1point1X = in.nextInt();
        System.out.println("Sartu bigarren laukizuzenaren behe-eskumako puntuaren Y ");
        L1point2Y = in.nextInt();
        
        MyRectangle rec1 = new MyRectangle(new MyPoint(L1point1X, L1point1Y), new MyPoint(L1point2X, L1point2Y));
        MyRectangle rec2 = new MyRectangle(new MyPoint(L2point1X, L2point1Y), new MyPoint(L2point2X, L2point2Y));
        
        if(rec1.getPerimetroa()>rec2.getPerimetroa()){
            System.out.println("Lehenengo laukizuzena perimetro handiagoa du, lehen laukizuzenaren perimetroa: " + rec1.getPerimetroa() + " Bigarren laukizuzenaren azalera: " + rec2.getPerimetroa());
        }
        
        if(rec1.getPerimetroa()<rec2.getPerimetroa()){
             System.out.println("Bigarren laukizuzena perimetro handiagoa du, lehen laukizuzenaren perimetroa: " + rec1.getPerimetroa() + " Bigarren laukizuzenaren azalera: " + rec2.getPerimetroa());
        }
        
        if(rec1.getPerimetroa() == rec2.getPerimetroa()){
            System.out.println("Biak perimetro berdina dute: " + rec1.getPerimetroa());
        }
    }
    
    public static void ZirkuluaPerimetroa(){
    Scanner in = new Scanner(System.in);    
    int zirk1X = 0, zirk1Y = 0, zirk2X = 0, zirk2Y = 0, zirk1erradio = 0, zirk2erradio = 0;
        System.out.println("Sartu lehen zirkuluaren zentroaren X, y eta zirkuluaren erradioa orden egokian: ");
        zirk1X = in.nextInt();
        zirk1Y = in.nextInt();
        zirk1erradio = in.nextInt();
        
        System.out.println("Sartu bigarren zirkuluaren zentroaren X, y eta zirkuluaren erradioa orden egokian: ");
        zirk2X = in.nextInt();
        zirk2Y = in.nextInt();
        zirk2erradio = in.nextInt();
      
        MyCircle zirkulu2 = new MyCircle(zirk1X,zirk1Y,zirk1erradio);
        MyCircle zirkulu1 = new MyCircle(zirk2X,zirk2Y,zirk2erradio);
        
        if(zirkulu1.getCircumference()>zirkulu2.getCircumference()){
            System.out.println("Lehenengo zirkulua zirkunferentzia handiagoa du, lehen zirkuluaren zirkunferentzia: " + zirkulu1.getCircumference()+ " Bigarren zirkuluaren zirkunferentzia: " + zirkulu2.getCircumference());
        }
        
        if(zirkulu1.getCircumference()<zirkulu2.getCircumference()){
            System.out.println("Bigarren zirkulua zirkunferentzia handiagoa du, legen zirkuluaren zirkunferentzia: " + zirkulu1.getCircumference()+ " Bigarren zirkuluaren zirkunferentzia: " + zirkulu2.getCircumference());
        }
    }
    
    public static void TriangeluaPerimetroa(){
    Scanner in = new Scanner(System.in);
    
    int T1point1X = 0,T1point1Y = 0,T1point2X = 0,T1point2Y = 0,T1point3X = 0,T1point3Y = 0,T2point1X = 0,T2point1Y = 0,T2point2X = 0,T2point2Y = 0,T2point3X = 0,T2point3Y = 0;
    
    MyTriangle tri1 = new MyTriangle(T1point1X,T1point1Y,T1point2X,T1point2Y,T1point3X,T1point3Y);
    MyTriangle tri2 = new MyTriangle(T2point1X,T2point1Y,T2point2X,T2point2Y,T2point3X,T2point3Y);
    
    if(tri1.getPerimeter()>tri2.getPerimeter()){
        System.out.println("Lehenengo triangeluaren perimetroa da handiagoa. Lehen triangeluaren perimetroa: " + tri1.getPerimeter() + " Bigarren triangeluaren perimetroa: " + tri2.getPerimeter());
    }
    
    if(tri1.getPerimeter()<tri2.getPerimeter()){
        System.out.println("Bigarren triangeluaren perimetroa da handiagoa. Lehen triangeluaren perimetroa: " + tri1.getPerimeter() + " Bigarren triangeluaren perimetroa: " + tri2.getPerimeter());
    }
    
    if(tri1.getPerimeter()== tri2.getPerimeter()){
        System.out.println("Triangeluen perimetroa berdina da. Lehen triangeluaren perimetroa: " + tri1.getPerimeter() + " Bigarren triangeluaren perimetroa: " + tri2.getPerimeter());
    }
    }
    
    
}
