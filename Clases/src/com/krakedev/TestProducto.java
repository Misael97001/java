package com.krakedev;

public class TestProducto {
	
	public static void main(String[] args) {
		
		Producto productoA= new Producto();
		Producto productoB= new Producto();
		Producto productoC= new Producto();
		
		productoA.nombre="Paracetamol";
		productoA.descripcion="Alibia el dolor";
		productoA.precio=(float) 0.65;
		productoA.stockActual=1200;
		
		productoB.nombre="Bloqueador Solar";
		productoB.descripcion="Cuidado de la piel";
		productoB.precio=(float) 21.62;
		productoB.stockActual=700;
		
		productoC.nombre="Pasta de dientes";
		productoC.descripcion="Aseo personalr";
		productoC.precio=(float) 1.50;
		productoC.stockActual=2300;
		
		
		System.out.println("nombre: "+productoA.nombre);
		System.out.println("descripcion: "+productoA.descripcion);
		System.out.println("precio: "+productoA.precio);
		System.out.println("stockAnual: "+productoA.stockActual);

		System.out.println("*****************");

		System.out.println("nombre: "+productoB.nombre);
		System.out.println("descripcion: "+productoB.descripcion);
		System.out.println("precio: "+productoB.precio);
		System.out.println("stockAnual: "+productoB.stockActual);

		System.out.println("*****************");

		System.out.println("nombre: "+productoC.nombre);
		System.out.println("descripcion: "+productoC.descripcion);
		System.out.println("precio: "+productoC.precio);
		System.out.println("stockAnual: "+productoC.stockActual);

		
		
	}
	
	

}
