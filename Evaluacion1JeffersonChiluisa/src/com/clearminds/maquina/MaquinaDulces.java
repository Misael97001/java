package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;


public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public MaquinaDulces(ArrayList<Celda> celdas, double saldo) {

		this.celdas = celdas;
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("codigo celda: " + elementoCelda.getCodigo());
		}

	}

	public Celda buscarCelda(String codigo) {

		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				return elementoCelda;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stock) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Celda elementoEncontrado = null;
		for (int i = 0; i < celdas.size(); i++) {
			System.out.print(" Codigo: " + celdas.get(i).getCodigo());
			System.out.print(" Stock: " + celdas.get(i).getStock());
			if (celdas.get(i).getProducto() != null) {
				System.out.print(" Producto: " + celdas.get(i).getProducto().getNombre());

				System.out.print(" Precio: " + celdas.get(i).getProducto().getPrecio());

			} else
				System.out.println(" Sin producto asignado");

		}
		System.out.println(" SALDO: "+ saldo);

	}
	
	public Producto buscarProductoEnCelda(String codigo) {

		for (int i = 0; i < celdas.size(); i++) {
			if (codigo.equals(celdas.get(i).getCodigo())) {
			}
		}
		return null;
	}
	
	public double consultarPrecio(String codigo) {
		for(int i=0; i < celdas.size(); i++) {
			if(celdas.get(i).getCodigo().equals(codigo)) {
				return celdas.get(i).getProducto().getPrecio();
			}
		}
		return 0;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
			for (int i=0; i<celdas.size();i++) {
				if(celdas.get(i).getProducto()!=null) {
					if(codigoProducto.equals(celdas.get(i).getProducto().getCodigo())) {
						return celdas.get(i);
					}

				}
			}
		return null;
	}
	
	public void incrementarProductos(String codigoProducto, int stock) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+stock);;
	}
	
	public void vender(String codigoCelda) {
		Celda celdaEncontrada=buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo=saldo+celdaEncontrada.getProducto().getPrecio();
			
	}
	
	public double venderConCambio(String codigoCelda, double valorIngresado) {
		
		Celda celdaEncontrada=buscarCelda(codigoCelda);
		
		double suCambio=0;
		
		if(valorIngresado>celdaEncontrada.getProducto().getPrecio()) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);

			saldo = saldo + celdaEncontrada.getProducto().getPrecio();
			return valorIngresado-celdaEncontrada.getProducto().getPrecio();
		}
		return 0;
		
	}
	
	public ArrayList<Producto> buscarMenores (double limite){
		ArrayList<Producto> menores=new ArrayList<Producto>();
		Producto elemeProducto=null;
		for(int i=0; i<celdas.size();i++) {
			elemeProducto=celdas.get(i).getProducto();
			if(elemeProducto.getPrecio()<limite) {
				menores.add(elemeProducto);
			}
		}
		return menores;	
	}
	
}

