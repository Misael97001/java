package com.krakedev;

public class Cuadrado {

	public int lado;
	
	public double calcularArea() {
		double areaCuadrado=Math.pow(lado, 2);
		return  areaCuadrado;
	}
	public double perimetroCuadrado() {
		double perimetroCuadrado=lado*4;
		return perimetroCuadrado;
	}
}
