/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

/**
 *
 * @author otero.haritz
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.Entrenador;
import model.Futbolista;
import model.IntegrantesSeleccion;
import exekutagarriak.EuskalSelekzioa;
import static exekutagarriak.EuskalSelekzioa.selekzioOsoaSortu;
import static exekutagarriak.EuskalSelekzioa.selekzioa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.Masajista;

/** Programa honetan Euskal Selekzioaren datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  Programa hau selekzioko partaideen datuak kargatzen hasiko da. 
 *  Normalena da, datu hauek fitxategi edo datu-base batetik irakurtzea baina 
 *  oraindik hori ez dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 * 
 *  Gero, horrelako menu bat agertuko zaigu:
 * 
 *  **********************************************************
 *  *    EUSKAL SELEKZIOA
 *  *  ----------------------------------
 *  *  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)
 *  *  2. Partaideen datuak ikusi taldekatuta
 *  *  3. Futbolariak alfabetikoki inprimatu
 *  *  4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)
 *  *  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)
 *  *  z. Irten
 * 
 *  *  Aukeratu zenbaki bat:
 * 
 *  **************************************************************
 */
public class Menua {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegrantesSeleccion> selekzioa = new ArrayList<>(); 
       public static ArrayList<String> apellidos = new ArrayList();
    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("EUSKAL SELEKZIOA");
            System.out.println("====================================");
            System.out.println("1.- Partaideen datuak ikusi");
            System.out.println("2.- Partaideen datuak ikusi takdekatuta");
            System.out.println("3.- Futbolariak alfabetikoki inprimatu");
            System.out.println("4.- Aldaketa");
            System.out.println("5.- Bilatu abizenetik");
            System.out.println("6.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    selekzioOsoaSortu();
                    break;
                case 2:
                    System.out.println("Bigarren aukera aukeratu duzu.");
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                case 6:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
            
        } while (aukera != 5);
    }
    
    public void FutbolariakAlph(){
        apellidos.add("Fernandez");
        apellidos.add("Bustinza");
        apellidos.add("Balenziaga");
        apellidos.add("Illarramendi");
        apellidos.add("Martínez");
        apellidos.add("San Jose");
        apellidos.add("Larrazabal");
        apellidos.add("Garcia");
        apellidos.add("Aduriz");
        apellidos.add("Eraso");
        apellidos.add("Villalibre");
        apellidos.add("Fernandez");
        apellidos.add("Fernandez");
        Collections.sort(apellidos);
    }
    
    public void aldaketa(){
        Collections.swap(selekzioa, azkenId, azkenId);
    }
    
    public void selekzioOsoa(){
        selekzioa.forEach(o -> {
            System.out.println(o);
        });
        }
 
    
    
    }   
