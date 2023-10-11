package com.eazybytes.model;

/**
 * @author pedro.neri
 * @project springsecsection5
 * @email pedro.neri@
 * @createat 10/10/2023
 */
public class Retangulo implements Shape {
    private int ladoA;
    private int ladoB;

    public Retangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double area() {
        return this.ladoA * this.ladoB;
    }

    @Override
    public double perimeter() {
        return 2 * (this.ladoB + this.ladoA);
    }
}
