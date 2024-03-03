/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_ex3;

/**
 *
 * @author joaof
 */
class ProxyDocumento implements DocumentoConfidencial {
    private DocumentoReal documentoReal;
    private String conteudo;
    private boolean temPermissao;

    public ProxyDocumento(String conteudo, boolean temPermissao) {
        this.conteudo = conteudo;
        this.temPermissao = temPermissao;
    }

    @Override
    public void lerDocumento() {
        if (temPermissao) {
            if (documentoReal == null) {
                documentoReal = new DocumentoReal(conteudo);
            }
            documentoReal.lerDocumento();
        } else {
            System.out.println("Acesso negado. Você não tem permissão para ler este documento.");
        }
    }
}