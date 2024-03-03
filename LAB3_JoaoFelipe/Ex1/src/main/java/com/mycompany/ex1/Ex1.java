/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @author joaof
 */
public class Ex1 {
    
    public static void main(String [] args) {
        
        Pizza massaFina = new MassaFinaPizza();
        Pizza mar = new Ovo(massaFina);
        
        System.out.println(mar.custo());
        System.err.println(mar.getDescricao());
    }
}    