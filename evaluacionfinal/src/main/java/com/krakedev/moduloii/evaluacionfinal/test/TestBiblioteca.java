package com.krakedev.moduloii.evaluacionfinal.test;


import java.util.ArrayList;

import com.krakedev.moduloii.evaluacionfinal.entidades.Autor;
import com.krakedev.moduloii.evaluacionfinal.entidades.Genero;
import com.krakedev.moduloii.evaluacionfinal.entidades.Libro;
import com.krakedev.moduloii.evaluacionfinal.entidades.Prestamo;
import com.krakedev.moduloii.evaluacionfinal.servicios.AdminBiblioteca;

public class TestBiblioteca {

	public static void main(String[] args) {
		
		AdminBiblioteca admin = new AdminBiblioteca();

        try {
        	// 1. Inserción
            Autor a = new Autor(); a.setId_autor(1);
            Genero g = new Genero(); g.setId_genero(1);
            Libro nuevo = new Libro(0, "Cien años de soledad", a, g, 1967, true);
            admin.insertarLibro(nuevo);
            System.out.println("Libro insertado.");

            // 2. Actualización
            admin.actualizarEstado(1, false);
            System.out.println("Estado actualizado.");

            // 3. Mostrar Libros
             ArrayList<Libro> libros = admin.mostrarLibros();
            for (Libro l : libros) {
                System.out.println(l.getTitulo() + " - Año: " + l.getAnio_publicacion());
            }
            
            // 4. Mostrar Préstamos
            ArrayList<Prestamo> prestamos = admin.mostrarPrestamos();
            for (Prestamo p : prestamos) {
                System.out.println("Prestamo: " + p.getUsuario() + " Libro: " + p.getLibro().getTitulo());
            }

        } catch (Exception e) {
            System.out.println("Error en test: " + e.getMessage());
        }
    }
}