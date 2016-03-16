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
public class Barco extends Veiculo{
    private final long capacidade = 75000000;
    private int comprimento;
    private int largura;
    private String bandeiraPais;
    private int triuplantes;
    
    public Barco(int comprimento, int largura, String bandeiraPais, int tripulantes) {
        setCarga(capacidade);
        this.comprimento = comprimento;
        this.largura = largura;
        this.bandeiraPais = bandeiraPais;
        this.triuplantes = tripulantes;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getBandeiraPais() {
        return bandeiraPais;
    }

    public void setBandeiraPais(String bandeiraPais) {
        this.bandeiraPais = bandeiraPais;
    }

    public int getTriuplantes() {
        return triuplantes;
    }

    public void setTriuplantes(int triuplantes) {
        this.triuplantes = triuplantes;
    }
    
    @Override
    public String toString() {
        return "Barco";
    }
}
