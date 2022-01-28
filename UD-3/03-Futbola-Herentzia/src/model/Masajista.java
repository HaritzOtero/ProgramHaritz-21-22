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
public class Masajista extends IntegrantesSeleccion{
    private String titulacion;
    private int añosExperiencia;

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public Masajista(int añosExperiencia, String apellidos, int edad, int id, String nombre, String titulacion) {
        super(apellidos, edad, id, nombre);
        this.añosExperiencia = añosExperiencia;
    }
    public String darMasaje(){
        return "La masajista esta dando un masaje...";
    }

    @Override
    public String toString() {
        return "Masajista{"+" id="+ this.getId() + "titulacion=" + titulacion + ", a\u00f1osExperiencia=" + añosExperiencia + ", apellidos=" + this.getApellidos() +", edad=" + this.getEdad() + ", nombre=" + this.getNombre() + ", titulacion=" + this.getTitulacion()+ '}';
    }
    
}
