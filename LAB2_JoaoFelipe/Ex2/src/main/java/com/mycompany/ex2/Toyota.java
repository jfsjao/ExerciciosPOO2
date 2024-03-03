/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author joaof
 */
public class Toyota implements IVehicleMaker {
    private static Toyota instance;

    private Toyota() {}

    public static synchronized Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }

    public IVehicle makeVehicle(String modelo) {
        return switch (modelo) {
            case "Corolla" -> new Corolla();
            case "Hilux" -> new Hilux();
            default -> throw new IllegalArgumentException("Modelo Toyota desconhecido: " + modelo);
        };
    }
}
