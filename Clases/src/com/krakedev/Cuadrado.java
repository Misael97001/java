package com.krakedev;

public class Cuadrado {

	private int lado;

	public Cuadrado(int lado) {
		this.lado=lado;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public double calcularArea() {
		double areaCuadrado=Math.pow(lado, 2);
		return  areaCuadrado;
	}
	public double perimetroCuadrado() {
		double perimetroCuadrado=lado*4;
		return perimetroCuadrado;
	}
}
