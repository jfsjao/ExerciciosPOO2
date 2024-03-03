    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_ex3;

/**
 *  O sistema deve verificar se um usuário tem permissão para acessar um documento antes de permitir a leitura do mesmo.
 * @author joaof
 */
public class Lab5_Ex3 {

    public static void main(String[] args) {
        DocumentoConfidencial documento1 = new ProxyDocumento("Documento_Secreto_123.txt", true);
        documento1.lerDocumento();

        System.out.println("\nTentando acessar com permissão negada:");
        DocumentoConfidencial documento2 = new ProxyDocumento("Documento_Secreto_123.txt", false);
        documento2.lerDocumento();
    }
}   
