package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1=new Persona();
		p1.setNombre("Romario");
		p1.setApellido("Meneses");
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av. Siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-45");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		System.out.println(nombre);
		// d1 ESTA NULL Y TRATA DE INVOCAR ALGUN METODO
		System.out.println(d1.getCallePrincipal());
	
		p1.imprimir();
		Persona p2=new Persona();
		Direccion d2=new Direccion("Avenida shirys", "Eloy Alfaro", "S/N");
 		p2.setNombre("Anastasia");
 		p2.setDireccion(d2);
 		Persona p3=new Persona();
 		p3.setDireccion(new Direccion("xx","yyy","123"));
		p2.imprimir();
		System.out.println("fin");
	}

}
