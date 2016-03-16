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
public class Aluno extends Pessoa {
    private String curso;
    
    public Aluno(String nome, long cpf) {
        super(nome, cpf);
    }
    
    public Aluno(String nome, long cpf, String curso) {
        this(nome, cpf);
        this.curso = curso;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return super.getNome() + " " + curso;
    }
}
