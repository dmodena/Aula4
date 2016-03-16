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
public abstract class Veiculo {
    private long carga;

    public long getCarga() {
        return carga;
    }

    public void setCarga(long carga) {
        this.carga = carga;
    }
}
