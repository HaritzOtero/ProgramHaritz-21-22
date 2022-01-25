/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author otero.haritz
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void setDate(int day, int month, int year){
        
    }
    public String toString(){
       return String.format("%4d/%02d/%02d",year,month,day);
    }
    
    public String getHilabeteaLetretan(){
        String[]hilabeteak ={"Urtarrila","Otsaila","Martxoa","Apirila","Maiatza", "Ekaina","Uztaila","Abuztua","Iraila","Urria","Azaroa","Abendua"};
        return hilabeteak[month-1];
        
    }
    public String getHilabeteaLetretan(String hizkuntza){
    String[][]hilabeteak =
    {
    {"Urtarrila","Otsaila","Martxoa","Apirila","Maiatza", "Ekaina","Uztaila","Abuztua","Iraila","Urria","Azaroa","Abendua"},
    {"January","Febreuary","March","April","May","June","July","August","September","October","November","December"},
    {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}
    };
    
    String a = null;
    
        if(hizkuntza == "EU"){
        a =  hilabeteak[0][month - 1];
        }
        else if(hizkuntza == "EN"){
        a = hilabeteak[1][month - 1];       
        }
        else if (hizkuntza == "ES"){
        a = hilabeteak[2][month - 1];
        }
        return a;
    }

    
    
}

