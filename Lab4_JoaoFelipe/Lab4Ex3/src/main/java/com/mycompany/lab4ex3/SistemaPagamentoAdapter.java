/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4ex3;

/**
 *
 * @author joaof
 */
class SistemaPagamentoAdapter implements SistemaModernoPagamento {
    private SistemaLegadoPagamento sistemaLegado;

    public SistemaPagamentoAdapter(SistemaLegadoPagamento sistemaLegado) {
        this.sistemaLegado = sistemaLegado;
    }

    @Override
    public void pagarComCartaoCredito(String detalhes, double valor) {
        //converter o pagamento por cartão em um pagamento em dinheiro, por exemplo
        System.out.println("Convertendo pagamento por cartão em pagamento em dinheiro.");
        sistemaLegado.pagarEmDinheiro(valor);
    }

    @Override
    public void realizarTransferencia(String contaDestino, double valor) {
        //converter uma transferência bancária em um cheque
        System.out.println("Convertendo transferência bancária em emissão de cheque.");
        sistemaLegado.emitirCheque(contaDestino, valor);
    }
}


