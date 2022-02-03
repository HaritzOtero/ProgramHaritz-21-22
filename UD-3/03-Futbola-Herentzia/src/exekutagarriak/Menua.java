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

import static exekutagarriak.EuskalSelekzioa.azkenId;
import static exekutagarriak.EuskalSelekzioa.selekzioa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.Demarkazioa;
import static model.Demarkazioa.DEF;
import static model.Demarkazioa.DEL;
import static model.Demarkazioa.MED;
import static model.Demarkazioa.POR;
import model.Masajista;

/**
 * Programa honetan Euskal Selekzioaren datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 * Programa hau selekzioko partaideen datuak kargatzen hasiko da. Normalena da,
 * datu hauek fitxategi edo datu-base batetik irakurtzea baina oraindik hori ez
 * dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 *
 * Gero, horrelako menu bat agertuko zaigu:
 *
 *  **********************************************************
 *  * EUSKAL SELEKZIOA * ---------------------------------- * 1. Partaideen
 * datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak:
 * 23 Entren...) * 2. Partaideen datuak ikusi taldekatuta * 3. Futbolariak
 * alfabetikoki inprimatu * 4. Aldaketa ( Sartu zaitez zu beste partaide baten
 * ordez. Horretarako ArrayList-en set metodoa erabiliz) * 5. Bilatu abizenetik
 * (String-en startsWith() metodoa erabiliz adibidez) * z. Irten
 *
 *  * Aukeratu zenbaki bat:
 *
 *  **************************************************************
 */
public class Menua {

    public static int azkenId = 0;
    public static ArrayList<IntegrantesSeleccion> selekzioa = new ArrayList<>();
    public static ArrayList<String> apellidos = new ArrayList();

    public static void main(String[] args) {
        selekzioOsoaSortu();
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("EUSKAL SELEKZIOA");
            System.out.println("====================================");
            System.out.println("1.- Partaideen datuak ikusi");
            System.out.println("2.- Partaideen datuak ikusi takdekatuta");
            System.out.println("3.- Futbolarien abizenak alfabetikoki inprimatu");
            System.out.println("4.- Aldaketa");
            System.out.println("5.- Bilatu abizenetik");
            System.out.println("6.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("PARTAIDEEN DATUAK:");
                    System.out.println("===================");
                    selekzioOsoa();
                    break;
                case 2:
                    System.out.println("PARTAIDEEN DATUAK TALDEKATUTA:");
                    System.out.println("=============================");
                    break;
                case 3:
                    System.out.println("FUTBOLARIAL ALFABETIKOKI: ");
                    System.out.println("=========================");
                    FutbolariakAlph();
                    break;
                case 4:
                    System.out.println("Aldaketa aukera aukeratu duzu.");
                    aldaketa();
                    break;
                case 5:
                    System.out.println("Bilatu jokalaria abizenetik");
                    bilatu();
                    break;
                case 6:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);
    }

    public static void FutbolariakAlph() {

        for (int i = 0; i < selekzioa.size(); i++) {
            apellidos.add(selekzioa.get(i).getApellidos() + " " + selekzioa.get(i).getNombre());
        }

        Collections.sort(apellidos);

        for (Object o : apellidos) {
            System.out.println(o);
        }
    }

    public static void aldaketa() {
        int Id;

        Scanner in = new Scanner(System.in);
        System.out.println("Nor aldatu nahi dozu postuz? Idatzi Id-a");
        Id = in.nextInt();
        Id = Id - 1;
        if (selekzioa.get(Id) instanceof Futbolista == true) {
            System.out.println(((Futbolista) selekzioa.get(Id)).getDemarcacion() + " Postuan zegoen. Zein postutara doa? ");
        } else {
            System.out.println("Partaidea ez da futbolista");
        }

        Demarkazioa postua = Demarkazioa.valueOf(in.next().toUpperCase());
        ((Futbolista) selekzioa.get(Id)).setDemarcacion(postua);
        System.out.println(selekzioa);

        System.out.println("Ondo aldatu da.");

    }

