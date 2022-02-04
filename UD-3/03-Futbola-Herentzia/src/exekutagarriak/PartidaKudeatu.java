/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import static exekutagarriak.Menua.azkenId;
import static exekutagarriak.Menua.selekzioa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Demarkazioa;
import static model.Demarkazioa.DEF;
import static model.Demarkazioa.DEL;
import static model.Demarkazioa.MED;
import static model.Demarkazioa.POR;
import model.Entrenador;
import model.Futbolista;
import model.IntegrantesSeleccion;
import model.Masajista;
import model.Partida;

/**
 *
 * @author otero.haritz
 */
public class PartidaKudeatu {

    private static ArrayList<IntegrantesSeleccion> selekzioa;
    private static Partida[] partidak = new Partida[20];

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1 -- Partidaren datuak.");
            System.out.println("Sartu nahi duzun aurkeraren zbk: ");

            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("Partidaren datuak!:");
                    System.out.println("==================");
                    partidaBatenDatuakEskatu();
                    break;


                default:
                    System.out.println("Aukera okerra, sartu zenbaki egokia.");
            }

        } while (aukera != 1);
    }

    public void selekzioOsoaSortu() {

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

    public static void partidak() {

        partidak[0].setAurkaria("Perú");
        partidak[0].setData(LocalDate.parse("6/02/2022"));
        partidak[0].txartelaJarri(new Futbolista(azkenId++, POR, "Fernandez", 65, 1, "Aitor"));
        partidak[1].setAurkaria("Malawi");
        partidak[1].setData(LocalDate.parse("9/02/2022"));
        partidak[1].txartelaJarri(new Futbolista(azkenId++, POR, "Parra", 43, 10, "Raul"));
        partidak[2].setAurkaria("Brasil");
        partidak[2].setData(LocalDate.parse("17/02/2022"));
        partidak[2].txartelaJarri(new Futbolista(azkenId++, DEF, "Areso", 13, 15, "Jesus"));
        partidak[3].setAurkaria("Alemania");
        partidak[3].setData(LocalDate.parse("23/02/2022"));
        partidak[3].txartelaJarri(new Futbolista(azkenId++, DEF, "Schweinsteiger", 54, 15, "Bastian"));
        partidak[4].setAurkaria("Andalucia");
        partidak[4].setData(LocalDate.parse("1/03/2022"));
        partidak[4].txartelaJarri(new Futbolista(azkenId++, DEF, "Ramos", 345, 15, "Sergio"));
        partidak[5].setAurkaria("Cantabria");
        partidak[5].setData(LocalDate.parse("1/03/2022"));
        partidak[5].txartelaJarri(new Futbolista(azkenId++, DEF, "Español", 345, 15, "Gorka"));
    }

    public static void partidaBatenDatuakEskatu() {

        Scanner in = new Scanner(System.in);
        System.out.println("Euskal Selekzioaren aurkaria: ");
        String aurkaria = in.next();
        System.out.println("Sartu data, adibidez: 2001-01-01 -->");
        String data = in.next();
        System.out.println("Satu partiduaren zenbakia: ");
        int partiduZbk = in.nextInt();
        
        partidak[partiduZbk] = new Partida(LocalDate.parse(data),"",new ArrayList<>());
        partidak[partiduZbk].setAurkaria(aurkaria);
        partidak[partiduZbk].setData(LocalDate.parse(data));

        System.out.println("Txartelaren bat jarri nahi duzu (Bai/Ez)");
        String erantzuna = in.next();

        if (erantzuna.equalsIgnoreCase("Bai")) {
            int dorsala;
            System.out.println("Zenbat txartel sartu nahi dituzu? ");
            int txartelKop = in.nextInt();
            int i = 0;
            while (i < txartelKop) {
                System.out.println("Sartu futbolariaren dorsala ");
                dorsala = in.nextInt();
                for (i = 0; i < selekzioa.size(); i++) {
                    if (dorsala == ((Futbolista) selekzioa.get(i)).getDorsal()) {
                        partidak[partiduZbk].txartelaJarri(((Futbolista) selekzioa.get(i)));
                        break;
                    }
                
                }
                

            }

        }

        if (erantzuna == "Ez") {
            System.out.println("");
        }
    }
}
