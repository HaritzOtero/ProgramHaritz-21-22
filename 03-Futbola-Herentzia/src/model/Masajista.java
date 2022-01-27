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

    public Masajista(int añosExperiencia, String apellidos, int edad, int id, String nombre) {
        super(apellidos, edad, id, nombre);
        this.añosExperiencia = añosExperiencia;
    }
    public String darMasaje(){
        return "El masajista esta dando un masaje...";
    }
}
