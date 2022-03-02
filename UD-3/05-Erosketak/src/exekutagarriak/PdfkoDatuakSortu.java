/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Bezeroa;
import model.Enpresa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author parra.raul
 */
public class PdfkoDatuakSortu {

    public static void main(String[] args) {

        Pertsona KarlosA = new Pertsona(1, "karlos", "Arguiñano", "Hondartza pasialekua z/g ZARAUTZ", "kargi@zarautz.eus");

        Pertsona MartinB = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g DONOSTIA", "mbera@donostia.eus");
        
        String[] emailak = {"idazkaria@uni.eus", "zuzendaria@uni.eus"};
        Enpresa Uni =  new Enpresa(3, "IES Uni BHI", "Uni Eibar-Ermua", "Otaola Hiribidea 29,Eibar", emailak);
        
        Produktua toshiba = new Produktua("C01","Toshiba Satellite Pro",450);
        Produktua hp = new Produktua("C02","HP Pavilion",600);
        Produktua samsung = new Produktua("T01","Samsung Galaxy",210);
        Produktua aifon = new Produktua("T02","Iphone XX" , 1300);
    }
}

