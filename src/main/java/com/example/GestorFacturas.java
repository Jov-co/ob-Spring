package com.example;

public class GestorFacturas {

    // 1. atributos
    Calculadora calculadora;
    String nombre;
    // 2. Contructores
    public GestorFacturas(Calculadora calculadora, String nombre) {
        System.out.println("Ejecutando constructor gestor de facturas");
        this.calculadora = calculadora;
        this.nombre = nombre;
    }

    // 3. Metodos....
}
