package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Auto auto1 =new Auto();
	 Auto auto2=new Auto();
	 
	 auto1.marca="Mercedes";
	 auto1.anio=2025;
	 auto1.precio=(float) 312.22;
	 
	 System.out.println("Marca: "+auto1.marca);
	 System.out.println("Anio: "+auto1.anio);
	 System.out.println("Precio: "+auto1.precio);
		
	 auto2.marca="Chevrolet";
	 auto2.anio=2023;
	 auto2.precio=(float) 432.22;
	 
	 System.out.println("Marca: "+auto2.marca);
	 System.out.println("Anio: "+auto2.anio);
	 System.out.println("Precio: "+auto2.precio);
	 
	 
	}


}
