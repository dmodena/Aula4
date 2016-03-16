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
public class Professor extends Pessoa {
    private String departamento;
    private int anoContratacao;
    
    public Professor(String nome, long cpf) {
        super(nome, cpf);
    }
    
    public Professor(String nome, long cpf, String departamento, int anoContratacao) {
        this(nome, cpf);
        this.departamento = departamento;
        this.anoContratacao = anoContratacao;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public int getAnoContratacao() {
        return anoContratacao;
    }
    
    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }
    
    @Override
    public String toString() {
        return super.getNome() + " " + anoContratacao;
    }
}
