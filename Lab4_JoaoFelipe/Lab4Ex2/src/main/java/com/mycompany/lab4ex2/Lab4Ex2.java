/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4ex2;

/**
 *
 * @author joaof
 */
public class Lab4Ex2 {

    public static void main(String[] args) {
        CalculadoraAdapter calculadora = new CalculadoraAdapter();

        // Operações Decimais
        System.out.println("Soma Decimal: 10 + 5 = " + calculadora.somar(10, 5));
        System.out.println("Subtração Decimal: 10 - 5 = " + calculadora.subtrair(10, 5));
        System.out.println("Multiplicação Decimal: 10 * 5 = " + calculadora.multiplicar(10, 5));

        // Operações Binárias (demonstração com a calculadora binária diretamente)
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();
        System.out.println("Soma Binária: 1010 + 101 = " + calculadoraBinaria.somar("1010", "101"));
        System.out.println("Subtração Binária: 1010 - 101 = " + calculadoraBinaria.subtrair("1010", "101"));
    }
}
