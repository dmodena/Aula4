/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

/**
 *
 * @author e-fit1
 */
public class Aviao extends Veiculo {
    private final long capacidade = 5800;
    private double autonomia;
    
    public Aviao(double autonomia) {
        setCarga(capacidade);
        this.autonomia = autonomia;
    }    

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    
    @Override
    public String toString() {
        return "Avião";
    }
}
