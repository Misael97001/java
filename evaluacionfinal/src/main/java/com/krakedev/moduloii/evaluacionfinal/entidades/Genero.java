package com.krakedev.moduloii.evaluacionfinal.entidades;

public class Genero {

	private int id_genero;
	private String nombre;
	
	
	
	public Genero() {
	}

	public Genero(int id_genero, String nombre) {
		super();
		this.id_genero = id_genero;
		this.nombre = nombre;
	}

	public int getId_genero() {
		return id_genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Genero [id_genero=" + id_genero + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}
