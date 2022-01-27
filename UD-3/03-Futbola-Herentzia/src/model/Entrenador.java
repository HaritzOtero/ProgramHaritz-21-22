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
public class Entrenador extends IntegrantesSeleccion {
    private String idFederacion;

    public Entrenador(String apellidos, int edad, int id, String nombre) {
        super(apellidos, edad, id, nombre);
    }

    public Entrenador(String idFederacion, String apellidos, int edad, int id, String nombre) {
        super(apellidos, edad, id, nombre);
        this.idFederacion = idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    public String dirigirEntrenamiento (){
        return "El entrenador esta dirigiendo el entrenamiento...";
    }
    public String dirigirPartido(){
        return "El entrenador esta dirigiendo el partido...";
    }
    
}
