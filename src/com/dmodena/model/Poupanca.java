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
public class Poupanca extends Conta {
    private double taxaCorrecao = 0.3;
    
    public Poupanca(String nome, int numero, double saldo) {
        super(nome, numero, saldo);
    }

    public double getTaxaCorrecao() {
        return taxaCorrecao;
    }

    public void setTaxaCorrecao(double taxaCorrecao) {
        this.taxaCorrecao = taxaCorrecao;
    }
    
    public double calcularTaxaCorrecao() {
        return super.getSaldo() * taxaCorrecao;
    }
}
