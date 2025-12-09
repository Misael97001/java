package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	
	ArrayList<Prestamo>prestamos=new ArrayList<Prestamo>();
	ArrayList<Cliente>clientes=new ArrayList<Cliente>();
	
	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncontrado = null;
		for (int i=0; i<clientes.size();i++) {
			if(cedula.equals(clientes.get(i).getCedula())) {
				clienteEncontrado=clientes.get(i);
				
			}
		}
		return clienteEncontrado;
		
	}
	
	public void registrarCliente(Cliente cliente) {
		if(buscarCliente(cliente.getCedula())==null) {
			clientes.add(cliente);
		}
	}
	
	
	public void asignarPrestamo(String cedula, Prestamo presstamo) {
		if(buscarCliente(cedula)==null) {
			System.out.println("No es cliente del banco");
		}else {
			CalculadoraAmortizacion.generarTabla(presstamo);
			CalculadoraAmortizacion.mostrarTabla(presstamo);
		}
	}
	
	public ArrayList<Prestamo> buscarPrestamos (String cedula) {
		Cliente clienteEncontrado=buscarCliente(cedula);
		ArrayList<Prestamo> prestamosCliente= new ArrayList<Prestamo>();
		if(clienteEncontrado!=null) {
			return prestamosCliente; 
		}else {
			return null;
		}
	}
	
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
}
