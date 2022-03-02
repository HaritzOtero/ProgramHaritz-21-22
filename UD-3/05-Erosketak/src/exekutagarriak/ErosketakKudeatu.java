/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Bezeroa;
import model.Enpresa;
import model.Erosketa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author otero.haritz
 */
public class ErosketakKudeatu {

    private static ArrayList<Bezeroa> kontaktuak = new ArrayList();
    private static ArrayList<Produktua> produktuKatalogoa = new ArrayList();
    private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initialize();
        int aukera = 0;
        while ((aukera = menuNagusiaErakutsi()) != 5) {
            switch (aukera) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        }
    }
     public static void read() {
        Scanner in = new Scanner(System.in);
        int aukera;
        while ((aukera = readMenuaErakutsi()) != 20) {
            switch (aukera) {
                case 1:
                    erosketenZerrenda();
                    break;
                case 2:
                    System.out.println("Egunaren fakturazioa osoa: " + fakturazioOsoa());
                    break;
                case 3:
                    bezerorikOnena();
                    break;
                case 4:
                    helbideaBilatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        }
    }

    public static void initialize() {
        
        
        kontaktuak.add(new Pertsona(1, "Karlos", "Arguiñano", "Hondartza pasialekua z/g ZARAUTZ", "kargi@zarautz.es"));
        kontaktuak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g DONOSTIA", "mbrea@donostia.es"));
        String[] emailak = {"idazkaria@uni.eus", "zuzendaria@uni.eus"};
        kontaktuak.add(new Enpresa(3, "Uni Eibar-Ermua", "Uni Eibar-Ermua", "Otaola Etorbidea 29.EIBAR", emailak));

        produktuKatalogoa.add(new Produktua("A34", "Acer pc", 200));
        produktuKatalogoa.add(new Produktua("A35", "Xagua", 2900));
        produktuKatalogoa.add(new Produktua("A36", "Samsung ", 200));
        produktuKatalogoa.add(new Produktua("A37", "iPhone ", 78));
        
        ArrayList<Produktua> produktuak = new ArrayList<>();
        ArrayList<Integer> unitateak = new ArrayList<>();
        
        produktuak.add(produktuKatalogoa.get(0));
        unitateak.add(11);
        produktuak.add(produktuKatalogoa.get(1));
        unitateak.add(4);

        
        erosketenZerrenda.add(new Erosketa("GT35", LocalDate.now().toString(), kontaktuak.get(1), produktuak, unitateak, 3630));
        
        produktuak.removeAll(produktuak);
        unitateak.removeAll(unitateak);
        
        produktuak.add(produktuKatalogoa.get(1));
        unitateak.add(10);
        produktuak.add(produktuKatalogoa.get(2));
        unitateak.add(1);
        produktuak.add(produktuKatalogoa.get(3));
        unitateak.add(2);

        erosketenZerrenda.add(new Erosketa("GT36", LocalDate.now().toString(), kontaktuak.get(2), produktuak, unitateak, 3213));
    }

    public static int menuNagusiaErakutsi() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("*   EROSKETEN KUDEAKETA");
        System.out.println("*   --------------------------------");
        System.out.println("*   1. Create (Datuak gehitu) ");
        System.out.println("*   2. Read (Ikusi) ");
        System.out.println("*   3. Update (Aldatu) ");
        System.out.println("*   4. Delete (Ezabatu)");
        System.out.println("*   5.- Irten");
        System.out.println("");
        System.out.print("Aukeratu zenbaki bat: ");
        int aukera = in.nextInt();
        return aukera;

    }

    public static void create() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> unitateak = new ArrayList<>();
        System.out.println();
        System.out.println("EROSKETA BERRIA");
        System.out.println("====================================");
        System.out.println("Sartu erosketa kodea: ");
        String kodea = in.next();
        System.out.println("Sartu bezero kodea: ");
        System.out.println(kontaktuak);
        int bezKodea = in.nextInt();
        System.out.println("Sartu produktu kodea: ");
        System.out.println(produktuKatalogoa.toString());
        int produktuKode = in.nextInt();
        System.out.println("Sartu unitateak: ");
        unitateak.add(in.nextInt());
        System.out.println("Guztira ordaindu beharrekoa: ");
        String guztira = in.next();
        System.out.println("Epekako erosketa da? (B/E) ");

        if (in.next().toUpperCase().charAt(0) == 'B') {

        } else {
            erosketenZerrenda.add(new Erosketa(kodea, LocalDate.now().toString(),kontaktuak.get(bezKodea), produktuKatalogoa.get(produktuKode), unitateak, guztira));
        }
    }

    public static void recover() {

    }

    public static void update() {

    }

    public static int readMenuaErakutsi() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("*   READ MENUA");
        System.out.println("*   --------------------------------");
        System.out.println("*   1. Erosketen zerrenda ");
        System.out.println("*   2. Fakturazio osoa ");
        System.out.println("*   3. Bezerorik onena ");
        System.out.println("*   4. Helbidea bilatu ");
        System.out.println("*   5. Epekako erosketen txostena ");
        System.out.println("*   20. Menu nagusira itzuli ");
        System.out.println("");
        System.out.print("Aukeratu zenbaki bat: ");
        int aukera = in.nextInt();
        return aukera;

    }

    public static void erosketenZerrenda() {
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            System.out.println(erosketenZerrenda.get(i).toString());
        }
    }

    public static double fakturazioOsoa() {
        double fakOsoa = 0;
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            fakOsoa += erosketenZerrenda.get(i).getGuztira();
            
        }
        
        return fakOsoa;
    }

    public static Bezeroa bezerorikOnena() {
        return null;
 
}
    public static void helbideaBilatu() {

    }

    public static void epekakoErosketenTxostena() {

    }

    public static void delete() {
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu ezabatu nahi duzun erosketaren zenbakia: ");
        int zbk = in.nextInt();
        erosketenZerrenda.remove(zbk);
    }
}
