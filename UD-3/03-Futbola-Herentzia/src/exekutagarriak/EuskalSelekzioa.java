/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import static model.Demarkazioa.DEF;
import static model.Demarkazioa.DEL;
import static model.Demarkazioa.MED;
import static model.Demarkazioa.POR;
import model.Entrenador;
import model.Futbolista;
import model.IntegrantesSeleccion;
import model.Masajista;
/**
 *
 * @author otero.haritz
 */
public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegrantesSeleccion> selekzioa = new ArrayList();
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
        Futbolista f1 = new Futbolista (azkenId++,DEL,"Villalibre",30,11,"Asier");
        f1.entrenar();
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
        Masajista m1 = new Masajista (2,"Sertxiberrieta",45,azkenId,"Iñaki","Fisioterapeuta");
        Masajista m2 = new Masajista (14,"Medikua",42,azkenId,"Ander","Etxeburu");
        Entrenador e1 = new Entrenador("ENJC","Clemente",50,4,"Javier");
        
        System.out.println(m1);
        System.out.println(m1.concentrarse());
        System.out.println(m1.viajar());
        System.out.println(e1);
        System.out.println(e1.concentrarse());
        System.out.println(e1.viajar());
        System.out.println(m2);
        
         
        System.out.println(m2.concentrarse());
        System.out.println(m2.viajar());
        
       
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
    public  static void selekzioOsoaSortu(){  

        
            selekzioa.add(new Futbolista (azkenId++,POR,"Fernandez",30,1,"Aitor")) ;
            selekzioa.add(new Futbolista (azkenId++,DEF,"Bustinza",30,2,"Unai"));
            selekzioa.add(new Futbolista (azkenId++,DEF,"Balenziaga",30,3,"Mikel"));
            selekzioa.add(new Futbolista (azkenId++,MED,"Illarramendi",30,4,"Asier"));
            selekzioa.add(new Futbolista (azkenId++,DEF,"Martinez",30,5,"Iñigo"));
            selekzioa.add(new Futbolista (azkenId++,MED,"San Jose",30,6,"Mikel"));
            selekzioa.add(new Futbolista (azkenId++,DEF,"Larrazabal",30,7,"Gaizka"));
            selekzioa.add(new Futbolista (azkenId++,MED,"Garcia",30,8,"Manu"));
            selekzioa.add(new Futbolista (azkenId++,DEL,"Aduriz",30,9,"Aritz"));
            selekzioa.add(new Futbolista (azkenId++,MED,"Eraso",30,10,"Javier"));
            selekzioa.add(new Futbolista (azkenId++,DEL,"Villalibre",30,11,"Asier"));
            selekzioa.add(new Futbolista (azkenId++,DEF,"Fernandez",30,12,"Aihen"));
            selekzioa.add(new Futbolista (azkenId++,POR,"Fernandez",30,13,"Iago"));
            selekzioa.add(new Futbolista (azkenId++,DEF,"Fernandez",30,14,"Aritz"));
            selekzioa.add(new Futbolista (azkenId++,DEF,"Fernandez",30,15,"Jesus"));
            selekzioa.add(new Futbolista (azkenId++,DEL,"Fernandez",30,16,"Iñigo"));
            selekzioa.add(new Futbolista (azkenId++,DEF,"Fernandez",30,17,"Dnaiel"));
        System.out.println(selekzioa);
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){
        /**boolean encontrado = false;
        
        for(int i=0; i <= selekzioa.size();i++){
            if(selekzioa.get(id).getId() == id){
                encontrado = true;
            }
            else{
                encontrado = false;
            }
        }
        if(encontrado = true){
            selekzioa.remove(azkenId);
        }
        else{
            System.out.println("Jokalaria ez dago listan.");
        }
        */
        
        
        
        
        return false;
        }
    
}
