package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto(123, "Papas");
		producto1.setDescripcion("Carbohidrato");
		producto1.setPeso(2.2);
		
		System.out.println("PRODUCTO");
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso en lb: "+producto1.getPeso());

	}

}
