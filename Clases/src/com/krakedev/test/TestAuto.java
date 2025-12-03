package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Auto auto1 =new Auto("Mercedes", 2025, (float) (312.22));
	 Auto auto2=new Auto();
	 auto2.setMarca("Chevrolet");
	 auto2.setAnio(2023);
	 auto2.setPrecio((float) 432.22);
	
	
	
	 System.out.println("Marca: "+auto1.getMarca());
	 System.out.println("Anio: "+auto1.getAnio());
	 System.out.println("Precio: "+auto1.getPrecio());
		

	 
	 System.out.println("Marca: "+auto2.getMarca());
	 System.out.println("Anio: "+auto2.getAnio());
	 System.out.println("Precio: "+auto2.getPrecio());
	 
	 
	}


}
