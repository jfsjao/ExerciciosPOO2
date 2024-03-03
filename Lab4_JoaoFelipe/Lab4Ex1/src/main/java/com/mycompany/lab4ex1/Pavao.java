/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4ex1;

/**
 *
 * @author joaof
 */
public class Pavao implements Ave {
    @Override
    public void voar() {
        // Pavão não pode voar, então esta implementação fica vazia ou pode lançar uma exceção.
        System.out.println("O pavão não pode voar.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O pavão está cantando.");
    }
}