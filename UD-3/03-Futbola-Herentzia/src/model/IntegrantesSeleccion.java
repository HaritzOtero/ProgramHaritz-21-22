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
public class IntegrantesSeleccion {
    private String apellidos;
    private int edad;
    protected int id;
    protected String nombre;

    public IntegrantesSeleccion(String apellidos, int edad, int id, String nombre) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String concentrarse(){
        return "...esta concentrado para el partido...";
    }
    public String viajar(){
        return "...esta viajando...";
    }
}
