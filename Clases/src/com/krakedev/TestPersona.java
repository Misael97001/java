package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p;
		Persona p2= new Persona();
		p=new Persona(); //instancio un objeto persona
		
		System.out.println("nombre:"+p.nombre);
		System.out.println("edad:"+p.edad);
		System.out.println("estatura:"+p.estatura);
		
		p.nombre="Mario";
		p.edad=45;
		p.estatura=1.57;
		
		System.out.println("nombre:"+p.nombre);
		System.out.println("edad:"+p.edad);
		System.out.println("estatura:"+p.estatura);
	
		p2.nombre="Angelina";
		System.out.println("***********");
		System.out.println("p.nombre: "+p.nombre);
		System.out.println("p2.nombre: "+p2.nombre);
		System.out.println("--------------");
	//4. Modificar los atributos
		p.nombre="Mario";
		p.edad=45;
		p.estatura=1.56;
		
		
		System.out.println("nombre:"+p.nombre);
		System.out.println("edad:"+p.edad);
		System.out.println("estatura:"+p.estatura);
	
		
		
	}
}
