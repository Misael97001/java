package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.servicios.CalculadoraAmortizacion;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo préstamo = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion ca= new CalculadoraAmortizacion();
        double cuota = ca.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}
