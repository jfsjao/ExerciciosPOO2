/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4ex3;

/**
 *
 * @author joaof
 */
public class Lab4Ex3 {

    public static void main(String[] args) {
        SistemaLegadoPagamento sistemaLegado = new SistemaLegadoPagamento() {
            @Override
            public void pagarEmDinheiro(double valor) {
                System.out.println("Pagando em dinheiro: " + valor);
            }

            @Override
            public void emitirCheque(String beneficiario, double valor) {
                System.out.println("Emitindo cheque para: " + beneficiario + ", Valor: " + valor);
            }
        };

        SistemaModernoPagamento sistemaModerno = new SistemaPagamentoAdapter(sistemaLegado);

        sistemaModerno.pagarComCartaoCredito("1234 5678 9012 3456", 150.0);
        sistemaModerno.realizarTransferencia("12345-6", 300.0);
    }
}

