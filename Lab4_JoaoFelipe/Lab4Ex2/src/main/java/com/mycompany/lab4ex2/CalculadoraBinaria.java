/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4ex2;

/**
 *
 * @author joaof
 */
public class CalculadoraBinaria {
    public String somar(String a, String b) {
        int numeroA = Integer.parseInt(a, 2);
        int numeroB = Integer.parseInt(b, 2);
        int soma = numeroA + numeroB;
        return Integer.toBinaryString(soma);
    }

    public String subtrair(String a, String b) {
        int numeroA = Integer.parseInt(a, 2);
        int numeroB = Integer.parseInt(b, 2);
        int subtracao = numeroA - numeroB;
        return Integer.toBinaryString(subtracao);
    }
}

