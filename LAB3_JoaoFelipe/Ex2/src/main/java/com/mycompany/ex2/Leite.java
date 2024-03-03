/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author joaof
 */
class Leite extends DecoradorDeBebida {
    Bebida bebida;

    public Leite(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return bebida.getDescricao() + ", com Leite";
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 0.20;
    }
}