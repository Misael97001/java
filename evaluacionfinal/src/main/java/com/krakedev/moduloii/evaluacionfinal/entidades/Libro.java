package com.krakedev.moduloii.evaluacionfinal.entidades;

public class Libro {

	private int id_libro;
	private String titulo;
	private Autor autor;
	private Genero genero;
	private int anio_publicacion;
	private boolean estado_disponible;
	
	public Libro() {
	}

	public Libro(int id_libro, String titulo, Autor autor, Genero genero, int anio_publicacion,
			boolean estado_disponible) {
		super();
		this.id_libro = id_libro;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anio_publicacion = anio_publicacion;
		this.estado_disponible = estado_disponible;
	}

	public int getId_libro() {
		return id_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public int getAnio_publicacion() {
		return anio_publicacion;
	}

	public boolean isEstado_disponible() {
		return estado_disponible;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void setAnio_publicacion(int anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
	}

	public void setEstado_disponible(boolean estado_disponible) {
		this.estado_disponible = estado_disponible;
	}

	@Override
	public String toString() {
		return "Libro [id_libro=" + id_libro + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero
				+ ", anio_publicacion=" + anio_publicacion + ", estado_disponible=" + estado_disponible + "]";
	}
	
	
	
	
}
