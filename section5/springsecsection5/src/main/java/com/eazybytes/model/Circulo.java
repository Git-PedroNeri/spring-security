package com.eazybytes.model;

/**
 * @author pedro.neri
 * @project springsecsection5
 * @email pedro.neri@
 * @createat 10/10/2023
 */
public class Circulo implements Shape {
    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.raio;
    }
}
