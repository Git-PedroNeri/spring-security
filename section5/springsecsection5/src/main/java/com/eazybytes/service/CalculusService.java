package com.eazybytes.service;

import com.eazybytes.model.Shape;

/**
 * @author pedro.neri
 * @project springsecsection5
 * @email pedro.neri@
 * @createat 10/10/2023
 */
public class CalculusService {
    Shape shape;

    public CalculusService(Shape shape) {
        this.shape = shape;
    }

    public double calcularArea() {
        return this.shape.area();
    }

    public double calcularPerimetro() {
        return this.shape.perimeter();
    }

}
