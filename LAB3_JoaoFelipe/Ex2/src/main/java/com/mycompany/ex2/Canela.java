/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author joaof
 */
class Canela extends DecoradorDeBebida {
    Bebida bebida;

    public Canela(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return bebida.getDescricao() + ", com Canela";
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 0.15;
    }
}