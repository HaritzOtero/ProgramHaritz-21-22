/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azalpenak;

import java.util.ArrayList;

/**
 *
 * @author otero.haritz
 */
public class ArrayVsArraylist {
    public static void main(String[] args) {
        
        //arraya deklaratu eta sortu.
        String[] izenenArraya= new String [3];
        //Arraya betetzeko
        izenenArraya[0] = "Jaimito";
        izenenArraya[1] = "Jorgito";
        izenenArraya[2] = "Juanito";
        
        
        System.out.println("Bigarren izena: " + izenenArraya[1]);
            
       //Arraya osoa inpriimatu.
        
        System.out.println("Izenen zerrenda osoa: ");
        
        for(int i = 0;i < izenenArraya.length ;i++){
                System.out.println(izenenArraya[i]);
            }
        
      
        //Arraya nabigatu for-each sententziarekin
        System.out.println("Izenen zerrenda osoa tituloarekin: ");
        for(String izena:izenenArraya){
            System.out.println("Mr. " + izena);
        }

        //Arrayaren lehen elementua hutsitu.
       
        izenenArraya[0] = null;
        
        //Array batean datu primitiboak gorde daitezke:
        
        int[] zenbakienArraya = new int[4];
        
        zenbakienArraya[0] = 7;
        zenbakienArraya[1] = 8;
        zenbakienArraya[2] = 9;
        zenbakienArraya[3] = 10;
        
        ///////////////////////////////////////////////////////////////////////
        
        
        //Arraylista deklaratu eta sortu.

        ArrayList<String> ikasleenArrayLista  = new ArrayList();
        
        ikasleenArrayLista.add("Jon Alberdi");
        ikasleenArrayLista.add("Hodei Olivas");
        ikasleenArrayLista.add("Karmele Elortza");
        ikasleenArrayLista.add("Markel Solaguren");
        ikasleenArrayLista.add(1, "Joseba");
        
        //Arrayean daukagun balio bat irakurri.
        System.out.println(ikasleenArrayLista.get(1));
        
        //ArrayLista nabegatu for batekin.
        System.out.println("Ikasleen zerrenda osoa");
        for (int i=0 ;i < ikasleenArrayLista.size(); i++) {
            System.out.println(ikasleenArrayLista.get(i));
            
        }
        
        //Arraylista nabigatu for-each arekin (enhanced for-arekin).
        
        System.out.println("Ikasleen zerrenda osoa adjetiboarekin: ");
        for (String ikaslea: ikasleenArrayLista){
            System.out.println(ikaslea + " estimatua.");
        }
        
        //  Hutsitu arrayListaren lehen elementua.
        ikasleenArrayLista.remove(0);
        
        int markelenPosizioa = ikasleenArrayLista.lastIndexOf("Markel Solaguren");/*Parametro bezala objektu bat eskatzen du. 
        equals metodoarekin konaparatuko ditugu parametro hori eta arrayListeko obejektua.*/
        
        System.out.println("Markelen posizioa arrayean: ");
        System.out.println(markelenPosizioa);
        
        //ArrayList batean datu primitiboak gorde daitezke? EZ, Integer erabili behar da  arrayListaren mota deklaratzeko.
        ArrayList<Integer> zenbakienArrayLista = new ArrayList();
        
        System.out.println(ikasleenArrayLista);
 
    }
}
