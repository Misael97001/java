package com.krakedev.estaticos;

public class TestEsataticos {

	public static void main(String[] args) {
		//Para invocar un metodo estatico se le hace directamente
		//desde la clase
		double numero=Math.random();
		System.out.println(numero);
		int radio=10;
		double area=Math.PI*radio;
		System.out.println(area);
	}

}
