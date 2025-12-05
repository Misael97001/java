package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	// INICIALIZAR LAS CELDAS PARA EVITAR EL NULL POINTER EXCEPCION
	public MaquinaDulces() {
		celda1 = new Celda(null);
		celda2 = new Celda(null);
		celda3 = new Celda(null);
		celda4 = new Celda(null);
	}

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1.setCodigo(c1);
		celda2.setCodigo(c2);
		celda3.setCodigo(c3);
		celda4.setCodigo(c4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1 " + celda1.getCodigo() + "CELDA 2 " + celda2.getCodigo() + "CELDA 3 "
				+ celda3.getCodigo() + "CELDA 4 " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (codigo.equals(celda1.getCodigo())) {
			return celda1;
		}
		if (codigo.equals(celda2.getCodigo())) {
			return celda2;
		}
		if (codigo.equals(celda3.getCodigo())) {
			return celda3;
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {

		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostarProductos() {

		System.out.println("*****CELDA: " + celda1.getCodigo() + " stock actual: " + celda1.getStock());
		if (celda1.getProducto() != null) {

			System.out.println(
					" nombre: " + celda1.getProducto().getNombre() + " precio: " + celda1.getProducto().getPrecio());
		}

		System.out.println("*****CELDA " + celda2.getCodigo() + " stock actual: " + celda2.getStock());
		if (celda2.getProducto() != null) {

			System.out.println(
					" nombre: " + celda2.getProducto().getNombre() + " precio: " + celda2.getProducto().getPrecio());

		}

		System.out.println("*****CELDA " + celda3.getCodigo() + " stock actual: " + celda3.getStock());
		if (celda3.getProducto() != null) {

			System.out.println(
					" nombre: " + celda3.getProducto().getNombre() + " precio: " + celda3.getProducto().getPrecio());

		}

		System.out.println("*****CELDA " + celda4.getCodigo() + " stock actual: " + celda4.getStock());
		if (celda4.getProducto() != null) {

			System.out.println(
					" nombre: " + celda4.getProducto().getNombre() + " precio: " + celda4.getProducto().getPrecio());
		}

		System.out.println("Saldo" + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1.getProducto();
		}
		if (codigo == celda2.getCodigo()) {
			return celda2.getProducto();
		}
		if (codigo == celda3.getCodigo()) {
			return celda3.getProducto();
		}
		if (codigo == celda4.getCodigo()) {
			return celda4.getProducto();
		}
		return null;
	}

	public double consultarPrecio(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		}
		if (codigo == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		}
		if (codigo == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		}
		if (codigo == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		}
		return 0;
	}

	public Celda buscarCeldaProducto(String codigo) {

			if(celda1.getProducto()!=null) {
				if (codigo == celda1.getProducto().getCodigo()) {
					return celda1;
				}
			}
			
			if(celda2.getProducto()!=null) {
				if (codigo == celda1.getProducto().getCodigo()) {
					return celda1;
				}
			}
		
			if(celda3.getProducto()!=null) {
				if (codigo == celda3.getProducto().getCodigo()) {
					return celda3;
				}
			}
		
			if(celda4.getProducto()!=null) {

				if (codigo == celda4.getProducto().getCodigo()) {
				return celda4;	
			}
		}
		return null;
	}

	public void incrementarProductos(String codigo, int stock) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + stock);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		mostarProductos();
	}

	public double venderConCambio(String codigo, double valorIngresado) {
		double valorConsultado = consultarPrecio(codigo);
		double cambio = valorConsultado - valorIngresado;
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = saldo + valorConsultado;
		return cambio;
	}
}