    public static void selekzioOsoa() {
        selekzioa.forEach(o -> {
            System.out.println(o);
        });
    }

    public static void selekzioOsoaSortu() {

        selekzioa.add(new Futbolista(azkenId++, POR, "Fernandez", 30, 1, "Aitor"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Bustinza", 30, 2, "Unai"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Balenziaga", 30, 3, "Mikel"));
        selekzioa.add(new Futbolista(azkenId++, MED, "Illarramendi", 30, 4, "Asier"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Martinez", 30, 5, "Iñigo"));
        selekzioa.add(new Futbolista(azkenId++, MED, "San Jose", 30, 6, "Mikel"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Larrazabal", 30, 7, "Gaizka"));
        selekzioa.add(new Futbolista(azkenId++, MED, "Garcia", 30, 8, "Manu"));
        selekzioa.add(new Futbolista(azkenId++, DEL, "Aduriz", 30, 9, "Aritz"));
        selekzioa.add(new Futbolista(azkenId++, MED, "Eraso", 30, 10, "Javier"));
        selekzioa.add(new Futbolista(azkenId++, DEL, "Villalibre", 30, 11, "Asier"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Muñoz", 30, 12, "Aihen"));
        selekzioa.add(new Futbolista(azkenId++, POR, "Herrerin", 30, 13, "Iago"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Elustondo", 30, 14, "Aritz"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Areso", 30, 15, "Jesus"));
        selekzioa.add(new Futbolista(azkenId++, DEL, "Vicente", 30, 16, "Iñigo"));
        selekzioa.add(new Futbolista(azkenId++, DEF, "Vivian", 30, 17, "Dnaiel"));
        selekzioa.add(new Masajista(2, "Sertxiberrieta", 45, azkenId, "Iñaki", "Fisioterapeuta"));
        selekzioa.add(new Masajista(14, "Medikua", 42, azkenId, "Ander", "Etxeburu"));
        selekzioa.add(new Entrenador("ENJC", "Clemente", 50, 4, "Javier"));
    }

    public static void bilatu() {
        Scanner in = new Scanner(System.in);

        System.out.print("Sartu Jokalariaren abizena: ");
        
        String abizena = in.next();
        int i = 0;
        boolean encontrado = false;

        while (i < selekzioa.size() && encontrado == false) {

            if (abizena.equals(selekzioa.get(i).getApellidos())) {
                System.out.println("ID = " + selekzioa.get(i).getId());
                System.out.println("Izena = " + selekzioa.get(i).getNombre());
                System.out.println("Abizena = " + selekzioa.get(i).getApellidos());
                System.out.println("Adina = " + selekzioa.get(i).getEdad());
                //System.out.println("Dorsal= "+ selekzioa.get(i));
                encontrado = true;
            }
            i++;

        }
        if (encontrado == false) {
            System.out.println("Jokalaria ez dago taldean");
        }
    } 
    public static void datuakTaldekatuta() {
        
        ArrayList<IntegrantesSeleccion> futbolistas = new ArrayList<>();
        ArrayList<IntegrantesSeleccion> entrenadores = new ArrayList<>();
        ArrayList<IntegrantesSeleccion> masajistas = new ArrayList<>();
        ArrayList<IntegrantesSeleccion> integrantes = new ArrayList<>();

        for (IntegrantesSeleccion integrante : selekzioa) {
            
            if (integrante instanceof Futbolista) {
                futbolistas.add(integrante);
            } else if (integrante instanceof Entrenador) {
                entrenadores.add(integrante);
            } else if (integrante instanceof Masajista) {
                masajistas.add(integrante);
            } else {
                integrantes.add(integrante);
            }

        }

        System.out.println("Futbolariak:\n");

        for (IntegrantesSeleccion integrante : futbolistas) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Entrenatzaileak:\n");

        for (IntegrantesSeleccion integrante : entrenadores) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Masajistak:\n");

        for (IntegrantesSeleccion integrante : masajistas) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Integranteak:\n");

        for (IntegrantesSeleccion integrante : integrantes) {
            System.out.println(integrante);
            System.out.println("");
        }
        System.out.println("");

    }
}


