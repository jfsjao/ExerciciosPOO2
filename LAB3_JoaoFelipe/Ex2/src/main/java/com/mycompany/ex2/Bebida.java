/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author joaof
 */
abstract class Bebida {
    String descricao = "Bebida desconhecida";

    public String getDescricao() {
        return descricao;
    }

    public abstract double calculaCusto();
}
