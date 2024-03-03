/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_ex3;

/**
 *
 * @author joaof
 */
class DocumentoReal implements DocumentoConfidencial {
    private String conteudo;

    public DocumentoReal(String conteudo) {
        this.conteudo = conteudo;
        carregarDocumento();
    }

    private void carregarDocumento() {
        System.out.println("Carregando documento... " + conteudo);
    }

    @Override
    public void lerDocumento() {
        System.out.println("Lendo documento: " + conteudo);
    }
}