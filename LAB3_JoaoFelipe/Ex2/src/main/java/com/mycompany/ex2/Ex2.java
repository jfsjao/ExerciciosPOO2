/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author joaof
 */
public class Ex2 {
    public static void main(String[] args) {
        Bebida bebida = new Expresso();
        System.out.println(bebida.getDescricao() + " R$" + bebida.calculaCusto());

        Bebida bebida2 = new Decaf();
        bebida2 = new Leite(bebida2);
        bebida2 = new Canela(bebida2);
        bebida2 = new Chocolate(bebida2);
        System.out.println(bebida2.getDescricao() + " R$" + bebida2.calculaCusto());
    }
}
