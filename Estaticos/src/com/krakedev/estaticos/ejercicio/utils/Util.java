package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int numero) {
		
		if (numero >= 0 && numero < 10) {
            return "0" + numero; 
        }
        return numero + "";
	}
	
	public static String formatearDia(int dia) {
        if (dia == DiasSemana.LUNES) return "Lunes"; 
        if (dia == DiasSemana.MARTES) return "Martes"; 
        if (dia == DiasSemana.MIERCOLES) return "Miércoles";
        if (dia == DiasSemana.JUEVES) return "Jueves"; 
        if (dia == DiasSemana.VIERNES) return "Viernes";
        if (dia == DiasSemana.SABADO) return "Sábado";
        if (dia == DiasSemana.DOMINGO) return "Domingo"; 
        return "Día inválido";
    }
}
