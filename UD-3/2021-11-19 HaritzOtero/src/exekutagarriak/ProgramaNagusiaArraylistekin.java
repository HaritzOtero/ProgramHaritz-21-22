/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;


import java.util.ArrayList;
import java.util.Scanner;
import model.Liburua;

/**
 *
 * @author otero.haritz
 */
public class ProgramaNagusiaArraylistekin {
    
    private static ArrayList<Liburua>liburuak;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        liburuak = Liburua.getLiburuSortaArrayList();

        int aukera = 0;
        do {
             try{
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("-1- Liburua gehitu");
            System.out.println("0.- Liburu bat ezabatu");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
           
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            
            System.out.println("");
            switch (aukera) {
                
               case -1:
                    liburuaGehitu();
                    break; 
               case 0:
                    liburuaEzabatu();
                    break; 
                case 1:
                    liburuakIkusi();
                    break;
                case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
            }
             catch (Exception ex) {
            System.out.println("Sartu zenbaki bat. ");
            System.out.println(ex.getMessage());
            sc.next();
        }
        } while (aukera != 5);
    }

    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() {
        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("=================");
         for (int i = 0; i < liburuak.size(); i++) {
             if(liburuak.get(i)!=null){
                 System.out.println(liburuak.get(i).toString());
             }
         }
    }

    public static void liburuenDatuGuztiakIkusi() {
        //METODO HAU OSATU BEHAR DUZU
        // ...
 int guztira = 0;
        double kopurua = 0;
        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.", "G.", "H.", "P.", "K.");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println("");
        for (int i = 0; i < liburuak.size(); i++) {

            if (liburuak.get(i) != null) {
                System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", (i + 1), liburuak.get(i).getIzenburua(), liburuak.get(i).getEgilea(), liburuak.get(i).getOrriKopurua(), liburuak.get(i).getUrtea(), liburuak.get(i).getGaia(), liburuak.get(i).getHizkuntza(), liburuak.get(i).getPrezioa(), liburuak.get(i).getKodea());
                guztira = guztira + liburuak.get(i).getOrriKopurua();
                kopurua++;
            }

        }
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.printf("%-10s\n", "liburen batezbesteko orri kopurua:" + (double) guztira / kopurua);
        //...
    }
    

    public static void liburuenPrezioaIrudikatu() {
        for (int i = 0; i < liburuak.size(); i++) {
            if(liburuak.get(i)!=null){
                System.out.println(liburuak.get(i).getIzenburua() + ":" +liburuak.get(i).getPrezioaIzartxotan());
            }
        }
    }

    public static void zaharrenaBilatu() {
        
        double zaharrena = liburuak.get(1).getUrtea();
        Liburua inprimatu  = null;
        for (int i = 0; i < liburuak.size(); i++) {
            if (liburuak.get(i).getUrtea() <= zaharrena) {
                zaharrena = liburuak.get(i).getUrtea();
                liburuak.set(i, liburuak.get(i));
            }
        }
    System.out.println("Liburu zaharrena " + inprimatu + " urtean argitaratu zen: " );
    }        
    public static void liburuaEzabatu(){
        Scanner sc = new Scanner(System.in);
        int ezabatu;
        System.out.println("Ze liburu nahi duzu ezabatu (liburuaren zenbakia)? ");
        ezabatu = sc.nextInt();
        ezabatu= ezabatu - 1;
        liburuak.remove(ezabatu);
        System.out.println("Liburua ezabatu da.");
        liburuakIkusi();
    }    
    
    public static void liburuaGehitu(){
       
       Scanner in = new Scanner(System.in);
       String izena;
       String egilea;
       Integer orriKop;
       Integer urtea;
       String gaia;
       char hizkuntza;
       Integer prezioa;
       
        System.out.println("Liburu berriaren izena: ");
         
        izena  = in.nextLine();
        
        System.out.println("Liburu berriaren egilea: ");
        
        egilea = in.nextLine();
        System.out.println("Liburu berriaren orri kopurua: ");
        orriKop  = in. nextInt();
        System.out.println("Liburu berriaren argitarapen urtea: ");
        urtea  = in.nextInt();
        System.out.println("Liburu berriaren gaia: ");
        gaia  = in.next();
        System.out.println("Liburu berriaren hizkuntza: ");
        hizkuntza  = in.next().charAt(0);
        System.out.println("Liburu berriaren prezioa: ");
        prezioa  = in. nextInt();
        
        liburuak.add(new Liburua(izena,egilea,orriKop,urtea,gaia,hizkuntza,prezioa));
       
        liburuenDatuGuztiakIkusi();
       
               
                       
    } 
        
       
        
        
        
    
    

    }


