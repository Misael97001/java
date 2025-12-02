package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Auto auto1 =new Auto();
	 Auto auto2=new Auto();
	 
	 auto1.setMarca("Mercedes");
	 auto1.setAnio(2025);
	 auto1.setPrecio((float) (312.22));
	
	
	 System.out.println("Marca: "+auto1.getMarca());
	 System.out.println("Anio: "+auto1.getAnio());
	 System.out.println("Precio: "+auto1.getPrecio());
		
	 auto2.setMarca("Chevrolet");
	 auto2.setAnio(2023);
	 auto2.setPrecio((float) 432.22);
	 
	 System.out.println("Marca: "+auto2.getMarca());
	 System.out.println("Anio: "+auto2.getAnio());
	 System.out.println("Precio: "+auto2.getPrecio());
	 
	 
	}


}
