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
public class Futbolista extends IntegrantesSeleccion {
    private int dorsal;
 
    private Demarkazioa demarcacion;
    public Futbolista(String apellidos, int edad, int id, String nombre) {
        super(apellidos, edad, id, nombre);
    }

    public Futbolista(int dorsal, Demarkazioa demarcacion, String apellidos, int edad, int id, String nombre) {
        super(apellidos, edad, id, nombre);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public String entrenar(){
        return "El futbolista está entrenando...";
    }
    
    public String jugarPartido (){
        return "El futbolista está jugando el partido...";
    }

    @Override
    public String toString() {
        return "Futbolista{id= "+ id + "nombre=" + nombre + ", apellidos=" + this.getApellidos() +", edad=" + this.getEdad() +", dorsal=" + this.getDorsal() + ", demarcacion=" + this.getDemarcacion() +  '}';
    }
   
    
}
