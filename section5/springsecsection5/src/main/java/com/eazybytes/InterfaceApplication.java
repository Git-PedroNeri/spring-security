package com.eazybytes;

import com.eazybytes.model.Circulo;
import com.eazybytes.model.Retangulo;
import com.eazybytes.service.CalculusService;

/**
 * @author pedro.neri
 * @project springsecsection5
 * @email pedro.neri@
 * @createat 10/10/2023
 */
public class InterfaceApplication {


    public static void main(String[] args) {
        Circulo circulo = new Circulo(20);
        Retangulo retangulo = new Retangulo(20, 30);
        CalculusService retanguloService = new CalculusService(retangulo);
        CalculusService circuloService = new CalculusService(circulo);

        System.out.println("Area Circulo = " + circuloService.calcularArea());
        System.out.println("Perimetro Circulo = " + circuloService.calcularPerimetro());
        System.out.println("Area Retangulo = " + retanguloService.calcularArea());
        System.out.println("Perimetro Retangulo = " + retanguloService.calcularPerimetro());


    }

}
