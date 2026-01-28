package com.krakedev.moduloii.evaluacionfinal.entidades;

import java.util.Date;

public class Prestamo {

	private int id_prestamo;
	private Libro libro;
	private String usuario;
	private Date fecha_prestamo;
	private Date fecha_devolucion;
	
	public Prestamo() {
	}

	public Prestamo(int id_prestamo, Libro libro, String usuario, Date fecha_prestamo, Date fecha_devolucion) {
		super();
		this.id_prestamo = id_prestamo;
		this.libro = libro;
		this.usuario = usuario;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_devolucion = fecha_devolucion;
	}

	public int getId_prestamo() {
		return id_prestamo;
	}

	public Libro getLibro() {
		return libro;
	}

	public String getUsuario() {
		return usuario;
	}

	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}

	public Date getFecha_devolucion() {
		return fecha_devolucion;
	}

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}

	public void setFecha_devolucion(Date fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}

	@Override
	public String toString() {
		return "Prestamo [id_prestamo=" + id_prestamo + ", libro=" + libro + ", usuario=" + usuario
				+ ", fecha_prestamo=" + fecha_prestamo + ", fecha_devolucion=" + fecha_devolucion + "]";
	}

	
	
	
	
	
	
}
