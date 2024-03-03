/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4ex1;

/**
 *
 * @author joaof
 */
public class Lab4Ex1 {

    public static void main(String[] args){
        PatoDomestico patoDomestico = new PatoDomestico();
        PavaoAzul pavaoAzul = new PavaoAzul();

        System.out.println("Pato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();
        patoDomestico.nadar(); // Demonstração do método específico

        System.out.println("\nPavão Azul:");
        pavaoAzul.voar(); // Lembrando que o pavão não voa, segundo a implementação anterior
        pavaoAzul.emitirSom();
        pavaoAzul.exibirPlumagem(); // Demonstração do método específico
    }
}
