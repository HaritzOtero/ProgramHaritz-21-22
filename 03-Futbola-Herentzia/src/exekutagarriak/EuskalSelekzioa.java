/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import static model.Demarkazioa.DEF;
import static model.Demarkazioa.DEL;
import static model.Demarkazioa.MED;
import static model.Demarkazioa.POR;
import model.Futbolista;
import model.IntegrantesSeleccion;
/**
 *
 * @author otero.haritz
 */
public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    public ArrayList<IntegrantesSeleccion> selekzioa;
    /** Programa honek metodo desberdinei deituko die banan banan. 
     *  Beharbada ez diozu koherentzia handirik topatuko programa osoari. 
     *  Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen trebatzea. 
     *   
     */
    public static void main(String[] args) {
        
        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(){
        
    }
    
    /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(){
        
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
    public static void selekzioOsoaSortu(){
        azkenId = 0;
        
        selekzioa.add(new Futbolista (azkenId++,POR,"Fernandez",30,1,"Aitor")) ;
        Futbolista f2 = new Futbolista (azkenId++,DEF,"Bustinza",30,1,"Unai");
        Futbolista f3 = new Futbolista (azkenId++,DEF,"Balenziaga",30,1,"Mikel");
        Futbolista f4 = new Futbolista (azkenId++,MED,"Illarramendi",30,1,"Asier");
        Futbolista f5 = new Futbolista (azkenId++,DEF,"Martinez",30,1,"Aitor");
        Futbolista f6 = new Futbolista (azkenId++,MED,"San Jose",30,1,"Aitor");
        Futbolista f7 = new Futbolista (azkenId++,DEF,"Larrazabal",30,1,"Aitor");
        Futbolista f8 = new Futbolista (azkenId++,MED,"Garcia",30,1,"Aitor");
        Futbolista f9 = new Futbolista (azkenId++,DEL,"Aduriz",30,1,"Aitor");
        Futbolista f10 = new Futbolista (azkenId++,MED,"Eraso",30,1,"Aitor");
        Futbolista f11 = new Futbolista (azkenId++,DEL,"Villalibre",30,1,"Aitor");
        Futbolista f12 = new Futbolista (azkenId++,DEF,"Fernandez",30,1,"Aitor");
        Futbolista f13 = new Futbolista (azkenId++,POR,"Fernandez",30,1,"Aitor");
        Futbolista f14 = new Futbolista (azkenId++,DEF,"Fernandez",30,1,"Aitor");
        Futbolista f15 = new Futbolista (azkenId++,DEF,"Fernandez",30,1,"Aitor");
        Futbolista f16 = new Futbolista (azkenId++,DEL,"Fernandez",30,1,"Aitor");
        Futbolista f17 = new Futbolista (azkenId++,DEF,"Fernandez",30,1,"Aitor");
    
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){

        return false;
    }
}
