/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author otero.haritz
 */
public class EpekakoErosketa {
    private int epeak =12;
    private boolean ordainketaBukatua = false;
    private double kuota;
    



    public int getEpeak() {
        return epeak;
    }

    public boolean isOrdainketaBukatua() {
        return ordainketaBukatua;
    }

    public double getKuota() {
        return kuota;
    }

    public void setEpeak(int epeak) {
        this.epeak = epeak;
    }

    public void setOrdainketaBukatua(boolean ordainketaBukatua) {
        this.ordainketaBukatua = ordainketaBukatua;
    }

    public void setKuota(double kuota) {
        this.kuota = kuota;
    }
    
    
    
}
