package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto p1= new Producto("Collares",12.50);
		p1.setPrecio(14);
		double valorP1=p1.calcularPrecioPromo(20);
		System.out.println(valorP1);
	}

}
