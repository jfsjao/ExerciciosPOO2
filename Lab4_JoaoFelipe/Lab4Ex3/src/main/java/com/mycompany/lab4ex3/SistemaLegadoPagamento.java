/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab4ex3;

/**
 *
 * @author joaof
 */
// Interface para o sistema de pagamento legado
interface SistemaLegadoPagamento {
    void pagarEmDinheiro(double valor);
    void emitirCheque(String beneficiario, double valor);
}