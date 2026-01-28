package com.krakedev.moduloii.evaluacionfinal.entidades;

import java.util.Date;

public class Autor {
	
	private int id_autor;
	private String nombre;
	private Date fecha_nacimiente;
	private String nacionalidad;
	
	
	
	public Autor() {

	}
	public Autor(int id_autor, String nombre, Date fecha_nacimiente, String nacionalidad) {
		super();
		this.id_autor = id_autor;
		this.nombre = nombre;
		this.fecha_nacimiente = fecha_nacimiente;
		this.nacionalidad = nacionalidad;
	}
	public int getId_autor() {
		return id_autor;
	}
	public String getNombre() {
		return nombre;
	}
	public Date getFecha_nacimiente() {
		return fecha_nacimiente;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFecha_nacimiente(Date fecha_nacimiente) {
		this.fecha_nacimiente = fecha_nacimiente;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Autor [id_autor=" + id_autor + ", nombre=" + nombre + ", fecha_nacimiente=" + fecha_nacimiente
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
	
	
}
