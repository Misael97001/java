package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {
	
	public static void main(String[] args) {
		
		Producto productoA= new Producto();
		Producto productoB= new Producto();
		Producto productoC= new Producto();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Alibia el dolor");
		productoA.setPrecio((float) 0.65);
		productoA.setStockActual(1200);
		
		productoB.setNombre("Bloqueador Solar");
		productoB.setDescripcion("Cuidado de la piel");
		productoB.setPrecio((float) 21.62);
		productoB.setStockActual(700);
		
		productoC.setNombre("Pasta de dientes");
		productoC.setDescripcion("Aseo personal");
		productoC.setPrecio((float) 1.50);
		productoC.setStockActual(2300);
		
		
		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("descripcion: "+productoA.getDescripcion());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("stockAnual: "+productoA.getStockActual());

		System.out.println("*****************");

		System.out.println("nombre: "+productoB.getNombre());
		System.out.println("descripcion: "+productoB.getDescripcion());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("stockAnual: "+productoB.getStockActual());

		System.out.println("*****************");

		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("descripcion: "+productoC.getDescripcion());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("stockAnual: "+productoC.getStockActual());

		
		
	}
	
	

}
