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
public class Moto extends Veiculo{
    private final long capacidade = 30;
    
    public Moto() {
        setCarga(capacidade);
    }
    
    @Override
    public String toString() {
        return "Moto";
    }
}
