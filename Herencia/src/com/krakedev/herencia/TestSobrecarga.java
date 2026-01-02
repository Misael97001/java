package com.krakedev.herencia;

public class TestSobrecarga {

	public static void main(String[] args) {
	
		Gato g= new Gato();
		System.out.println("INVOCO LOS METODOS SOBRECARGADOS");
		g.maullar();
		g.maullar("Pedro");
	}

}
