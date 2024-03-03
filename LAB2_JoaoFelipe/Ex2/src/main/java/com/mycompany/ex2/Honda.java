/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author joaof
 */
public class Honda implements IVehicleMaker {
    private static Honda instance;

    private Honda() {}

    public static synchronized Honda getInstance() {
        if (instance == null) {
            instance = new Honda();
        }
        return instance;
    }

    public IVehicle makeVehicle(String modelo) {
        return switch (modelo) {
            case "Civic" -> new Civic();
            case "City" -> new City();
            default -> throw new IllegalArgumentException("Modelo Honda desconhecido: " + modelo);
        };
    }
}

