/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/* 

Factory Pattern (Fábrica): Usamos esse padrão para abstrair a criação de objetos 
concretos de veículos, permitindo flexibilidade e extensibilidade no processo de criação. 
Cada fabricante (IVehicleMaker) pode criar diferentes tipos de veículos sem expor a lógica 
de criação ao cliente.

Singleton Pattern (Singleton): Aplicamos este padrão aos fabricantes de veículos 
(Toyota e Honda) para garantir uma única instância de cada fabricante no sistema. 
Isso é útil para representar a unicidade de cada fabricante e para evitar a criação 
desnecessária de múltiplas instâncias que representariam o mesmo fabricante.

*/

package com.mycompany.ex2;

/**
 *
 * @author joaof
 */
public class Ex2 {

  public static void main(String[] args) {
        IVehicleMaker toyotaMaker = Toyota.getInstance();
        IVehicle toyotaCar = toyotaMaker.makeVehicle("Hilux");
        toyotaCar.start();
        toyotaCar.drive();
        toyotaCar.stop();

        IVehicleMaker hondaMaker = Honda.getInstance();
        IVehicle hondaCar = hondaMaker.makeVehicle("Civic");
        hondaCar.start();
        hondaCar.drive();
        hondaCar.stop();
    }
}
