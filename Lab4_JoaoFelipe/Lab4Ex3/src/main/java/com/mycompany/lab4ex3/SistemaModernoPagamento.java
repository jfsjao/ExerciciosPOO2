/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab4ex3;

/**
 *
 * @author joaof
 */
// Interface para o sistema de pagamento moderno
interface SistemaModernoPagamento {
    void pagarComCartaoCredito(String detalhes, double valor);
    void realizarTransferencia(String contaDestino, double valor);
}
