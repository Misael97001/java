package com.krakedev.moduloii.evaluacionfinal.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.moduloii.evaluacionfinal.entidades.Autor;
import com.krakedev.moduloii.evaluacionfinal.entidades.Genero;
import com.krakedev.moduloii.evaluacionfinal.entidades.Libro;
import com.krakedev.moduloii.evaluacionfinal.entidades.Prestamo;
import com.krakedev.moduloii.evaluacionfinal.utils.ConexionBDD;

public class AdminBiblioteca {

	private static final Logger LOGGER = LogManager.getLogger(AdminBiblioteca.class);

	public ArrayList<Libro> mostrarLibros() throws Exception {

		ArrayList<Libro> libros = new ArrayList<Libro>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			String sql = "Select l.id_libro, l.titulo, a.nombre, g.nombre, l.anio_publicacion, l.estado_disponible"
					+ " from libros l, autores a, generos g " + "where l.id_autor_fk = a.id_autor "
					+ "and l.id_genero_fk=g.id_genero";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) { // Recorre el ResultSet fila por fila
				// Extraemos datos y creamos objetos intermedios
				Autor au = new Autor();
				au.setNombre(rs.getString(3)); // Columna 3 es el nombre del autor

				Genero ge = new Genero();
				ge.setNombre(rs.getString(4)); // Columna 4 es el nombre del género

				Libro li = new Libro(); // Creamos el objeto Libro
				li.setId_libro(rs.getInt(1));
				li.setTitulo(rs.getString(2));
				li.setAutor(au);
				li.setGenero(ge);
				li.setAnio_publicacion(rs.getInt(5));
				li.setEstado_disponible(rs.getBoolean(6));

				libros.add(li); // Agregamos el libro a la lista
			}
			LOGGER.info("Consulta de libros exitosa."); // Registro en el log

		} catch (Exception e) {
			LOGGER.error("Error al consultar libros");
			throw new Exception("Error al consultar");
		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				// el mensaje y el objeto exception
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		return libros;
	}

	public ArrayList<Prestamo> mostrarPrestamos() throws Exception {
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // ResultSet interno para la lectura de filas

		try {
			con = ConexionBDD.conectar();
			// SQL: Selecciona datos del préstamo y el título del libro comparando IDs en el
			// WHERE
			// Atributos requeridos: id_prestamo, libro_id, usuario, fecha_prestamo,
			// fecha_devolucion
			String sql = "SELECT p.id_prestamo, p.usuario, p.fecha_prestamo, p.fecha_devolucion, l.titulo, l.id_libro "
					+ "FROM prestamos p, libros l " + "WHERE p.id_libro_fk = l.id_libro"; // Comparación directa de FK y PK

			ps = con.prepareStatement(sql);
			// executeQuery: Se usa para obtener el ResultSet con los registros de la base
			rs = ps.executeQuery();

			while (rs.next()) {
				// 1. Creamos el objeto Libro para asociarlo al préstamo
				Libro li = new Libro();
				li.setId_libro(rs.getInt("id_libro"));
				li.setTitulo(rs.getString("titulo"));

				// 2. Creamos el objeto Prestamo con todos los datos de la fila
				Prestamo pres = new Prestamo();
				pres.setId_prestamo(rs.getInt("id_prestamo"));
				pres.setUsuario(rs.getString("usuario")); // Campo opcional o requerido según interpretación
				pres.setFecha_prestamo(rs.getDate("fecha_prestamo"));
				pres.setFecha_devolucion(rs.getDate("fecha_devolucion"));
				pres.setLibro(li); // Asignamos el objeto libro al préstamo

				prestamos.add(pres); // Agregamos a la lista final
			}
			LOGGER.info("Consulta de préstamos realizada con éxito.");
		} catch (Exception e) {
			LOGGER.error("Error al consultar libros");
			throw new Exception("Error al consultar");
		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				// el mensaje y el objeto exception
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		return prestamos;
	}
	
	public void insertarLibro(Libro libro) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConexionBDD.conectar();
            String sql = "INSERT INTO libros (titulo, id_autor_fk, id_genero_fk, anio_publicacion, estado_disponible) " +
                         "VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, libro.getTitulo());
            ps.setInt(2, libro.getAutor().getId_autor());
            ps.setInt(3, libro.getGenero().getId_genero());
            ps.setInt(4, libro.getAnio_publicacion());
            ps.setBoolean(5, libro.isEstado_disponible());
            
            ps.executeUpdate(); // Ejecuta la inserción
            LOGGER.info("Libro insertado correctamente en la base de datos.");
        }catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error de insertar");

		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				// el mensaje y el objeto exception
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}
	
	public void actualizarEstado(int id_libro, boolean nuevo_estado) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConexionBDD.conectar();
            String sql = "UPDATE libros SET estado_disponible = ? WHERE id_libro = ?";
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, nuevo_estado);
            ps.setInt(2, id_libro);
            ps.executeUpdate();
            LOGGER.info("Estado del libro ID " + id_libro + " actualizado.");
        } catch (Exception e) {
			LOGGER.error("Error al actualizar", e); // Registramos el error detallado 
			throw new Exception("Error al actualizar la persona"); // Lanzamos excepción al test
		} finally {
			// El bloque finally garantiza que la conexión se cierre siempre 
			try {
				if (con != null) {
					con.close(); // Cerramos la conexión para liberar recursos
				}
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos al cerrar", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
}