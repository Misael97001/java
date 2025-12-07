package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));
        maquina.agregarCelda(new Celda("D1"));
        maquina.agregarCelda(new Celda("D2"));
        maquina.agregarCelda(new Celda("E1"));
        maquina.agregarCelda(new Celda("E2"));
		
		Producto producto1=new Producto("MW34","Mani",0.85);
		maquina.cargarProducto(producto1, "C1", 4);
		
		Producto producto2=new Producto("KQ13","Aceite",1.85);
		maquina.cargarProducto(producto2, "C2", 5);
		
		Producto producto3=new Producto("KR98","Arroz",0.50);
		maquina.cargarProducto(producto3, "D1", 2);
		
		Producto producto4=new Producto("UT12","Colas",1.50);
		maquina.cargarProducto(producto4, "D2", 6);
		
		Producto producto5=new Producto("QP65","Arbeja",0.25);
		maquina.cargarProducto(producto5, "E1", 2);
		
		Producto producto6=new Producto("UT12","Atun",3.50);
		maquina.cargarProducto(producto6, "E2", 6);
		
		ArrayList<Producto> celdasMenores =maquina.buscarMenores(5);

			System.out.println("Productos menores: "+celdasMenores.size());
			
			for (int i=0; i<celdasMenores.size();i++) {
				System.out.println("Nombre: "+celdasMenores.get(i).getNombre() +" Precio: "+celdasMenores.get(i).getPrecio());
			}

	}

}
