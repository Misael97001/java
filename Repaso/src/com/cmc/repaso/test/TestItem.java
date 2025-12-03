package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
	
	public static void main(String[] args) {
		Item item= new Item();
		item.setProductosActuales(20);
		
		System.out.println("*********");
		item.imprimir();
		item.vender(10);
		item.devolver(5);
		
		System.out.println("*********");
		item.imprimir();
	
		Item item2=new Item();
		item2.setNombre("Papas");
		item2.setProductosActuales(100);
		item2.vender(20);
		item2.devolver(10);
		
		System.out.println("*********");
		item2.imprimir();
	}
}
