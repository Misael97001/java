package com.cmc.evaluacion.entidades;

public class Utilitario {
	
	public double redondear(double valor) {
		double numeroRedondeado= Math.round(valor*100.0)/100.0;
		return numeroRedondeado;
	}
	
}
