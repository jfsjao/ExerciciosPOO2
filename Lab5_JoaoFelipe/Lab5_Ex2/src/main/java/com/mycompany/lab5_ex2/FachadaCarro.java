/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_ex2;

/**
 *
 * @author joaof
 */
public class FachadaCarro {
    private Motor motor = new Motor();
    private CintoDeSeguranca cinto = new CintoDeSeguranca();
    private Porta porta = new Porta();
    private Farol farol = new Farol();
    private Radio radio = new Radio();

    public void iniciarCorrida(String estacaoPreferida) {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacao(estacaoPreferida);
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}


