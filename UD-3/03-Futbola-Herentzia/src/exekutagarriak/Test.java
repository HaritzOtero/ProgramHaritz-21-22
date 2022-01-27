/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;



import static model.Demarkazioa.POR;
import model.Entrenador;
import model.Futbolista;
import model.Masajista;

/**
 *
 * @author otero.haritz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Futbolista f1 = new Futbolista (1,POR,"Cantero",20,31,"Ander");
        
        System.out.println(f1);
        Entrenador e1 = new Entrenador("47HO","Otero",18,1,"Rumián");
        Masajista m1 = new Masajista(3,"Molina Fernández",18,2,"Itsaso");
        
        f1.concentrarse();
        f1.entrenar();
       
        e1.dirigirEntrenamiento();
        m1.darMasaje();
        
        System.out.println(f1);
        System.out.println(e1);
        System.out.println(m1);
        
        
    }
    
}
