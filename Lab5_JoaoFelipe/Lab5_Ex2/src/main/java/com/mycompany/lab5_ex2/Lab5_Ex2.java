/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_ex2;

/**
 *
 * @author joaof
 */
public class Lab5_Ex2 {
    public static void main(String[] args) {
        FachadaCarro carro = new FachadaCarro();
        carro.iniciarCorrida("FM 98.5");
        System.out.println("Corrida iniciada!");
        carro.finalizarCorrida();
        System.out.println("Corrida finalizada!");
    }
}