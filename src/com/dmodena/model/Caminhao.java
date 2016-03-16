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
public class Caminhao extends Veiculo {
    private final long capacidade = 8900;
    private int numeroEixos;
    private String placa;
    private String cor;
    
    public Caminhao(int numeroEixos, String placa, String cor) {
        setCarga(capacidade);
        this.numeroEixos = numeroEixos;
        this.placa = placa;
        this.cor = cor;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Caminhão";
    }
}
