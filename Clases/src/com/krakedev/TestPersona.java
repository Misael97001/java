package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p;
		Persona p2= new Persona();
		p=new Persona(); //instancio un objeto persona
		
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEdad());
		
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.57);
		
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
	
		p2.setNombre("Angelina");
		System.out.println("***********");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
		System.out.println("--------------");
	//4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
	
		
		
	}
}
