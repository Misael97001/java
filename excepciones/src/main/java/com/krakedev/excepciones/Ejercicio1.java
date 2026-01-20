package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a=null;
		try {
			System.out.println("ABRE CONEXION A BDD");
			a.substring(3);	
			System.out.println("fin");			
		}catch (Exception ex) {
			System.out.println("Entra al catch");
		} finally {
			System.out.println("Ingres al finally ");
			System.out.println("CIERRA CONEXION A BDD");
		}
		
		System.out.println("Fuera del catch");
		
	}

}
