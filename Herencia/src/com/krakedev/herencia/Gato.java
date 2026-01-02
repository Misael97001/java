package com.krakedev.herencia;

public class Gato extends Animal {

	
	public  void dormir () {
		System.out.println("Gato durmiendo");
	}
	
	public void maullar() {
		System.out.println("El gato maulla");
	}
	
	public void maullar(String nombre) {
		System.out.println("El gato "+nombre+" maulla");
	}
	
}
