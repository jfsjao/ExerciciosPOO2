/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4ex2;

/**
 *
 * @author joaof
 */
public class CalculadoraAdapter {
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter() {
        this.calculadoraBinaria = new CalculadoraBinaria();
    }

    public int somar(int a, int b) {
        String resultadoBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }

    public int subtrair(int a, int b) {
        String resultadoBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }

    public int multiplicar(int a, int b) {
        // A calculadora binária original não suporta multiplicação, então realizamos diretamente.
        return a * b;
    }
}

